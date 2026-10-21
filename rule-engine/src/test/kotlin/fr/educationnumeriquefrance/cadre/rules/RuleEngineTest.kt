package fr.educationnumeriquefrance.cadre.rules

import java.time.*
import kotlin.test.*

class RuleEngineTest {
    private val monday = Instant.parse("2026-10-19T10:00:00Z")
    private fun context(action: Action = Action.OPEN_APP, at: Instant = monday,
        child: String = "child-a", app: String? = "game", contact: String? = null,
        domain: String? = null, zone: ZoneId = ZoneId.of("UTC")) =
        Context(child, action, at, zone, appId = app, contactId = contact, domain = domain)
    private fun rule(id: String = "r", effect: Effect = Effect.DENY, priority: Int = 0,
        approved: Boolean = true, scope: Scope = Scope(), expires: Instant? = null,
        window: Window? = null, action: Action = Action.OPEN_APP, alert: Alert? = null) =
        Rule(id, "child-a", action, effect, "Family decision: "+id, scope, priority,
            window, expiresAt = expires, approvedByParent = approved, alert = alert)

    @Test fun unapprovedRecommendationNeverApplies() {
        val r = rule(approved = false)
        Recommendation("family-decision", r)
        assertEquals(Status.NO_RULE, RuleEngine(listOf(r)).evaluate(context(), Capability.SUPPORTED).status)
    }
    @Test fun otherChildNeverInheritsRule() {
        assertNull(RuleEngine(listOf(rule())).evaluate(context(child="child-b"), Capability.SUPPORTED).desiredEffect)
    }
    @Test fun denialWinsTieRegardlessOfInputOrder() {
        val a = rule("a", Effect.ALLOW)
        val d = rule("d")
        for (rules in listOf(listOf(a,d), listOf(d,a))) {
            val result = RuleEngine(rules).evaluate(context(), Capability.SUPPORTED)
            assertEquals(Effect.DENY, result.desiredEffect)
            assertEquals(listOf("d"), result.matchedRuleIds)
        }
    }
    @Test fun approvedTemporaryExceptionExpiresAtExactBoundary() {
        val expiry = monday.plusSeconds(1800)
        val e = RuleEngine(listOf(rule("base"), rule("extension", Effect.ALLOW, 10, expires=expiry)))
        assertEquals(Effect.ALLOW, e.evaluate(context(at=expiry.minusNanos(1)), Capability.SUPPORTED).desiredEffect)
        assertEquals(Effect.DENY, e.evaluate(context(at=expiry), Capability.SUPPORTED).desiredEffect)
    }
    @Test fun overnightWindowUsesPreviousStartDay() {
        val w = Window(setOf(DayOfWeek.MONDAY), LocalTime.of(22,0), LocalTime.of(7,0))
        assertTrue(w.contains(context(at=Instant.parse("2026-10-20T06:59:59Z"))))
        assertFalse(w.contains(context(at=Instant.parse("2026-10-20T07:00:00Z"))))
        assertFalse(w.contains(context(at=Instant.parse("2026-10-19T06:00:00Z"))))
    }
    @Test fun schoolWindowUsesFamilyZoneNotServerZone() {
        val w = Window(setOf(DayOfWeek.MONDAY), LocalTime.of(8,0), LocalTime.of(9,0))
        assertTrue(w.contains(context(at=Instant.parse("2026-10-19T06:30:00Z"), zone=ZoneId.of("Europe/Paris"))))
        assertFalse(w.contains(context(at=Instant.parse("2026-10-19T06:30:00Z"))))
    }
    @Test fun contactAndDirectionAreIndependent() {
        val r = rule(action=Action.SEND_IMAGE, scope=Scope(contactId="parent"))
        val e = RuleEngine(listOf(r))
        assertEquals(Effect.DENY, e.evaluate(context(Action.SEND_IMAGE, contact="parent"), Capability.SUPPORTED).desiredEffect)
        assertEquals(Status.NO_RULE, e.evaluate(context(Action.RECEIVE_IMAGE, contact="parent"), Capability.SUPPORTED).status)
        assertEquals(Status.NO_RULE, e.evaluate(context(Action.SEND_IMAGE, contact="friend"), Capability.SUPPORTED).status)
    }
    @Test fun domainMatchDoesNotAuthorizeDeceptiveSuffix() {
        val e = RuleEngine(listOf(rule(effect=Effect.ALLOW, action=Action.OPEN_SITE, scope=Scope(domain="example.org"))))
        assertEquals(Effect.ALLOW, e.evaluate(context(Action.OPEN_SITE, domain="EXAMPLE.ORG"), Capability.SUPPORTED).desiredEffect)
        assertEquals(Status.NO_RULE, e.evaluate(context(Action.OPEN_SITE, domain="example.org.evil.test"), Capability.SUPPORTED).status)
    }
    @Test fun capabilitiesNeverMasqueradeAsActiveProtection() {
        val e = RuleEngine(listOf(rule()))
        for (cap in Capability.entries.filter { it != Capability.SUPPORTED }) {
            val d = e.evaluate(context(), cap)
            assertFalse(d.canAttemptEnforcement)
            assertEquals(Effect.DENY, d.desiredEffect)
        }
        assertTrue(e.evaluate(context(), Capability.SUPPORTED).canAttemptEnforcement)
    }
    @Test fun leastInterruptiveNotificationWinsTie() {
        val e = RuleEngine(listOf(
            rule("sound", Effect.ALLOW, action=Action.NOTIFICATION, alert=Alert.SOUND),
            rule("badge", Effect.ALLOW, action=Action.NOTIFICATION, alert=Alert.BADGE)))
        assertEquals(Alert.BADGE, e.evaluate(context(Action.NOTIFICATION), Capability.SUPPORTED).alert)
    }
    @Test fun duplicateIdsAreRejected() {
        assertFailsWith<IllegalArgumentException> { RuleEngine(listOf(rule(),rule())) }
    }
    @Test fun invalidExpiryAndImplicitNotificationStyleAreRejected() {
        assertFailsWith<IllegalArgumentException> {
            Rule("bad","child-a",Action.OPEN_APP,Effect.ALLOW,"why",
                validFrom=monday,expiresAt=monday)
        }
        assertFailsWith<IllegalArgumentException> {
            rule(effect=Effect.ALLOW,action=Action.NOTIFICATION)
        }
    }
}

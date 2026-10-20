package fr.educationnumeriquefrance.cadre.rules

import java.time.DayOfWeek
import java.time.Instant
import java.time.LocalTime
import java.time.ZoneId

enum class Action { OPEN_APP, ADD_CONTACT, SEND_TEXT, RECEIVE_TEXT, SEND_IMAGE, RECEIVE_IMAGE,
    SEND_AUDIO, RECEIVE_AUDIO, SEND_VIDEO, RECEIVE_VIDEO, SEND_DOCUMENT, RECEIVE_DOCUMENT,
    AUDIO_CALL, VIDEO_CALL, CAMERA, MICROPHONE, NOTIFICATION, OPEN_SITE }
enum class Effect { ALLOW, DENY }
enum class Alert { NONE, BADGE, SILENT, VIBRATE, SOUND }
enum class Capability { SUPPORTED, PERMISSION_MISSING, UNAVAILABLE, UNVERIFIED, SIMULATED }
enum class Status { READY, NO_RULE, PERMISSION_MISSING, UNAVAILABLE, UNVERIFIED, SIMULATED }

data class Context(
    val childId: String,
    val action: Action,
    val at: Instant,
    val zone: ZoneId,
    val appId: String? = null,
    val contactId: String? = null,
    val mode: String? = null,
    val domain: String? = null
) {
    init { require(childId.isNotBlank()) }
}

/** Days belong to the window's start date; end is exclusive, including overnight windows. */
data class Window(val days: Set<DayOfWeek>, val start: LocalTime, val end: LocalTime) {
    init { require(days.isNotEmpty()); require(start != end) { "Use no window for all day" } }
    fun contains(context: Context): Boolean {
        val local = context.at.atZone(context.zone)
        val time = local.toLocalTime()
        if (start < end) return local.dayOfWeek in days && time >= start && time < end
        return (local.dayOfWeek in days && time >= start) ||
            (local.minusDays(1).dayOfWeek in days && time < end)
    }
}

data class Scope(
    val appId: String? = null,
    val contactId: String? = null,
    val mode: String? = null,
    val domain: String? = null
) {
    init { require(listOf(appId, contactId, mode, domain).all { it == null || it.isNotBlank() }) }
    fun matches(c: Context) =
        (appId == null || appId == c.appId) &&
        (contactId == null || contactId == c.contactId) &&
        (mode == null || mode == c.mode) &&
        (domain == null || domain.equals(c.domain, ignoreCase = true))
}

data class Rule(
    val id: String,
    val childId: String,
    val action: Action,
    val effect: Effect,
    val explanation: String,
    val scope: Scope = Scope(),
    val priority: Int = 0,
    val window: Window? = null,
    val validFrom: Instant? = null,
    val expiresAt: Instant? = null,
    val approvedByParent: Boolean = false,
    val alert: Alert? = null
) {
    init {
        require(id.isNotBlank() && childId.isNotBlank() && explanation.isNotBlank())
        require(validFrom == null || expiresAt == null || validFrom < expiresAt)
        require(alert == null || action == Action.NOTIFICATION)
        require(action != Action.NOTIFICATION || effect != Effect.ALLOW || alert != null) {
            "An allowed notification needs an explicit alert style"
        }
    }
    fun matches(c: Context): Boolean = approvedByParent &&
        childId == c.childId && action == c.action && scope.matches(c) &&
        (validFrom == null || c.at >= validFrom) &&
        (expiresAt == null || c.at < expiresAt) &&
        (window == null || window.contains(c))
}

data class Decision(
    val desiredEffect: Effect?,
    val alert: Alert?,
    val status: Status,
    val matchedRuleIds: List<String>,
    val explanations: List<String>
) {
    /** READY means the adapter can attempt a command, NOT that Android has enforced it. */
    val canAttemptEnforcement: Boolean get() = desiredEffect != null && status == Status.READY
}

class RuleEngine(rules: List<Rule>) {
    private val rules = rules.toList()
    init { require(rules.map { it.id }.distinct().size == rules.size) { "Duplicate rule ID" } }

    fun evaluate(c: Context, capability: Capability): Decision {
        val candidates = rules.filter { it.matches(c) }
        if (candidates.isEmpty()) return Decision(null, null, Status.NO_RULE, emptyList(),
            listOf("No approved matching rule; no default authorization inferred."))
        val priority = candidates.maxOf { it.priority }
        val top = candidates.filter { it.priority == priority }
        // No implicit specificity ordering: explicit priority, deny wins a tie.
        val selected = if (top.any { it.effect == Effect.DENY })
            top.filter { it.effect == Effect.DENY } else top
        val sorted = selected.sortedBy { it.id }
        val effect = sorted.first().effect
        // For equal-priority allowed notification rules, least interruptive style wins.
        val alert = if (c.action != Action.NOTIFICATION) null
            else if (effect == Effect.DENY) Alert.NONE
            else sorted.mapNotNull { it.alert }.minByOrNull { it.ordinal }
        val status = when (capability) {
            Capability.SUPPORTED -> Status.READY
            Capability.PERMISSION_MISSING -> Status.PERMISSION_MISSING
            Capability.UNAVAILABLE -> Status.UNAVAILABLE
            Capability.UNVERIFIED -> Status.UNVERIFIED
            Capability.SIMULATED -> Status.SIMULATED
        }
        return Decision(effect, alert, status, sorted.map { it.id }, sorted.map { it.explanation })
    }
}

/** An explainable suggestion cannot become an approved rule merely by being generated. */
data class Recommendation(val decisionId: String, val proposedRule: Rule) {
    init { require(decisionId.isNotBlank()); require(!proposedRule.approvedByParent) }
}

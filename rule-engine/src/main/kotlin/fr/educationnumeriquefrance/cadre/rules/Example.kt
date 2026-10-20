package fr.educationnumeriquefrance.cadre.rules

import java.time.Instant
import java.time.ZoneId

/** Fictional data only; this program never connects to or controls a phone. */
fun main() {
    val now = Instant.parse("2026-10-20T15:00:00Z")
    val rules = listOf(
        Rule("base", "example-child", Action.OPEN_APP, Effect.DENY,
            "Le jeu n'est pas ouvert dans le cadre actuel",
            scope = Scope(appId = "example.game"), approvedByParent = true),
        Rule("extension", "example-child", Action.OPEN_APP, Effect.ALLOW,
            "Extension parentale de trente minutes",
            scope = Scope(appId = "example.game"), priority = 10,
            validFrom = now, expiresAt = now.plusSeconds(1800), approvedByParent = true)
    )
    val engine = RuleEngine(rules)
    for (seconds in listOf(0L, 1800L)) {
        val context = Context("example-child", Action.OPEN_APP, now.plusSeconds(seconds),
            ZoneId.of("Europe/Paris"), appId = "example.game")
        val result = engine.evaluate(context, Capability.UNVERIFIED)
        println("t=+"+seconds+"s desired="+result.desiredEffect+
            " capability="+result.status+" mayAttempt="+result.canAttemptEnforcement)
        println(result.explanations.joinToString("; "))
    }
}

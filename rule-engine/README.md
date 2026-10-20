# Moteur de règles CADRE — module JVM exécutable

Ce module Kotlin indépendant d’Android calcule les décisions ; il ne commande aucun téléphone et n’est pas encore raccordé à l’APK. Il sert de brique utilisable pour #3, à intégrer après revue. Pas de changement à MainActivity ou à la mission #11.

## Exécuter
JDK 17 et Gradle 8.9 : `gradle -p rule-engine test build`.
La sortie JAR est dans `rule-engine/build/libs/`. Les rapports de test sont dans `build/reports/tests/test/`. Le workflow rule-engine vérifie ce module sans SDK Android.

## Contrat public
Context identifie un enfant fictif, l’action, l’instant, la zone familiale et éventuellement app/contact/mode/domaine. Rule porte l’effet souhaité, sa portée, sa priorité, ses plages, sa validité, l’explication et l’approbation parentale.
RuleEngine.evaluate(context, capability) renvoie une Decision avec effet souhaité, forme de notification, raisons, règles sources et état de capacité.

Exemple :
```kotlin
val base = Rule("game-off", "child-a", Action.OPEN_APP, Effect.DENY,
    "Jeu fermé pendant cette période", scope = Scope(appId = "game"),
    approvedByParent = true)
val engine = RuleEngine(listOf(base))
val decision = engine.evaluate(
    Context("child-a", Action.OPEN_APP, java.time.Instant.now(),
        java.time.ZoneId.of("Europe/Paris"), appId = "game"),
    Capability.UNVERIFIED
)
check(decision.desiredEffect == Effect.DENY)
check(!decision.canAttemptEnforcement)
```

## Choix explicites du moteur
- Une recommandation générée n’est pas approuvée ; elle n’active pas une règle.
- Pas de règle correspondante = NO_RULE, jamais une autorisation implicite. L’adaptateur devra définir le traitement de cet état.
- Priorité numérique explicite ; interdiction prioritaire en cas d’égalité, sans priorité implicite de la portée la plus spécifique.
- À priorité égale pour des notifications autorisées, forme la moins intrusive.
- Fin de plage et expiration exclusives. Plage nocturne rattachée au jour de début.
- Domaine = correspondance exacte insensible à la casse ; l’appelant doit fournir un nom d’hôte normalisé, pas une URL. Pas d’autorisation implicite des sous-domaines.
- READY signifie seulement commande envisageable par un adaptateur de capacité vérifiée. Cela ne signifie jamais restriction active. Un accusé d’application et une vérification Android restent indispensables.
- Exceptions parents/secours à définir explicitement avec une priorité adéquate ; ce module ne dispose d’aucune identité familiale réelle.

## Hors de ce module
Persistance et migration, réseau, authentification parentale, validation de l’acteur approuvant, quotas mesurés, permissions Android et exécution des restrictions. Le booléen approvedByParent est une donnée de modèle, pas une barrière de sécurité. L’enfant ne doit jamais pouvoir le fixer lui-même dans l’application intégrée. Les listes/snapshots doivent être gérés par le propriétaire d’état.
Pas d’analyse de contenus privés, pas de collection d’informations réelles d’enfants.

Les choix de priorité sont documentés pour revue ; aucune fonction produit ni aucune restriction universelle n’est annoncée par ce module.

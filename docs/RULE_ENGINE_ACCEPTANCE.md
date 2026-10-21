# Recette du moteur et de son intégration

Les tests automatisés Kotlin sont exécutables via `gradle -p rule-engine test`. Aucun test Android physique n’est prétendu réalisé par ce document.

| Cas | Attendu | Niveau |
|---|---|---|
| Recommandation non approuvée | NO_RULE ; aucune autorisation déduite | Automatisé JVM |
| Autre profil enfant | Pas d’héritage accidentel | Automatisé JVM |
| Conflit même priorité | DENY, résultat stable quel que soit l’ordre | Automatisé JVM |
| Exception temporaire | ALLOW avant échéance ; retour DENY à l’instant exact | Automatisé JVM |
| Nuit lundi/mardi | Jour de début respecté ; fin exclusive | Automatisé JVM |
| Heure familiale | Europe/Paris distinct de l’heure serveur UTC | Automatisé JVM |
| Contact et direction | Recevoir/envoi et contacts traités séparément | Automatisé JVM |
| Domaine trompeur | example.org.evil.test non autorisé par example.org | Automatisé JVM |
| Permission absente ou capacité inconnue | Effet souhaité conservé, commande non envisageable | Automatisé JVM |
| Styles de notification en conflit | Le moins intrusif à priorité égale | Automatisé JVM |
| Identifiants dupliqués | Rejet | Automatisé JVM |
| Expiration invalide / style implicite | Rejet | Automatisé JVM |
| Enfant tente d’approuver | Rejet par couche d’authentification | À implémenter/tester Android |
| Commande Android refusée | Pas d’état actif ; cause et retour proposés | À implémenter/tester Android |
| Persistance/migration | Décisions conservées, validation non inventée | À implémenter/tester intégration |
| Perte réseau/reprise | État/version de règle visibles, aucun accès excessif | À implémenter/tester intégration |
| Révocation/retrait | Restrictions retirées selon procédure parentale | À implémenter/tester Android |

Pour chaque essai intégré : version/commit, modèle et OS, mode de gestion, permissions, étapes, attendu, observé, statut et anomalie. Les autres onze familles restent suivies par #10 et ne sont pas réputées couvertes par ces seuls tests.

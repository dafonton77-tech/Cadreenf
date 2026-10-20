# Scénarios de référence — à développer et tester

Ces scénarios décrivent le résultat recherché. **Aucun n’est déclaré exécuté ou réussi.** Le périmètre du premier pilote reste à valider. Ils complètent la future matrice #10, sans la remplacer.

| Scénario | Parcours | Attendu et preuve |
|---|---|---|
| Installation | Parent installe, voit les limites et configure les rôles | Prérequis compréhensibles ; aucune protection active annoncée sans vérification |
| Appairage | Parent associe un appareil enfant, puis révoque l’association | Seul le parent autorisé configure ; ancienne association invalidée ; aucun secret dans les journaux |
| Mode école | Parent sélectionne des apps et plages ; enfant consulte la règle | Priorités et exceptions explicites ; efficacité constatée uniquement dans le périmètre Android supporté |
| Mode apprentissage | Parent autorise les outils utiles et règle un quota | Changement de mode déterministe, données conservées au redémarrage ; fonction indisponible signalée |
| Mode divertissement | Enfant utilise une app ; rappel au seuil configuré, par exemple 10 minutes | Mesure définie et rappel vérifiable ; ne pas prétendre avoir détecté du scroll |
| Extension | Enfant demande 30 minutes pour lecture/devoirs/aide ; parent confirme ou refuse | Activité confirmée humainement ; durée temporaire, expiration et restauration testées |
| Liste de sites | Parent approuve un domaine ; enfant essaie un site autorisé puis refusé | Résultats testés dans le navigateur/périmètre retenu ; autres apps non couvertes identifiées |
| Permission retirée | Autorisation refusée ou révoquée | État exact et explication ; pas de faux indicateur de protection active |
| Déconnexion | Règle change quand appareil hors ligne puis reconnecté | Règle locale et état de synchronisation visibles ; stratégie de reprise documentée |
| Rapport | Parent consulte une période et supprime les données | Valeurs comparées à un usage de test ; aucun message/photo/vidéo/audio privé collecté |
| Retour parent | Parent décrit bug, besoin ou astuce depuis l’app | Parcours simple ; données techniques volontaires ; aucune identité d’enfant nécessaire |
| Retrait | Famille arrête le test et retire les restrictions | Étapes documentées, état restauré dans le mode supporté, suppression vérifiable |

Pour chaque exécution : identifiant du scénario, version/commit, modèle et OS, mode de gestion, permissions, étapes, attendu, observé, résultat réussi/échoué/non testé, limite et lien de bug. Utiliser des données fictives. Ne pas tenter Device Owner sur le téléphone principal.

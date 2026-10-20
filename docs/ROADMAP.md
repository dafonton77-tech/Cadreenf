# Feuille de route CADRE

## Finalité
Livrer un contrôle parental Android adapté aux usages actuels des jeunes, gratuit pour les parents, qui protège et accompagne une autonomie progressive. La vision complète reste dans le [cahier des charges](CAHIER_DES_CHARGES.md) et le [registre](FEATURE_REGISTER.md). La première livraison en est une étape et ne remplace pas cette vision.

## 1. Stabiliser la première livraison
- Parcours : besoins initiaux → charte/contrat → décisions par famille de sujets → recommandations expliquées → validation parentale → état réel des contrôles.
- Mettre à disposition les références pédagogiques vérifiées, avec leurs droits distincts.
- Choisir explicitement les contrôles du pilote selon une évaluation technique, sans retirer les autres demandes du registre.
- Préciser les modèles/versions Android, le mode d’installation et les prérequis acceptables pour des familles.
- Décrire les décisions restantes ; aucun abandon ou ajout majeur implicite.

## 2. Construire le parcours et le moteur de règles
Implémenter les écrans parent/enfant, persistance, règles typées, recommandations explicables et progression des droits. Le contrat et la charte interviennent dès ce parcours, pas dans une phase finale.
Le mode apprentissage organise des moments choisis pour apprendre avec les outils numériques.
Missions : #3, #13, #17. Le laboratoire #4 permet d’essayer les parcours sur un appareil mais ne prouve aucun contrôle distant.

## 3. Relier et appliquer
Implémenter appairage, synchronisation, révocation, états hors ligne, puis les contrôles du pilote retenus.
Missions : #2 (architecture), #5 (capacités), #6 (web), #15/#16 (qualification ciblée), #19 (intégration réelle).
Traiter les capacités à risque tôt, avant de faire dépendre toute l’architecture d’une hypothèse non vérifiée.

## 4. Vérifier et proposer aux parents volontaires
Build reproductible, tests fonctionnels et sécurité, documentation d’installation/retrait, APK identifiée par version/commit, parcours de retour accessible.
Missions : #1, #7, #9, #10, #11, #18. La mission #11 garde son périmètre convenu.
Le pilote est gratuit et proposé lors des conférences ENF après validation technique. Les retours alimentent bugs, besoins et nouvelles versions.

## Réception — mission #12
- Parcours familial et validation des recommandations démontrés.
- Appairage, règles synchronisées et fonctions de la livraison convenue réellement testées ; état indisponible/permission manquante/simulé correctement affiché. Un seul contrôle démontré ne vaut pas réalisation de la vision complète.
- Révocation, déconnexion/reprise, redémarrage et retrait testés.
- Deux configurations Android documentées ; compatibilités non vérifiées signalées.
- Aucune anomalie critique connue laissée sans traitement avant diffusion.
- Limites, confidentialité, aide et procédure de retour expliquées aux familles.

Le nombre d’issues fermées ne constitue pas une preuve de livraison. Les onze familles restent la cible et chacune est reliée à des missions. Toute livraison partielle et tout report doivent être explicitement acceptés par le porteur avant diffusion, avec les écarts conservés dans le suivi. Aucun report n’est décidé par ce document.

## Réserve d’idées
Le forum est reporté après le pilote. La friction des icônes, les messages urgents et l’IA ne font pas partie des travaux prioritaires. La sélection du pilote ne supprime pas la vision plus large. La licence MIT est déjà publiée ; la gouvernance restante est suivie dans #8.

## Correspondance complète après validation des onze familles

| Famille validée | Missions responsables |
|---|---|
| 1. Cadre familial | #3, #17 |
| 2. Progression et demandes | #3, #13, #17, #25 |
| 3. Applications et durées | #3, #5, #13, #25 |
| 4. Modes et rappels | #13, #14 |
| 5. Contacts et échanges | #5, #20 |
| 6. Notifications | #5, #21 |
| 7. Caméra, micro et partage | #5, #15, #20 |
| 8. Navigation et filtrage | #5, #6, #16 |
| 9. Lieux et habitudes | #5, #13, #17, #23 |
| 10. Rapports et fonctionnement protégé | #2, #19, #22, #24, #26 |
| 11. Pilote, qualité et retours | #1, #7, #9, #10, #11, #18, #26, #27 |

#20 contacts ; #21 notifications ; #22 protection ; #23 localisation ; #24 rapports ; #25 demandes ; #26 revue sécurité ; #27 intégration et APK. Les lots précédemment regroupés dans #15/#17 sont maintenant séparés. #11 conserve son périmètre accepté. La mission #12 suit l’ordre et la réception, sans imposer qu’un numéro d’issue soit un ordre chronologique.

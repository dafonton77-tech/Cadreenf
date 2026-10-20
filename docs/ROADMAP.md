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
- Appairage et règle synchronisée, au moins un contrôle réel convenu et testé ; état indisponible/permission manquante/simulé correctement affiché.
- Révocation, déconnexion/reprise, redémarrage et retrait testés.
- Deux configurations Android documentées ; compatibilités non vérifiées signalées.
- Aucune anomalie critique connue laissée sans traitement avant diffusion.
- Limites, confidentialité, aide et procédure de retour expliquées aux familles.

Le nombre d’issues fermées ne constitue pas une preuve de livraison. Les demandes d’extension, rapports et filtrage additionnel restent des lots possibles ; ils ne deviennent pas obligatoires pour le premier pilote sans décision explicite.

## Réserve d’idées
Le forum est reporté après le pilote. La friction des icônes, les messages urgents et l’IA ne font pas partie des travaux prioritaires. La sélection du pilote ne supprime pas la vision plus large. La licence MIT est déjà publiée ; la gouvernance restante est suivie dans #8.

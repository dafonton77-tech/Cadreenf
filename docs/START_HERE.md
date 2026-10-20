# Bien démarrer sur CADRE

CADRE vise un contrôle parental Android éducatif, modulaire et accompagnant. La première cible est un pilote fonctionnel gratuit proposé à des parents volontaires lors des conférences ENF. Le prototype actuel n’est pas prêt à protéger un enfant.

## Parcours de lecture
1. [Présentation](../README.md) : finalité, état actuel et engagement bénévole.
2. [Cahier des charges](CAHIER_DES_CHARGES.md) et [registre des demandes](FEATURE_REGISTER.md) : demandes connues et limites, sans les réduire au premier pilote.
3. [Faisabilité Android](FAISABILITE_ANDROID.md) : vérifier chaque capacité avant de la promettre.
4. [Guide de développement](DEVELOPMENT.md), puis [scénarios](PILOT_SCENARIOS.md).
5. [Contribuer](../CONTRIBUTING.md), [sécurité](../SECURITY.md), [licence](../LICENSE) et [droits ENF](../NOTICE.md).

## Choisir un travail
Consultez les issues ouvertes et indiquez celle qui vous intéresse. #12 coordonne la livraison ; #13–#19 couvrent des lots de réalisation. #9 concerne le guide de compilation, #10 la matrice de tests, #11 les textes/accessibilité. Ce document les complète sans reprendre leur mission. Proposez une petite PR vérifiable ; signalez les dépendances et besoins d’arbitrage.

## Versions constatées dans les fichiers du dépôt le 20 octobre 2026
- JDK 17 ; Gradle 8.9 dans le workflow GitHub Actions.
- Plugin Android 8.7.3 ; Kotlin 2.0.21.
- compileSdk 35, targetSdk 34, minSdk 28 ; version applicative 0.1.0.
- Commande du workflow : `gradle --no-daemon assembleDebug`.
- Sortie prévue : `app/build/outputs/apk/debug/app-debug.apk`.
Ces informations viennent des configurations lues, pas d’une compilation exécutée pendant la rédaction. Suivre les fichiers Gradle et le workflow s’ils évoluent. Ne pas supposer que Gradle Wrapper est présent. Les instructions locales reproductibles restent suivies dans #9.

## Pour la mission #11
Examiner MainActivity.kt ; externaliser les textes dans strings.xml, clarifier les libellés et avertissements, vérifier lisibilité et accessibilité. Ne pas modifier les autorisations ni les mécanismes de contrôle. Fournir la commande et le résultat du build, des captures sans données personnelles ou une description avant/après, et les limites de test. Ne pas transformer une fonction simulée en fonction présentée comme active.

## Ce qu’il faut joindre à une PR
- Issue et demande du registre concernées.
- Comportement avant/après et portée exacte.
- Commandes exécutées et résultats, ou mention explicite non testé.
- Appareil/version Android/permissions pour les contrôles réels.
- Limites connues et procédure de retour à l’état initial.
- Aucune donnée familiale, aucun contenu privé ni secret.

## Ressources à ne pas publier
Ne jamais transmettre la clé privée de signature, ses mots de passe, jetons ou données d’enfants aux contributeurs. Une APK debug peut servir à un essai technique identifié ; elle ne prouve pas l’efficacité des contrôles. Livre, questionnaire et supports pédagogiques ENF ne sont pas automatiquement sous MIT : fournir seulement les extraits nécessaires après validation des droits. Les captures existantes doivent être retrouvées, vérifiées et anonymisées avant tout ajout.

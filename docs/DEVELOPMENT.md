# Guide de développement Android

## Dépôt

Projet Android Kotlin expérimental. Les fichiers Gradle sont à la racine et dans `app/`. Un workflow GitHub Actions génère un APK de débogage.

## Préparation

- Android Studio récent, JDK compatible avec la configuration Gradle du dépôt, SDK Android requis.
- Ouvrir le dossier racine comme projet Gradle.
- Synchroniser Gradle et compiler la variante debug.
- Sur GitHub, consulter l'onglet Actions et le workflow `Build CADRE APK`.

**Note :** le dépôt ne contient pas nécessairement de Gradle Wrapper (`gradlew`). Vérifier les versions du workflow et installer Gradle localement si nécessaire. Ne pas annoncer de compilation locale validée sans l'avoir exécutée.

## Zones du prototype

- `MainActivity.kt` : interface expérimentale, préférences et appels DevicePolicyManager.
- `CadreAdminReceiver.kt` : récepteur d'administration.
- `AndroidManifest.xml` : activités et récepteur.
- `.github/workflows/build-apk.yml` : compilation.

## Tests de sécurité

- Ne pas activer Device Owner sur un appareil personnel principal.
- Préférer un appareil de test dédié ou un émulateur pour les privilèges élevés.
- Ne pas considérer la sauvegarde d'un interrupteur comme un contrôle effectif.
- Les tests doivent identifier modèle, version Android, privilèges, résultat observé et étapes reproductibles.

## Définition de terminé

Une fonction est terminée seulement si son comportement, sa sécurité, ses limites, sa documentation et ses tests sont vérifiés. Sinon, indiquer `prototype`, `simulé` ou `non testé`.

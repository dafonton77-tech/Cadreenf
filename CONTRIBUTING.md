# Contribuer à CADRE / Contributing

Merci de votre intérêt pour ce projet éducatif. **Les contributions sont bénévoles.**

## Avant de commencer

1. Lisez [le cahier des charges](docs/CAHIER_DES_CHARGES.md), [la faisabilité Android](docs/FAISABILITE_ANDROID.md) et [la feuille de route](docs/ROADMAP.md).
2. Consultez les [issues](../../issues) et commentez celle qui vous intéresse pour éviter les doublons.
3. Pour un changement important, proposez d'abord une approche technique et les limites Android concernées.
4. Soumettez une Pull Request ciblée avec explications, captures si nécessaire, et procédure de test reproductible.

## Priorités

- Audit du prototype et tests reproductibles.
- Architecture parent/enfant et modèle de règles.
- Étude de faisabilité des contrôles selon le type de gestion Android.
- Sécurité, consentement, minimisation des données.
- Automatisation des tests et accessibilité.

## Qualité attendue

- Kotlin idiomatique, code lisible et changements limités à la mission.
- Aucun privilège système supposé disponible sans vérification.
- Pas de contournement des protections Android, ni d'API privées, ni d'accessibilité détournée.
- Pas de collecte de contenu privé (messages, photos, audio, frappes, écran).
- Pas de secret, jeton, clé privée ou donnée personnelle dans le dépôt.
- Indiquer clairement : **testé**, **non testé**, **simulation** et **limitations**.
- Ne jamais présenter un interrupteur d'interface comme une restriction effective sans preuve.

## Licence et droits

Le **code source est publié sous licence MIT** ([LICENSE](LICENSE)). En soumettant une contribution de code, vous acceptez qu'elle soit distribuée sous MIT et certifiez disposer des droits nécessaires. Les marques, logos et contenus pédagogiques préexistants ENF ne sont pas couverts automatiquement ([NOTICE.md](NOTICE.md)). Ne copiez pas de code tiers sans licence compatible.

## Langues

Français ou anglais bienvenus. Les interfaces destinées aux familles seront d'abord en français.

## Sécurité

Pour une vulnérabilité potentielle, lisez [SECURITY.md](SECURITY.md) et ne publiez pas de données sensibles dans une issue.

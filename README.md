# CADRE — Contrôle parental éducatif | Éducation Numérique France

> **Statut : prototype Android expérimental v0.1 — contributions bénévoles bienvenues.** L'application n'est **pas** un contrôle parental fonctionnel ni un produit prêt à protéger un enfant.

**CADRE** est un projet de contrôle parental Android associant protections techniques, dialogue familial et autonomie progressive. Philosophie : **Comprendre · Encadrer · Protéger**. Les restrictions doivent être compréhensibles, proportionnées, explicites et réévaluables.

🌍 **[English overview](docs/PROJECT_OVERVIEW_EN.md)** · 📘 [Fonctionnalités](docs/CAHIER_DES_CHARGES.md) · 🧭 [Feuille de route](docs/ROADMAP.md) · 🤝 [Contribuer](CONTRIBUTING.md) · 🛡️ [Sécurité](SECURITY.md) · ⚖️ [Faisabilité Android](docs/FAISABILITE_ANDROID.md)

## Ce qui existe aujourd'hui

- Projet Android natif Kotlin avec compilation automatisée GitHub Actions.
- Écran expérimental de préférences locales pour six droits numériques (sans application des restrictions aux apps tierces).
- Essai de désactivation de caméra via DevicePolicyManager (nécessite les autorisations adaptées ; **non validé sur appareil**).
- Essai de suspension d'application via DevicePolicyManager (requiert **Device Owner** ; **non validé**).
- Premier APK compilé et ouvert par le porteur du projet. **Cela ne prouve pas que les contrôles fonctionnent.**

**Non développés :** application parent/enfant, appairage, synchronisation, filtrage web, horaires, rapports d'usage, demandes d'autorisation, gestion des comptes, chiffrement applicatif, tests de sécurité, interface de production.

## Impact social et objectifs de développement durable

CADRE contribue à l'**ODD 4 — Éducation de qualité**, en accompagnant la littératie numérique et l'esprit critique, et à l'**ODD 16 — Paix, justice et institutions efficaces**, par la sensibilisation à la citoyenneté numérique, au respect d'autrui et à la prévention du cyberharcèlement. Il s'agit d'une orientation de projet, non d'une certification officielle.

## Notre objectif

Construire un outil Android **réaliste, transparent et respectueux de la vie privée**, où les parents définissent des règles et les enfants comprennent leurs droits, responsabilités et possibilités de progression. Aucune lecture clandestine des conversations, aucun keylogging, aucun enregistrement d'écran ou interception des photos/messages privés.

**Nous ne promettons pas** le blocage sélectif des photos, liens ou vidéos à l'intérieur de toutes les messageries tierces : Android ne donne pas un tel contrôle universel.

## Participer bénévolement

Nous recherchons des développeurs Android/Kotlin, architectes, spécialistes réseau/sécurité, UX, QA et documentation. Commencez par les [issues ouvertes](../../issues), en particulier les missions [good first issue](../../issues?q=is%3Aissue+is%3Aopen+label%3A%22good+first+issue%22) pour débuter. Lisez [CONTRIBUTING.md](CONTRIBUTING.md) avant une Pull Request.

**Contribution volontaire, sans rémunération garantie.** Le **code source est sous licence MIT** : consultez [LICENSE](LICENSE) et [NOTICE.md](NOTICE.md). Les marques, logos et contenus pédagogiques préexistants d'ENF ne sont pas automatiquement licenciés. Les contributions de code sont bienvenues sous MIT.

## Pour les familles

**Ne pas installer ce prototype comme dispositif de protection d'un enfant.** Ne pas essayer d'activer Device Owner sur un téléphone personnel utilisé au quotidien : la procédure peut exiger une réinitialisation et entraîner une perte de données.

## Organisation

Projet porté dans le cadre de la démarche **Éducation Numérique France (ENF)**. Les modalités de gouvernance et de licence sont à formaliser. Le présent dépôt est un espace de développement expérimental, pas une publication commerciale.

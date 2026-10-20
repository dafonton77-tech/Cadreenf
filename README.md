# CADRE — Contrôle parental éducatif | Éducation Numérique France

> **Statut : prototype Android expérimental v0.1 — contributions bénévoles bienvenues.** L'application n'est **pas** un contrôle parental fonctionnel ni un produit prêt à protéger un enfant.

**CADRE** est un projet de contrôle parental Android associant protections techniques, dialogue familial et autonomie progressive. Philosophie : **Comprendre · Encadrer · Protéger**. Les restrictions doivent être compréhensibles, proportionnées, explicites et réévaluables.

🌍 **[English overview](docs/PROJECT_OVERVIEW_EN.md)** · 📘 [Fonctionnalités](docs/CAHIER_DES_CHARGES.md) · 🧭 [Feuille de route](docs/ROADMAP.md) · 🤝 [Contribuer](CONTRIBUTING.md) · 🛡️ [Sécurité](SECURITY.md) · ⚖️ [Faisabilité Android](docs/FAISABILITE_ANDROID.md)

## Notre ambition et le sens de l’engagement
CADRE vise un contrôle parental Android d’un nouveau genre : éducatif, modulaire et accompagnant. Il associe protections réglables, modes d’activité, prise de conscience des usages, dialogue familial et autonomie progressive. C’est une ambition de conception, pas une affirmation d’innovation unique ni de fonctions déjà disponibles.

La technologie occupe une place importante dans la vie familiale, sans qu’un professionnel puisse accompagner chaque foyer au quotidien. CADRE entend apporter des repères compréhensibles et des outils concrets, en complément du dialogue et de l’accompagnement humain.

Le projet s’inscrit dans la création de la future association Éducation Numérique France. Sa vocation est l’utilité sociale et l’intérêt collectif ; cela ne revendique aucun statut officiel d’intérêt général ou de reconnaissance d’utilité publique. L’objectif est de remettre gratuitement une première version Android fonctionnelle et testée à des parents volontaires lors des conférences, puis de l’améliorer avec leurs besoins et leurs expériences.

Nous recherchons un engagement bénévole concret : comprendre la finalité éducative, choisir une mission à sa mesure, échanger sur les choix, tester et documenter son travail, signaler les difficultés et prévenir en cas d’indisponibilité. Une contribution ponctuelle est bienvenue ; aucune durée ni disponibilité minimale n’est imposée. Les parents participent aussi aux choix et aux essais, sans compétence technique nécessaire.

La gratuité pour les parents est un objectif de diffusion du projet ; elle n’annule pas les coûts d’hébergement, de maintenance ou d’accompagnement à prévoir. Le code reste sous licence MIT ; les contenus pédagogiques, noms et logos restent distingués.

[Référentiel des demandes et états](docs/FEATURE_REGISTER.md) : aucune fonctionnalité ne doit disparaître par simplification.

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

## Mission de livraison : une application fonctionnelle

Nous recherchons des bénévoles pour **développer, intégrer et livrer une première version Android utilisable**, au-delà des études et de la documentation. La [mission globale #12](https://github.com/dafonton77-tech/Cadreenf/issues/12) définit les lots de réalisation et les critères de réception : appairage, règles synchronisées, restrictions réellement vérifiées, demandes d’extension, rapports minimaux et APK testées. Les onze premières missions contribuent à cet objectif ; leur clôture seule ne constitue pas une livraison. Le périmètre dépend des capacités Android validées et doit distinguer installation ordinaire et privilèges particuliers.

## Périmètre prioritaire validé — pilote Android gratuit
La première livraison vise une application Android fonctionnelle, remise gratuitement à des parents volontaires lors des conférences Éducation Numérique France pour une phase de test encadrée. Le prototype actuel ne doit pas être distribué comme une protection opérationnelle.

Les parents testeurs participent à l’amélioration : besoins réels, fonctions utiles ou manquantes, difficultés d’installation et d’utilisation, dysfonctionnements et propositions. Prévoir un moyen simple de retour accessible depuis l’application, sans forum intégré : type de retour, description, version de l’application et modèle/version Android, avec informations techniques transmises volontairement. Ne demander aucun contenu privé ni information identifiante sur les enfants ; anonymiser les éléments avant publication sur GitHub.

Organiser le cycle : version pilote identifiée → essais volontaires → retours → tri des bugs et besoins → corrections priorisées → nouvelle version → nouvelle vérification. Fournir une notice sur les fonctions validées, limites, retrait de l’application et procédure de signalement ; vérifier le parcours de retour avant le pilote.

Le périmètre exact des fonctions du premier pilote sera figé selon faisabilité et tests. Les lots ci-dessous sont une cible de développement, pas l’exigence de tout livrer avant un premier pilote limité. Aucun contrôle annoncé comme actif sans preuve. iOS, compatibilité universelle et forum communautaire sont hors du périmètre de cette première livraison.

Suivi : [mission #12](https://github.com/dafonton77-tech/Cadreenf/issues/12).

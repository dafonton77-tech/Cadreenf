# CADRE — Contrôle parental éducatif | Éducation Numérique France

> **Statut : prototype Android expérimental v0.1 — contributions bénévoles bienvenues.** L'application n'est **pas** un contrôle parental fonctionnel ni un produit prêt à protéger un enfant.

**CADRE** est un projet de contrôle parental Android associant protections techniques, dialogue familial et autonomie progressive. Philosophie : **Comprendre · Encadrer · Protéger**. Les restrictions doivent être compréhensibles, proportionnées, explicites et réévaluables.

🌍 **[English overview](docs/PROJECT_OVERVIEW_EN.md)** · 📘 [Fonctionnalités](docs/CAHIER_DES_CHARGES.md) · 🧭 [Feuille de route](docs/ROADMAP.md) · 🤝 [Contribuer](CONTRIBUTING.md) · 🛡️ [Sécurité](SECURITY.md) · ⚖️ [Faisabilité Android](docs/FAISABILITE_ANDROID.md)


## Parcours central à construire
Au premier lancement, la famille définit pourquoi l’enfant reçoit un téléphone, les usages initiaux et les conditions de progression. La charte pose les principes de respect, protection et responsabilité ; le contrat traduit les décisions familiales. Ils structurent la configuration, au lieu d’être des annexes.

CADRE propose des réglages expliqués à partir du cadre choisi ; le parent les ajuste et valide. L’application distingue décision familiale, recommandation et contrôle réellement actif. Les demandes de nouvelles fonctions permettent de réexaminer les droits ; un âge prévu n’ouvre pas automatiquement un droit.

Le mode apprentissage sert à programmer des moments choisis pour apprendre, découvrir ou développer une compétence avec le numérique. Il ne prescrit pas automatiquement des applications et ne prétend pas mesurer l’apprentissage.

Les exigences de conception comprennent la validation parentale de nouveaux contacts, les droits par contact et type d’échange (texte, images, photos, vocaux, appels, vidéo, envoi/réception), et les modalités de notification (pastille, affichage silencieux, vibration, son, plages et exceptions). Leur portée technique doit être qualifiée par application et mode Android ; aucun contrôle universel n’est promis. Une restriction limitée ne remplace pas silencieusement la demande initiale.

Priorité : construire une première version Android fonctionnelle et gratuite à tester avec des parents lors des conférences ENF. Ne pas étendre le pilote au forum, à la friction des icônes ou à un nouveau système de messages urgents. Contrat HTML et charte du livre identifiés, mais pas encore ajoutés au dépôt.

Contributeurs : choisissez une mission existante, indiquez le lot souhaité, puis proposez une Pull Request ciblée. Pas de prise en charge de tout le projet exigée.

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

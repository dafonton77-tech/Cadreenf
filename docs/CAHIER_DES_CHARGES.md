# CADRE — Cahier des charges fonctionnel (vision, non implémentée)

Ce document décrit des **objectifs de produit**, pas des fonctionnalités déjà disponibles. Chaque fonctionnalité devra faire l'objet d'une étude de faisabilité, d'un modèle de menace et de tests.

## Notre ambition et le sens de l’engagement
CADRE vise un contrôle parental Android d’un nouveau genre : éducatif, modulaire et accompagnant. Il associe protections réglables, modes d’activité, prise de conscience des usages, dialogue familial et autonomie progressive. C’est une ambition de conception, pas une affirmation d’innovation unique ni de fonctions déjà disponibles.

La technologie occupe une place importante dans la vie familiale, sans qu’un professionnel puisse accompagner chaque foyer au quotidien. CADRE entend apporter des repères compréhensibles et des outils concrets, en complément du dialogue et de l’accompagnement humain.

Le projet s’inscrit dans la création de la future association Éducation Numérique France. Sa vocation est l’utilité sociale et l’intérêt collectif ; cela ne revendique aucun statut officiel d’intérêt général ou de reconnaissance d’utilité publique. L’objectif est de remettre gratuitement une première version Android fonctionnelle et testée à des parents volontaires lors des conférences, puis de l’améliorer avec leurs besoins et leurs expériences.

Nous recherchons un engagement bénévole concret : comprendre la finalité éducative, choisir une mission à sa mesure, échanger sur les choix, tester et documenter son travail, signaler les difficultés et prévenir en cas d’indisponibilité. Une contribution ponctuelle est bienvenue ; aucune durée ni disponibilité minimale n’est imposée. Les parents participent aussi aux choix et aux essais, sans compétence technique nécessaire.

La gratuité pour les parents est un objectif de diffusion du projet ; elle n’annule pas les coûts d’hébergement, de maintenance ou d’accompagnement à prévoir. Le code reste sous licence MIT ; les contenus pédagogiques, noms et logos restent distingués.

## Suivi de toutes les demandes connues

Le [référentiel détaillé](FEATURE_REGISTER.md) complète les familles ci-dessous : modes école/apprentissage/divertissement, rappels de durée distincts du défilement, notifications, capteurs, appels/SMS, images/médias/liens/langage, protection, retours et communauté. Les demandes en conflit technique ou avec la confidentialité restent suivies sans promesse d’implémentation.

## A. Parent / enfant

- Deux rôles distincts ; appairage sécurisé ; révocation et réassociation.
- Gestion de plusieurs enfants, règles par profil et paliers d'âge.
- Tableau de bord parent ; état de synchronisation et transparence côté enfant.
- Mode laboratoire sur un seul appareil pour simuler les scénarios sans confondre simulation et contrôle réel.

## B. Applications et temps d'écran

- Inventaire des applications, autorisations par application, plages horaires (école, devoirs, repas, nuit).
- Durées maximales par application et catégorie, exceptions nécessaires.
- Demandes d'extension temporaire ; approbation/refus explicites ; historique.
- Rapports hebdomadaires et mensuels ; objectifs et tendances.
- Contrôle effectif conditionné aux API Android et au mode de gestion.

## C. Navigation

- Mode **liste blanche** : seuls les domaines approuvés sont accessibles dans un navigateur contrôlé.
- Étudier un filtrage DNS/VPN local transparent, ses limites (DoH, autres VPN, applications, navigateurs).
- Journaliser les refus sans historiser inutilement toute la navigation.
- Interdire certains liens *dans toutes les apps tierces* n'est pas garanti.

## D. Communications, médias et capteurs

- Étudier les contrôles de caméra/microphone selon les autorisations et les API publiques.
- Règles de communications essentielles : contacts familiaux, appels d'urgence, exceptions.
- Paliers pédagogiques : texte, images, vidéos, liens, documents, réseaux sociaux.
- **Important :** ces paliers peuvent être pédagogiques, mais ne correspondent pas nécessairement à des blocages techniques applicables dans WhatsApp, Snapchat, TikTok ou d'autres applications.
- Aucun accès au contenu des messages, photos, vidéos, audio ou conversations.

## E. Géolocalisation

- Géorepérage école/maison et alertes **optionnels**, avec information et consentement adaptés.
- Ne pas prétendre détecter de manière fiable une pièce comme la chambre via le GPS.

## F. Pédagogie

- Contrat numérique familial co-construit, droits et devoirs réciproques.
- Routines : téléphone hors table, pendant devoirs et échanges humains, boîte à téléphone.
- Paliers d'autonomie (poche, chambre, appareil photo, réseaux sociaux).
- Retrait temporaire de droits proportionné et explicable ; réévaluation et restauration.
- Possibilité de permis à points **facultatif**, sans automatiser des sanctions opaques.
- Conseils de réaction en cas de cyberharcèlement, diffusion d'images, arnaques et manipulation.
- Questionnaire guidé **court/standard/expert**, issu du référentiel ENF ; **les 483 questions d'origine ne doivent pas être intégrées telles quelles à l'application de contrôle**. Elles servent à définir les options et règles pertinentes.

## G. Protection des données et sécurité

- Collecte minimale ; traitement local par défaut quand possible.
- Chiffrement des échanges, authentification et gestion des clés, séparation des rôles.
- Export/suppression des données ; transparence envers parent et enfant.
- Conception conforme aux exigences applicables RGPD et aux politiques de distribution.

## Hors périmètre / interdits

- Lecture clandestine de messages, enregistrement d'écran, keylogging, capture de photos, interception audio.
- Promesses de blocage universel de médias ou de mots interdits dans les messageries chiffrées.
- Privilèges constructeur, root ou API privées supposés disponibles sur les appareils des familles.

## Critères de réussite

Chaque lot doit fournir : comportement observable, environnement Android précis, permissions nécessaires, tests reproductibles, limitations documentées, sécurité et ergonomie.

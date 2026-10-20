# CADRE — Cahier des charges fonctionnel (vision, non implémentée)

L’objectif est de construire un contrôle parental Android adapté aux usages actuels des jeunes : activités dans les applications, communications, contenus partagés, sollicitations et contextes de vie. Protection, accompagnement et autonomie progressive guident le projet. La charte et le contrat sont des moyens au service de cet objectif.

Ce document décrit des **objectifs de produit**, pas des fonctionnalités déjà disponibles. Chaque fonctionnalité devra faire l'objet d'une étude de faisabilité, d'un modèle de menace et de tests.


## Parcours central à construire
Au premier lancement, la famille définit pourquoi l’enfant reçoit un téléphone, les usages initiaux et les conditions de progression. La charte pose les principes de respect, protection et responsabilité ; le contrat traduit les décisions familiales. Ils structurent la configuration, au lieu d’être des annexes.

CADRE propose des réglages expliqués à partir du cadre choisi ; le parent les ajuste et valide. L’application distingue décision familiale, recommandation et contrôle réellement actif. Les demandes de nouvelles fonctions permettent de réexaminer les droits ; un âge prévu n’ouvre pas automatiquement un droit.

Le mode apprentissage sert à programmer des moments choisis pour apprendre, découvrir ou développer une compétence avec le numérique. Il ne prescrit pas automatiquement des applications et ne prétend pas mesurer l’apprentissage.

Les exigences de conception comprennent la validation parentale de nouveaux contacts, les droits par contact et type d’échange (texte, images, photos, vocaux, appels, vidéo, envoi/réception), et les modalités de notification (pastille, affichage silencieux, vibration, son, plages et exceptions). Leur portée technique doit être qualifiée par application et mode Android ; aucun contrôle universel n’est promis. Une restriction limitée ne remplace pas silencieusement la demande initiale.

Priorité : construire une première version Android fonctionnelle et gratuite à tester avec des parents lors des conférences ENF. Ne pas étendre le pilote au forum, à la friction des icônes ou à un nouveau système de messages urgents. Contrat HTML et charte du livre identifiés, mais pas encore ajoutés au dépôt.

Contributeurs : choisissez une mission existante, indiquez le lot souhaité, puis proposez une Pull Request ciblée. Pas de prise en charge de tout le projet exigée.

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

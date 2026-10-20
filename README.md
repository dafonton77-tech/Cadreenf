# CADRE — Un contrôle parental adapté aux usages des jeunes

**[Les fonctionnalités que nous souhaitons construire — liste centrale](docs/FEATURE_REGISTER.md)** : demandes détaillées, distinctes des fonctions disponibles et du premier pilote.


**Nous recherchons des bénévoles pour construire et livrer une application Android fonctionnelle, gratuite pour les parents, qui associe protection, accompagnement éducatif et autonomie progressive.**

Les besoins à traiter concernent autant ce que les jeunes font avec leur téléphone que le temps qu’ils y passent : communiquer, partager des images ou des vocaux, jouer, apprendre, gérer les sollicitations et respecter les autres. CADRE veut permettre aux familles de définir leur propre cadre et de le faire évoluer.

> **État actuel : prototype expérimental v0.1.** Ce dépôt ne fournit pas encore une protection opérationnelle pour un enfant. Les fonctionnalités décrites sont des objectifs de développement, sauf indication et preuves contraires.

## Ce que nous voulons construire
- Des fonctions modulaires choisies selon les besoins : applications, horaires, durées, modes d’activité, contacts, échanges, notifications, caméra et microphone.
- Des droits progressifs : partir des usages justifiant le premier téléphone, anticiper les étapes et examiner les nouvelles demandes de l’enfant.
- Un accompagnement compréhensible : contrat et charte familiaux, recommandations de réglages expliquées, validation parentale et révision des décisions.
- Des moments dédiés à apprendre avec le numérique, choisis en famille ; le mode apprentissage ne prescrit pas automatiquement des applications.
- Des retours de parents pour améliorer l’outil au fil des versions.

La [vision fonctionnelle](docs/CAHIER_DES_CHARGES.md) et le [registre des demandes](docs/FEATURE_REGISTER.md) conservent les détails, y compris les souhaits dont la faisabilité n’est pas validée. **Une limite technique ne constitue pas une décision d’abandon.** Les contributeurs sont invités à examiner ces demandes, proposer des solutions et documenter les contraintes. Aucune disponibilité universelle dans les applications tierces n’est promise.

## Première livraison
Une version Android limitée mais réellement fonctionnelle, proposée gratuitement à des parents volontaires lors des conférences ENF, puis améliorée grâce à leurs besoins et à leurs essais. Les critères de réception sont suivis dans la [mission #12](https://github.com/dafonton77-tech/Cadreenf/issues/12). La liste des contrôles du pilote doit être validée explicitement avant leur réalisation.

## Contribuer
Choisissez une [mission ouverte](https://github.com/dafonton77-tech/Cadreenf/issues), indiquez votre intérêt, puis proposez une Pull Request ciblée. Une contribution ponctuelle est bienvenue ; personne n’a à réaliser seul tout le projet.

Nous cherchons des compétences Android/Kotlin, architecture, sécurité, interface/accessibilité et tests. Les parents pourront aussi participer à la définition des besoins et aux essais.

**[Bien démarrer](docs/START_HERE.md)** · [Contribuer](CONTRIBUTING.md) · [Feuille de route](docs/ROADMAP.md) · [English](docs/PROJECT_OVERVIEW_EN.md)

## Ce qui existe
Un projet Kotlin, un workflow de compilation d’APK debug, un écran de préférences locales et des commandes expérimentales de caméra/suspension d’applications. Les interrupteurs de droits numériques n’appliquent pas de restrictions aux messageries tierces. Le parcours familial, l’appairage et la synchronisation restent à développer.

Les contrôles Android et leur compatibilité doivent être démontrés sur matériel ; une compilation ne suffit pas. Ne pas essayer de provisionner Device Owner sur le téléphone principal d’une famille.

## Projet et engagements
CADRE s’inscrit dans la création de la future association **Éducation Numérique France**, au service des familles : comprendre, encadrer, protéger. Le projet ne revendique pas de reconnaissance juridique particulière.

Pas de collecte de contenus privés — messages, photos, vidéos, audio — ni keylogging ou enregistrement d’écran. Les coûts de maintenance et de fonctionnement restent à prévoir pour soutenir la gratuité.

Le code est sous [licence MIT](LICENSE). Les noms, logos et contenus pédagogiques ENF ont un périmètre distinct : [NOTICE.md](NOTICE.md). Le contrat HTML et la charte du livre ont été identifiés ; ils ne sont pas encore inclus dans le dépôt.

[Faisabilité Android](docs/FAISABILITE_ANDROID.md) · [Sécurité](SECURITY.md)

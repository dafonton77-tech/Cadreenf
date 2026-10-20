# CADRE — Un contrôle parental adapté aux usages des jeunes

**Nous recherchons des bénévoles pour construire et livrer une application Android fonctionnelle, gratuite pour les parents, qui associe protection, accompagnement éducatif et autonomie progressive.**

Les besoins à traiter concernent autant ce que les jeunes font avec leur téléphone que le temps qu’ils y passent : communiquer, partager des images ou des vocaux, jouer, apprendre, gérer les sollicitations et respecter les autres. CADRE veut permettre aux familles de définir leur propre cadre et de le faire évoluer.

> **État actuel : prototype expérimental v0.1.** Ce dépôt ne fournit pas encore une protection opérationnelle pour un enfant. Les fonctionnalités décrites sont des objectifs de développement, sauf indication et preuves contraires.

**[Liste centrale des onze familles validées et missions associées](docs/FEATURE_REGISTER.md)** · [Livraison de bout en bout](https://github.com/dafonton77-tech/Cadreenf/issues/27)

## Ce que nous voulons construire
- Des fonctions modulaires choisies selon les besoins : applications, horaires, durées, modes d’activité, contacts, échanges, notifications, caméra et microphone.
- Des droits progressifs : partir des usages justifiant le premier téléphone, anticiper les étapes et examiner les nouvelles demandes de l’enfant.
- Un accompagnement compréhensible : contrat et charte familiaux, recommandations de réglages expliquées, validation parentale et révision des décisions.
- Des moments dédiés à apprendre avec le numérique, choisis en famille ; le mode apprentissage ne prescrit pas automatiquement des applications.
- Des retours de parents pour améliorer l’outil au fil des versions.

La [vision fonctionnelle](docs/CAHIER_DES_CHARGES.md) et le [registre des demandes](docs/FEATURE_REGISTER.md) conservent les détails, y compris les souhaits dont la faisabilité n’est pas validée. **Une limite technique ne constitue pas une décision d’abandon.** Les contributeurs sont invités à examiner ces demandes, proposer des solutions et documenter les contraintes. Aucune disponibilité universelle dans les applications tierces n’est promise.

## Première livraison
Une version Android limitée mais réellement fonctionnelle, proposée gratuitement à des parents volontaires lors des conférences ENF, puis améliorée grâce à leurs besoins et à leurs essais. Les critères de réception sont suivis dans la [mission #12](https://github.com/dafonton77-tech/Cadreenf/issues/12). La liste des contrôles du pilote doit être validée explicitement avant leur réalisation.

## Profils recherchés pour livrer la première version testable

**Priorité : un ou une référente technique Android/Kotlin**, volontaire pour coordonner l’architecture, les interfaces entre les lots, les revues de code et l’intégration. Ce rôle peut être partagé ; il ne suppose pas de réaliser seul l’application. Tony porte les besoins et les choix pédagogiques, en échange avec les contributeurs.

Nous cherchons aussi :
- **Développement Android/Kotlin :** moteur de règles et parcours familial (#3, #13, #17), appairage/synchronisation (#19), demandes et rapports (#24, #25), puis contrôles spécialisés (#15, #20 à #23).
- **Sécurité et architecture :** modèle de menace, permissions, confidentialité, récupération et revue avant diffusion (#2, #5, #22, #26).
- **Qualité et livraison Android :** builds reproductibles, tests automatiques et physiques, intégration et APK versionnées (#7, #9, #10, #27).
- **Interface et accessibilité :** parcours compréhensibles pour les familles, textes et vérifications d’accessibilité (#11, #17).
- **Parents testeurs :** besoins et retours lors du pilote encadré (#18), une fois la version techniquement validée.

Ces profils sont recherchés : leur présence et leur disponibilité ne sont pas acquises.

**Livrable attendu :** une APK Android installable, avec le parcours familial, les composants nécessaires et les fonctions convenues réellement intégrées et testées. Fournir les instructions, les appareils/versions vérifiés, les résultats des essais et les limites. Une maquette, une étude ou un APK qui se lance sans contrôles validés ne suffit pas. La liste complète des souhaits demeure la référence ; tout écart de la première version doit être explicitement accepté.

## Contribuer
Choisissez une [mission ouverte](https://github.com/dafonton77-tech/Cadreenf/issues), indiquez votre intérêt, puis proposez une Pull Request ciblée. Une contribution ponctuelle est bienvenue ; personne n’a à réaliser seul tout le projet.

Pour démarrer, indiquez dans la mission choisie votre expérience, le lot qui vous intéresse et vos disponibilités approximatives. Les petites contributions restent bienvenues ; pour un lot technique, proposez d’abord l’approche et les dépendances. Le code passe par revue avant intégration. Participation bénévole, sans rémunération promise ni engagement de durée imposé.

**[Bien démarrer](docs/START_HERE.md)** · [Contribuer](CONTRIBUTING.md) · [Feuille de route](docs/ROADMAP.md) · [English](docs/PROJECT_OVERVIEW_EN.md)

## Ce qui existe
Un projet Kotlin, un workflow de compilation d’APK debug, un écran de préférences locales et des commandes expérimentales de caméra/suspension d’applications. Les interrupteurs de droits numériques n’appliquent pas de restrictions aux messageries tierces. Le parcours familial, l’appairage et la synchronisation restent à développer.

Les contrôles Android et leur compatibilité doivent être démontrés sur matériel ; une compilation ne suffit pas. Ne pas essayer de provisionner Device Owner sur le téléphone principal d’une famille.

## Projet et engagements
CADRE s’inscrit dans la création de la future association **Éducation Numérique France**, au service des familles : comprendre, encadrer, protéger. Le projet ne revendique pas de reconnaissance juridique particulière.

Pas de collecte de contenus privés — messages, photos, vidéos, audio — ni keylogging ou enregistrement d’écran. Les coûts de maintenance et de fonctionnement restent à prévoir pour soutenir la gratuité.

Le code est sous [licence MIT](LICENSE). Les noms, logos et contenus pédagogiques ENF ont un périmètre distinct : [NOTICE.md](NOTICE.md). Le contrat HTML et la charte du livre ont été identifiés ; ils ne sont pas encore inclus dans le dépôt.

[Faisabilité Android](docs/FAISABILITE_ANDROID.md) · [Sécurité](SECURITY.md)

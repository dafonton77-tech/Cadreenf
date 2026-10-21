# CADRE — Un contrôle parental éducatif au service des familles

## Pourquoi ce projet existe

**CADRE est un projet porté dans le cadre de la création de l'association Éducation Numérique France (ENF).** ENF a pour ambition d'accompagner les enfants, les adolescents, les parents et les acteurs éducatifs dans un usage plus conscient, responsable et protecteur du numérique. Son approche repose sur trois principes : **comprendre, encadrer, protéger**. Elle privilégie l'anticipation, le dialogue et l'autonomie progressive plutôt que la seule interdiction ou la sanction.

Le smartphone occupe une place importante dans la vie des jeunes : échanges avec les proches, jeux, apprentissages, réseaux sociaux, photos et vidéos. Pour les familles, les difficultés ne se résument pas au temps d'écran. Elles concernent aussi les sollicitations permanentes, le respect des autres, la vie privée, les contenus partagés et les règles de vie à la maison. ENF souhaite aider les parents à poser un cadre clair, compréhensible et évolutif, sans les laisser seuls face à des réglages techniques complexes.

## Ce que CADRE veut apporter

**CADRE vise une application Android gratuite pour les parents, associant outils de protection et démarche éducative.** Chaque famille doit pouvoir définir ses règles selon l'âge, les besoins et la maturité de l'enfant, puis les faire évoluer ensemble. L'objectif n'est pas de surveiller secrètement les jeunes, mais de rendre les règles explicites, de soutenir le dialogue et de développer leur autonomie.

À terme, l'application pourrait aider à gérer des plages horaires et des usages d'applications, accompagner les demandes d'autorisation, présenter des bilans d'usage compréhensibles et soutenir un contrat familial numérique. Les fonctions envisagées sont détaillées plus bas et dans le cahier des charges ; **leur faisabilité, leurs limites et leur disponibilité effective restent à démontrer sur Android**.

## Pourquoi nous faisons appel à la communauté GitHub

ENF apporte la vision éducative, les besoins exprimés par les familles et des ressources pédagogiques. Pour transformer cette vision en logiciel fiable, nous recherchons des **contributrices et contributeurs bénévoles** : développement Android/Kotlin, architecture, sécurité, tests, accessibilité, conception d'interfaces et documentation.

Il ne s'agit pas de demander à une seule personne de construire toute l'application. Des contributions ciblées, relues et testées, peuvent faire avancer le projet. Nous souhaitons construire une première version limitée mais réellement fonctionnelle, puis la proposer gratuitement à des parents volontaires dans un cadre de test encadré. Les contributions sont bénévoles, sans rémunération promise.

**État actuel : prototype expérimental v0.1.** CADRE n'est pas encore une solution de protection opérationnelle pour un enfant. Les fonctions présentées sont des objectifs tant qu'elles ne sont pas développées, intégrées et vérifiées sur des appareils réels.

**Nos engagements :** pas de collecte du contenu privé des messages, photos, vidéos ou enregistrements audio ; pas de keylogging ni d'enregistrement d'écran. Le respect de la vie privée, la transparence des limites techniques et la sécurité des familles font partie des exigences du projet.

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

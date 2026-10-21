# CADRE — Un projet né de l'expérience du terrain et d'une conviction éducative

## Pourquoi CADRE existe

**Derrière CADRE, il y a d'abord une conviction : les familles ne devraient pas être seules face aux défis du numérique.**

Après vingt années d'expérience dans le domaine éducatif, j'ai progressivement pris conscience d'une réalité : les technologies évoluent beaucoup plus vite que les moyens dont disposent les parents pour accompagner leurs enfants.

Aujourd'hui, offrir un premier smartphone à son enfant soulève de nombreuses questions. Comment le protéger sans l'étouffer ? Comment fixer des limites sans provoquer des conflits permanents ? Comment lui apprendre à devenir autonome tout en prévenant les risques auxquels il peut être confronté ?

Les parents ne manquent pas nécessairement de volonté. **Ils manquent souvent d'outils concrets, accessibles et adaptés à leur réalité quotidienne.**

C'est notamment pour répondre à ces difficultés que j'ai développé le projet **Éducation Numérique France (ENF)**, aujourd'hui en cours de structuration associative.

Notre philosophie repose sur une idée simple : **anticiper, encadrer, accompagner. Jamais punir par principe, jamais interdire systématiquement.** Notre démarche éducative vise à aider les familles à comprendre les usages numériques, à établir des règles cohérentes et à accompagner progressivement leurs enfants vers davantage de responsabilité.

Mais au fil de mon travail, une évidence s'est imposée : expliquer aux parents comment agir ne suffit pas toujours. Il faut également leur donner les moyens pratiques d'appliquer les décisions prises en famille.

**C'est ainsi qu'est née l'idée de CADRE.**

## L'application que nous souhaitons construire

CADRE a pour ambition de devenir une **application Android gratuite pour les parents**, éducative et respectueuse de la vie privée, conçue autour de l'accompagnement plutôt que de la surveillance.

Nous souhaitons que chaque famille puisse définir ses propres règles, accompagner l'évolution des droits de l'enfant et favoriser le dialogue. Nous ne voulons ni lire les conversations privées des enfants, ni espionner leurs activités, ni remplacer l'autorité parentale par un algorithme.

**Nous voulons créer un outil qui aide les parents à exercer leur rôle éducatif tout en respectant progressivement l'autonomie de leurs enfants.**

Les fonctionnalités souhaitées sont décrites dans les documents du projet. Certaines dépendent des capacités et restrictions d'Android : leur faisabilité et leur efficacité devront être étudiées, développées et vérifiées sur des appareils réels.

## Pourquoi je fais appel à la communauté GitHub

Je suis avant tout un professionnel de l'éducation, pas un développeur informatique.

Je connais les difficultés rencontrées par les familles, les besoins éducatifs auxquels nous souhaitons répondre et les objectifs pédagogiques de ce projet. Mais pour transformer cette vision en une véritable application, j'ai besoin de compétences techniques que je ne possède pas.

C'est pourquoi je fais appel à la communauté des développeurs.

**Je ne recherche pas simplement des personnes capables d'écrire du code. Je recherche des personnes qui souhaitent mettre leurs compétences au service d'un projet éducatif et d'une ambition d'utilité sociale.**

Chaque contribution, même modeste, peut nous aider à avancer. Personne n'est censé réaliser seul l'ensemble de l'application. Nous recherchons des contributions bénévoles, sans rémunération promise, en développement Android/Kotlin, sécurité, tests, accessibilité, conception et documentation.

Notre objectif est de développer collectivement une première application Android réellement fonctionnelle, gratuite pour les familles, respectueuse de leur vie privée et techniquement fiable, puis de l'expérimenter auprès de parents volontaires dans un cadre encadré.

**État actuel : prototype expérimental v0.1.** CADRE n'est pas encore une protection opérationnelle pour un enfant. Nous avons une vision, un cahier des charges et des besoins identifiés, mais il reste un véritable travail de développement, de vérification et de sécurisation. Nous ne promettons pas que toutes les fonctionnalités imaginées seront techniquement réalisables ; nous souhaitons les étudier sérieusement et avec transparence.

**Confidentialité :** aucune collecte de contenus privés (messages, photos, vidéos, audio), aucun keylogging et aucun enregistrement d'écran.

**CADRE n'a pas vocation à remplacer les parents. Il doit leur donner les moyens de mieux accompagner leurs enfants.**

Et si, grâce à la mobilisation de bénévoles, nous parvenons à offrir gratuitement cet outil à des familles qui en ont besoin, alors chaque heure consacrée à son développement aura une véritable utilité.

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

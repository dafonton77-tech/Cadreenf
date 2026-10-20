# Référentiel des demandes CADRE

Ce registre rassemble les demandes connues des échanges et du cahier des charges au 20 octobre 2026. Il ne constitue ni un audit Android achevé ni une garantie d’exhaustivité de tous les anciens échanges. Aucune ligne ne signifie fonction disponible. Les décisions de report doivent rester visibles et les changements de portée être validés par le porteur.

| Identifiant | Demande | État de cadrage | Missions |
|---|---|---|---|
| MODES | École, divertissement, modes personnalisés ; apprentissage = moments choisis pour apprendre, sans prescription automatique d’apps ; fonctions activables séparément | À développer ; efficacité de chaque contrôle à qualifier | #13 |
| APPS | Autoriser/bloquer par application, calendrier, quotas et mode besoin | À développer sous conditions Android à vérifier | #13, #5 |
| RAPPELS | Alerte configurable après dix minutes d’usage, pauses et remise à zéro | À développer ; permissions et mesure à vérifier | #14 |
| SCROLL | Détecter spécifiquement le défilement continu | Faisabilité non établie sans accès au contenu ; distinct du temps d’usage | #14 |
| NOTIFICATIONS | Par app/contact : aucune alerte, pastille, affichage silencieux, vibration, son ; horaires et exceptions parents | À qualifier par capacité ; pas de lecture du contenu | #15, #5 |
| CAPTEURS | Caméra totale/programmée/à la demande ; caméra et micro en jeu | À qualifier par mode Android ; pas de promesse universelle | #15, #5 |
| COMMUNICATIONS | Validation parentale de chaque nouveau contact, quelle que soit l’app ; droits par contact pour texte/photos/images/vocaux/vidéo/appels, envoi et réception ; inconnus et urgences | À qualifier ; conserver les communications essentielles | #15, #5 |
| PROTECTION | Code parent, séparation rôles, protection désinstallation et réglages | À qualifier ; distinguer installation ordinaire et appareil géré | #15, #19, #5 |
| WEB | Liste blanche des sites/domaines, périmètre navigateur et réseau | À développer après décision technique ; couverture explicite | #16, #6 |
| IMAGES | Filtrage des images et demande de filtrage sémantique | À qualifier ; analyse du contenu en conflit possible avec la confidentialité, sans autorisation implicite | #16 |
| MEDIAS | Vidéos, documents, partage de photos et autres médias par app | Demande conservée ; contrôle interne universel non promis | #16 |
| LIENS | Interdire l’ouverture de liens externes dans des apps tierces | À qualifier ; contrôle universel non promis | #16 |
| LANGAGE | Filtrer les injures envoyées/reçues et alertes | Demande conservée ; pas de lecture des messages autorisée | #16 |
| LOCALISATION | Zones maison/école et alertes optionnelles ; demande liée à la chambre | À qualifier ; GPS non retenu comme preuve fiable de présence dans une pièce | #18, #5 |
| EXTENSIONS | Demande temporaire, approbation/refus, expiration ; lecture/devoirs/aide | À développer ; activités confirmées humainement | #17 |
| RAPPORTS | Usage par app/catégorie/période, hebdomadaire/mensuel, tendances/objectifs | À développer avec autorisations et données minimales | #17 |
| AUTONOMIE | Paliers d’âge, poche/chambre/réseaux sociaux, retrait/restauration, points facultatifs | À développer ; distinguer accord éducatif et restriction système | #13, #17 |
| PEDAGOGIE | Charte/contrat au premier lancement, besoins initiaux, validation par famille de sujets, recommandations expliquées puis validation parentale ; droits/devoirs et routines | À développer ; les 483 questions servent de référence, pas d’intégration brute | #17 |
| APPAIRAGE | Plusieurs profils, espaces parent/enfant, synchronisation, révocation, hors ligne | À développer et tester réellement | #19, #2 |
| LABORATOIRE | Deux vues sur un appareil pour essayer les parcours | Simulation conservée ; aucune preuve de contrôle distant | #4 |
| PILOTE | Android gratuit, essais volontaires aux conférences, assistance au retrait | Objectif de livraison, pas état actuel | #12, #18 |
| RETOURS | Besoins, bugs, astuces, ce qui fonctionne ou non ; amélioration par versions | À développer sans données privées d’enfants | #18 |
| COMMUNAUTE | Forum de discussion, entraide et organisation entre parents | Vision conservée ; report explicite après le premier pilote | #18 |
| CONFIDENTIALITE | Aucun contenu privé messages/photos/vidéos/audio, keylogging ou capture écran ; suppression et transparence | Exigence transversale obligatoire | #12 à #19 |
| COMPATIBILITE | Android prioritaire ; ambition d’accès large | Compatibilité vérifiée appareil/version ; iOS et universalité hors premier pilote | #12 |

Pour chaque réalisation, compléter les API et permissions vérifiées, versions Android, périmètre pilote accepté, preuve de test, restrictions et lien de PR. Distinguer réalisable par une application ordinaire, réalisable sous conditions et inaccessible dans le cadre du projet. Une étude ne vaut pas implémentation. Le périmètre des fonctions du pilote reste à valider ; aucune omission du registre ne vaut abandon autorisé.

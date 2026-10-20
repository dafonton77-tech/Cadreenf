# Feuille de route — proposition ouverte à discussion

## Phase 0 — Sécuriser le socle
- Audit du code existant, du manifeste et des autorisations.
- État des lieux des fonctionnalités réellement testées.
- Choix de licence et gouvernance de contribution.
- Tests unitaires, CI et documentation de build.

## Phase 1 — Prototype éducatif démontrable
- Modèle de règles typées, validation et persistance.
- Mode laboratoire parent/enfant **sur un seul appareil**, avec état simulé explicitement.
- Interface parent et interface enfant, sans privilèges système.
- Journal de décisions et tests de scénarios.

## Phase 2 — Appairage sécurisé
- Architecture de communication et modèle de menace.
- Appairage, authentification, synchronisation et révocation.
- Demandes d'extension et réponses parentales.
- Tests de déconnexion et de synchronisation.

## Phase 3 — Contrôles Android réels
- Étude documentée de Device Owner/Profile Owner/Usage Access/VPN.
- Contrôles réalisables sur appareil de test dédié.
- Horaires, quotas, filtrage de sites selon capacités vérifiées.
- Tests sur plusieurs versions Android et constructeurs.

## Phase 4 — Éducation, confidentialité, fiabilité
- Parcours d'autonomie, contrat familial, explications et aide aux incidents.
- Rapports d'usage minimaux ; transparence et suppression des données.
- Accessibilité, sécurité, documentation et tests de bout en bout.

**Règle :** aucune phase n'est déclarée terminée sans preuve reproductible. Les priorités et solutions restent ouvertes aux contributeurs.

## Livrable final et critères de réussite

L’objectif est une **première version fonctionnelle livrée**, pas seulement un démonstrateur. La [mission globale #12](https://github.com/dafonton77-tech/Cadreenf/issues/12) pilote le développement, l’intégration et la réception des lots. Les phases ci-dessus doivent produire du code intégré et des preuves de fonctionnement, au-delà des propositions d’architecture.

La réception exige des APK versionnées, une compilation reproductible, un scénario parent/enfant de bout en bout avec restriction réelle et extension temporaire, des essais documentés sur au moins deux configurations Android, une revue de sécurité/confidentialité et un guide d’installation et de retrait. Toute fonction conditionnelle, inaccessible ou non testée est signalée. Le laboratoire sur un seul appareil permet de tester les parcours mais ne valide pas la communication entre appareils ni l’efficacité des restrictions. Les issues #1 à #11 sont des travaux de soutien ; elles ne couvrent pas à elles seules cette livraison.

## Périmètre prioritaire validé — pilote Android gratuit
La première livraison vise une application Android fonctionnelle, remise gratuitement à des parents volontaires lors des conférences Éducation Numérique France pour une phase de test encadrée. Le prototype actuel ne doit pas être distribué comme une protection opérationnelle.

Les parents testeurs participent à l’amélioration : besoins réels, fonctions utiles ou manquantes, difficultés d’installation et d’utilisation, dysfonctionnements et propositions. Prévoir un moyen simple de retour accessible depuis l’application, sans forum intégré : type de retour, description, version de l’application et modèle/version Android, avec informations techniques transmises volontairement. Ne demander aucun contenu privé ni information identifiante sur les enfants ; anonymiser les éléments avant publication sur GitHub.

Organiser le cycle : version pilote identifiée → essais volontaires → retours → tri des bugs et besoins → corrections priorisées → nouvelle version → nouvelle vérification. Fournir une notice sur les fonctions validées, limites, retrait de l’application et procédure de signalement ; vérifier le parcours de retour avant le pilote.

Le périmètre exact des fonctions du premier pilote sera figé selon faisabilité et tests. Les lots ci-dessous sont une cible de développement, pas l’exigence de tout livrer avant un premier pilote limité. Aucun contrôle annoncé comme actif sans preuve. iOS, compatibilité universelle et forum communautaire sont hors du périmètre de cette première livraison.

Suivi : [mission #12](https://github.com/dafonton77-tech/Cadreenf/issues/12).

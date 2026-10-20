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

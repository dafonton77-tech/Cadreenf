# Faisabilité Android — à valider par versions et modes de gestion

| Fonction | État réaliste | Remarques |
|---|---|---|
| Stocker des règles et préférences locales | Faisable | Ne bloque pas les applications à lui seul |
| Rapports de temps d'usage | Sous conditions | UsageStatsManager et accès accordé explicitement ; données partielles |
| Suspension de packages | Sous conditions fortes | Device Owner / Profile Owner selon le périmètre et les API ; pas via simple Device Admin |
| Désactivation caméra | Sous conditions | DevicePolicyManager, autorisations et portée selon mode de gestion |
| Filtrage sites via navigateur contrôlé | Faisable sous conditions | Seulement le trafic du navigateur géré |
| Filtrage réseau par VPN local | Sous conditions | Consentement, conflits VPN, contournements possibles ; aucune garantie universelle |
| Horaires et limites d'applications | Sous conditions | Mécanisme d'application à concevoir et tester ; restrictions Android |
| Appairage et demandes parent/enfant | Faisable | Infrastructure, authentification, chiffrement et synchronisation à créer |
| Désinstallation empêchée sur appareil personnel classique | Non garantie | Privilèges élevés / gestion d'appareil nécessaires |
| Bloquer uniquement les photos WhatsApp tout en gardant le texte | Non réalisable universellement | Pas d'API publique inter-apps pour imposer cela |
| Filtrer tous les messages entrants/sortants et injures | Non réalisable universellement | Chiffrement et sandbox des applications |
| Bloquer tous les liens ouverts depuis toutes les applications | Non réalisable universellement | Certaines routes réseau peuvent être filtrées ; pas de contrôle absolu |
| Détecter « téléphone dans la chambre » au GPS | Non fiable | Précision insuffisante pour une pièce |
| Mode parent/enfant sur un appareil pour démonstration | Faisable en simulation | Ne valide pas le contrôle système réel |

**Device Admin ≠ Device Owner.** La première autorisation ne donne pas les pouvoirs de la seconde. Le provisionnement Device Owner peut exiger un appareil réinitialisé et dédié aux tests. Ne pas effectuer sur le téléphone principal.

**Statut du dépôt :** aucune fonction de restriction n'est considérée comme validée sur matériel simplement parce que l'APK compile ou qu'un bouton apparaît.

Pour chaque proposition technique : préciser versions Android, permissions, distribution Play Store ou hors Store, limites et protocole de test.

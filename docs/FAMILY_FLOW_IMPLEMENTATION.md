# Parcours familial — spécification de réalisation #17

Document de travail directement exploitable pour les écrans, sans reprendre la mission textes/accessibilité #11. Aucun support du livre n’est inventé ou republié.

| Écran | Entrées et action | Sortie et validation |
|---|---|---|
| Besoins initiaux | Pourquoi le téléphone ? être joignable, appeler, messages, arrivée, autres besoins choisis | Besoins enregistrés sans ouvrir de droit |
| Profil et étapes | Profil enfant, droits initiaux, étapes futures, conditions | Séparer présents/futurs ; pas d’ouverture automatique par âge |
| Charte familiale | Texte ENF vérifié, engagements adultes/enfant et désaccords | Relecture et accord à représenter ; texte exact à fournir/valider avant diffusion |
| Familles de décisions | Questions adaptées, retour arrière, mode court/standard/expert | Réponses en cours ; pas de confirmation à chaque question |
| Récapitulatif d’une famille | Décisions, explications, points non résolus | Validation de la famille ; conservation des autres familles |
| Recommandations | Décisions validées traduites par un mapping versionné | Chaque règle explique sa source ; modifier/refuser ; non approuvée par défaut |
| Validation parentale | Résumé des changements et capacités connues | Vérifier l’identité parentale avant d’approuver ; rien n’est marqué actif ici |
| Application des réglages | Adaptateur Android et résultat de commande | Actif seulement après preuve ; permission manquante/indisponible/échec visibles |
| Vie quotidienne | Droits actuels, demandes, moments d’apprentissage | Demandes en attente ; aucun droit nouveau implicite |
| Révision | Modifier une famille, comparer ancien/nouveau | Historique local minimal ; nouvelle validation des changements |

## États et cas limites
Une famille non validée ne génère pas de réglage approuvé. Un désaccord reste visible et ne devient pas autorisation. Une règle rejetée ne s’applique pas. Une modification invalide l’approbation concernée, pas les décisions sans rapport.
Sauvegarder les réponses et l’état d’avancement sans contenus privés. Le moteur rule-engine ne fournit pas cette persistance.
Une capacité inconnue reste UNVERIFIED ; READY n’est pas ACTIVE. Distinguer refus d’autorisation et refus de règle familiale.
L’apprentissage programme un moment et un objectif choisis, sans inférer qu’une app prouve un apprentissage.
Les conditions futures, rappels et exceptions doivent être lisibles ; parent et enfant peuvent demander de réexaminer l’accord.

## Acceptation minimale
Une famille fictive complète deux familles, revient sur la première, redémarre, retrouve ses réponses, refuse une recommandation et valide une autre. Le système ne crée pas d’autorisation non approuvée et affiche honnêtement un contrôle non disponible.

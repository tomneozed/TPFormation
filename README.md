# Formation POEI SAFE JAVA - TP #1

## TP - JPA 1

Définir une entité POI et un repository pour le concept "Point d'intérêt" : 

- **id** : un long unique représentant l'identifiant du point
- **nom** : une chaine de caractères de taille max de 255
- **adresse** : une chaine (longue)
- **lat** : un double optionnel représentant la latitude
- **lng** : un double optionnel représentant la longitude 

Définir un service pour ce concept :
- Méthodes : findAll, findOne, create, update, delete

Définir le contrôleur pour ce concept : 
- Accessible sr "/api/poi"
- Exposant chaque méthode du service

## TP - JPA 2

Enrichissement du modèle de données :
- un nouveau concept "commentaire" enrichit le concept de "point"
- un point peut avoir plusieurs commentaires
- chaque commentaire est caractérisé par son auteur, sa date de dépôt, et son contenu


## TP - Métier

Lors de la création ou de la mise à jour de l'adresse d'un point, l'application doit déterminer (si possible) les valeurs **lat/lng** et les persister : 
- Définition d'un nouveau service permettant de récupérer les coordonnées d'une adresse 
- Bouchonnage du service (mock des résultats)
- Intégration du service dans l'existant (injection, appel, ...)

**BONUS** 
Consommation d'une api externe : positionStack (https://positionstack.com/)
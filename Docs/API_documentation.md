# Documentation des API

Cette documentation permet de comprendre un peu comment fonctionnent les API. Elle précise quels seront les formats attendus 
et les résultats de sortie.

## API de création d'utilisateur

Méthode : POST  
Paramètres d'entrée :
  - String : nom
  - String : email
  - String : login
  - String : mot de passe

Sortie :  
    - String : message de confirmation

Exemple :
  

## API de connexion utilisateur

Méthode : POST  
Paramètres d'entrée :
- String : login
- String : mot de passe

Sortie :  
- String : message de confirmation
- Token : token d'identification utilisateur

Exemple :  
`PS C:\Users\Ismael> curl localhost:8080/app/login -d login=dtrump -d password=MAGA2020`  
`The password is correct. Donald successfully logged in. User token expires on: Thu Dec 17 14:58:28 CET 2020`


## API de création de sondage

## API de vote de sondage

## API d'affichage des sondages utilisateurs

## API de suppression d'un sondage

## API d'affichage des utilisateurs

## API d'ajout de lieux de rendez-vous

Méthode : POST  
Paramètres d'entrée :
- String : placeName
- String : placeAddress
- String : placeWebsite

Sortie :
- String : message de confirmation

Exemple :  
`PS C:\Users\Ismael> curl localhost:8080/app/add_meeting_place -d placeName=Vapiano -d placeAddress=214%20rue%20beaujour -d placeWebsite=www.vapiano.fr`  
`Meeting place added`


## API d'affichage des lieux de rendez-vous

Méthode : POST  
Paramètres d'entrée :
- String : login

Sortie :
- String (JSON) : liste des lieux de rencontre

Exemple :  
`PS C:\Users\Ismael> curl localhost:8080/app/get_meeting_places -d userLogin=dtrump`  
`[{"placeName":"Vapiano","placeAddress":"214 rue beaujour","placeWebsite":"www.vapiano.fr","id":32}]`


#  Digital Banking Application - Projet Spring Angular JWT

Ce projet est une application web full-stack de gestion bancaire.  
Il permet de gérer les clients, consulter les comptes bancaires, afficher l'historique des opérations et effectuer des opérations bancaires comme le débit, le crédit et le transfert.

Le projet est composé de deux parties principales :

- **Backend** : développé avec Spring Boot
- **Frontend** : développé avec Angular

L'application utilise une authentification sécurisée avec **JWT**.

---

## ✨ Fonctionnalités principales

### 🔐 Authentification et autorisation

- Connexion avec username et password
- Génération d'un token JWT
- Protection des routes avec Spring Security
- Gestion des rôles et scopes
- Accès administrateur pour les opérations sensibles

### 👤 Gestion des clients

- Afficher la liste des clients
- Ajouter un nouveau client
- Modifier un client
- Supprimer un client
- Rechercher un client par mot-clé

### 🏦 Gestion des comptes bancaires

- Afficher les comptes bancaires
- Consulter les détails d'un compte
- Afficher le solde du compte
- Consulter l'historique des opérations
- Pagination des opérations bancaires

### 💸 Opérations bancaires

Les opérations suivantes sont réservées aux utilisateurs autorisés :

- **Débit** : retirer de l'argent d'un compte
- **Crédit** : ajouter de l'argent à un compte
- **Transfert** : transférer de l'argent d'un compte vers un autre compte

---

## 🛠️ Architecture technique

## ⚙️ Backend - Spring Boot

Le backend expose une API REST qui permet au frontend de communiquer avec la base de données.

### Technologies utilisées

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate
- MySQL / MariaDB
- Maven

### Principaux packages backend

```text
backend/
└── src/main/java/org/sid/ebankingbackend/
    ├── controllers/
    ├── dtos/
    ├── entities/
    ├── enums/
    ├── exceptions/
    ├── mappers/
    ├── repositories/
    ├── security/
    └── services/
```

### Entités principales

- Customer
- BankAccount
- CurrentAccount
- SavingAccount
- AccountOperation

---

## 💻 Frontend - Angular

Le frontend représente l'interface utilisateur de l'application.

### Technologies utilisées

- Angular
- TypeScript
- HTML
- CSS
- Bootstrap
- Angular Router
- HttpClient
- Guards
- Interceptors

### Principaux dossiers frontend

```text
frontend/
└── src/app/
    ├── accounts/
    ├── customers/
    ├── guards/
    ├── interceptors/
    ├── login/
    ├── navbar/
    ├── not-authorised/
    └── services/
```

### Sécurité côté frontend

Le frontend utilise :

- un service d'authentification
- un interceptor HTTP pour ajouter automatiquement le token JWT
- des guards pour protéger les routes
- une page `not-authorised` pour les accès refusés

---

## 🚀 Comment lancer le projet en local

## Prérequis

Avant de lancer le projet, il faut installer :

- Java 17 ou plus
- Maven
- Node.js
- Angular CLI
- MySQL ou XAMPP

---



## 1. Démarrer le backend

Ouvrir un terminal dans le dossier du projet :

```bash
cd backend
mvn spring-boot:run
```

Le backend démarre sur :

```text
http://localhost:8080
```

Si tout fonctionne, la console doit afficher :

```text
Tomcat started on port 8080
Started EbankingBackendApplication
```

---

## 4. Démarrer le frontend

Ouvrir un autre terminal :

```bash
cd frontend
npm install
ng serve
```

Le frontend démarre sur :

```text
http://localhost:4200
```

---

## 🔒 Informations de connexion

Pour tester l'application, utiliser :

```text
Username : admin
Password : 1234
```

Après la connexion, le backend retourne un token JWT.  
Ce token est utilisé pour accéder aux routes protégées.

Le token est envoyé dans les requêtes HTTP avec le header :

```http
Authorization: Bearer <token>
```

---

## 📌 Endpoints principaux du backend

## Authentification

```http
POST /auth/login
GET /auth/profile
```

## Clients

```http
GET /custmers
GET /custmers/search?keyword=
GET /custmers/{id}
POST /custmers
PUT /custmers/{id}
DELETE /custmers/{id}
```

## Comptes bancaires

```http
GET /accounts
GET /accounts/{accountId}
GET /accounts/{accountId}/operations
GET /accounts/{accountId}/pageOperations
POST /accounts/debit
POST /accounts/credit
POST /accounts/transfer
```

---

## 🧪 Test de l'application

Après avoir lancé le backend et le frontend :

1. Aller sur :

```text
http://localhost:4200
```

2. Se connecter avec :

```text
admin / 1234
```

3. Consulter les clients
4. Consulter les comptes
5. Tester les opérations bancaires

---




## 🏗️ Structure complète du projet

```text
Projet-Spring-Angular-JWT/
│
├── backend/
│   ├── src/main/java/
│   │   └── org/sid/ebankingbackend/
│   │       ├── controllers/
│   │       ├── dtos/
│   │       ├── entities/
│   │       ├── enums/
│   │       ├── exceptions/
│   │       ├── mappers/
│   │       ├── repositories/
│   │       ├── security/
│   │       └── services/
│   │
│   ├── src/main/resources/
│   │   └── application.properties
│   │
│   └── pom.xml
│
└── frontend/
    ├── src/app/
    │   ├── accounts/
    │   ├── customers/
    │   ├── guards/
    │   ├── interceptors/
    │   ├── login/
    │   ├── navbar/
    │   ├── not-authorised/
    │   └── services/
    │
    ├── angular.json
    └── package.json
```

---

## 👩‍💻 Auteur

Projet réalisé par **Agrigah AYA**.

---

## 🎯 Objectif du projet

Ce projet a été réalisé dans le cadre d'un apprentissage du développement full-stack avec Spring Boot et Angular.

Il permet de comprendre :

- la création d'une API REST avec Spring Boot
- la communication entre Angular et Spring Boot
- la sécurité avec JWT
- la gestion des rôles et autorisations
- la gestion des entités avec JPA/Hibernate
- la connexion à une base de données MySQL
- la protection des routes côté frontend

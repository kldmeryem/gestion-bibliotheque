# Gestion de bibliothèque (Java)

Application console de gestion d'une bibliothèque, réalisée en Java avec IntelliJ IDEA. Projet d'apprentissage de la programmation orientée objet.

## Fonctionnalités

- Afficher la liste des livres
- Ajouter un livre (titre, auteur)
- Emprunter un livre
- Rendre un livre
- Menu interactif en console

## Objectifs

- Modéliser des entités avec des classes et des objets (`Livre`, `Bibliotheque`)
- Appliquer l'encapsulation (attributs privés, getters/setters)
- Manipuler des collections (`ArrayList`)
- Lire les saisies utilisateur avec `Scanner`
- Utiliser Git et GitHub pour le versionnement

## Technologies

- Java 17+
- IntelliJ IDEA
- Git / GitHub

## Structure du projet

- `src/Livre.java` : classe représentant un livre (titre, auteur, disponibilité)
- `src/Bibliotheque.java` : gestion de la liste des livres (ajout, affichage, emprunt, retour)
- `src/Main.java` : point d'entrée avec le menu interactif

## Exemple d'utilisation

```
=== MENU BIBLIOTHEQUE ===
1. Afficher les livres
2. Ajouter un livre
3. Emprunter un livre
4. Rendre un livre
0. Quitter
Votre choix :
```

## Lancer le projet

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/kldmeryem/gestion-bibliotheque.git
   ```
2. Ouvrir le dossier avec IntelliJ IDEA
3. Lancer la classe `Main`

## Évolutions prévues

- Gestion des membres et des emprunts par membre
- Sauvegarde des données dans une base de données SQL (JDBC)
- Tests unitaires avec JUnit

## Auteur

KALADA Meryem - Étudiante en M2 Ingénierie Informatique en Big Data et Cloud Computing

# Gestion de bibliothèque (Java + SQLite)

Application console de gestion d'une bibliothèque, réalisée en Java avec IntelliJ IDEA. Les livres sont sauvegardés dans une base de données SQLite grâce à JDBC.

## Fonctionnalités

- Afficher la liste des livres
- Ajouter un livre (titre, auteur) avec validation des saisies
- Emprunter un livre
- Rendre un livre
- Sauvegarde persistante des données (SQLite)
- Menu interactif en console

## Objectifs

- Modéliser des entités avec des classes et des objets (`Livre`, `Bibliotheque`)
- Appliquer l'encapsulation (attributs privés, getters/setters)
- Manipuler des collections (`ArrayList`)
- Lire les saisies utilisateur avec `Scanner`
- Connecter Java à une base de données avec JDBC (`PreparedStatement`)
- Utiliser Git et GitHub pour le versionnement

## Technologies

- Java 17+
- SQLite (JDBC)
- IntelliJ IDEA
- Git / GitHub

## Structure du projet

- `src/Livre.java` : classe représentant un livre (titre, auteur, disponibilité)
- `src/Bibliotheque.java` : gestion de la liste des livres (ajout, affichage, emprunt, retour)
- `src/BaseDeDonnees.java` : accès à la base SQLite (création de la table, insertion, lecture, mise à jour)
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
3. Télécharger le driver `sqlite-jdbc` : https://github.com/xerial/sqlite-jdbc/releases
4. L'ajouter au projet : `File > Project Structure > Libraries > + > Java`
5. Lancer la classe `Main`

Le fichier `bibliotheque.db` est créé automatiquement au premier lancement.

## Évolutions prévues

- Gestion des membres et des emprunts par membre
- Migration vers Maven pour gérer les dépendances automatiquement
- Tests unitaires avec JUnit

## Auteur

KALADA Meryem - Étudiante en M2 Ingénierie Informatique en Big Data et Cloud Computing
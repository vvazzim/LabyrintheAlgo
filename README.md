Solveur de Labyrinthe avec A*

Ce projet Java propose une implémentation d'un solveur de labyrinthe utilisant l'algorithme A* avec deux heuristiques différentes. Il offre la possibilité de résoudre un labyrinthe manuellement ou à partir d'un fichier et prend en compte deux types d'heuristiques pour trouver la solution optimale.

Instructions d'utilisation
Compilation du Code:

Assurez-vous d'avoir Java installé sur votre machine.
Utilisez un IDE comme Eclipse ou compilez le code depuis la ligne de commande avec javac.
Exécution du Programme:

Lancez le programme en utilisant la classe Main depuis l'IDE ou via la ligne de commande.
Entrée du Labyrinthe:

Choisissez d'entrer le labyrinthe manuellement (option 1) ou de le lire depuis un fichier (option 2).
Suivez les instructions pour fournir les détails du labyrinthe.
Heuristiques Disponibles:

Deux heuristiques sont disponibles: Heuristique de Distance (option 1) et Heuristique de Feu (option 2).
Vous pouvez choisir d'afficher la solution pour une seule heuristique ou pour les deux.
Affichage des Solutions:

Les solutions sont affichées à la fin de l'exécution.
Choisissez si vous souhaitez enregistrer la solution dans un fichier ou simplement l'afficher.
Exemples d'Utilisation
Exemple 1 - Labyrinthe Manuel:

Choisissez l'option 1 pour entrer le labyrinthe manuellement.
Suivez les instructions pour définir la structure du labyrinthe.
Exemple 2 - Labyrinthe depuis un Fichier:

Choisissez l'option 2 et fournissez le chemin du fichier contenant le labyrinthe.
Exemple 3 - Choix d'Heuristiques:

Sélectionnez l'heuristique de distance (option 1), l'heuristique de feu (option 2), ou les deux.
Exemple 4 - Enregistrement dans un Fichier:

Choisissez d'enregistrer la solution dans un fichier et fournissez le chemin d'accès.
Dépendances
Le projet ne nécessite aucune dépendance externe autre que Java.

Remarques
Assurez-vous de fournir un labyrinthe valide avec les caractères spécifiés (# pour les murs, D pour le prisonnier, S pour la sortie).

En cas de problème, consultez les tests unitaires dans la classe LabyrintheTest pour des exemples d'utilisation et de vérification du bon fonctionnement.

Améliorations Possibles
Amélioration de la gestion des exceptions pour une expérience utilisateur plus robuste.

Ajout d'une interface utilisateur graphique (GUI) pour une convivialité améliorée.

Possibilité d'ajouter des fonctionnalités supplémentaires telles que la visualisation graphique du labyrinthe.


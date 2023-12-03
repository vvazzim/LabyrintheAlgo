package Labyrinthe;

import java.util.*;

public class Labyrinthe {
    static final char MUR = '#';
    private static final char SORTIE = 'S';
    private static final char PRISONNIER = 'D';
    static final char FEU = 'F';

    private int n;
    private int m;
    private char[][] labyrinthe;

    public Labyrinthe(int n, int m, char[][] labyrinthe) {
        this.n = n;
        this.m = m;
        this.labyrinthe = labyrinthe;
    }

    public List<String> resoudre() {
        List<String> solution = new ArrayList<>();

     // Construction du graphe d'états
        Map<String, Etat> etats = new HashMap<>();
        Etat initial = new Etat(0, 0, 0, null);
        etats.put(initial.toString(), initial);

        Etat sortie = null;  // Ajout d'une référence à l'état de sortie

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = labyrinthe[i][j];
                if (c == PRISONNIER) {
                    initial = new Etat(i, j, 0, null);
                } else if (c == SORTIE) {
                    sortie = new Etat(i, j, 0, null);
                    etats.put(sortie.toString(), sortie);
                }
            }
        }

     // Définition de l'heuristique
        Heuristique heuristique = new Heuristique(labyrinthe, sortie);

        // Application de l'algorithme A*
        AStar astar = new AStar(etats, heuristique, labyrinthe, initial);
        Etat solution_etat = astar.resoudre();

        if (solution_etat == null) {
            return solution;
        }

        // Récupération de la solution
        solution.add(String.format("%d %d", solution_etat.x, solution_etat.y));
        while (solution_etat.pere != null) {
            solution.add(String.format("%d %d", solution_etat.pere.x, solution_etat.pere.y));
            solution_etat = solution_etat.pere;
        }

        Collections.reverse(solution);

        return solution;
    }
}

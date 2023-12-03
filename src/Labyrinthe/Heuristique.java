package Labyrinthe;

public class Heuristique {

    private char[][] labyrinthe;
    private Etat sortie;
    private static final char FEU = 'F';

    public Heuristique(char[][] labyrinthe, Etat sortie) {
        this.labyrinthe = labyrinthe;
        this.sortie = sortie;
    }

    public int evaluer(Etat etat) {
        int distance_euclidienne = (int) Math.sqrt((etat.x - sortie.x) * (etat.x - sortie.x) + (etat.y - sortie.y) * (etat.y - sortie.y));
        int distance_feu = 0;

        // Assurez-vous que les variables "n" et "m" sont définies
        int n = labyrinthe.length;
        int m = labyrinthe[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Utilisez la constante FEU correctement
                if (labyrinthe[i][j] == FEU) {
                    int distance_temporaire = Math.abs(i - etat.x) + Math.abs(j - etat.y);
                    if (distance_temporaire < distance_feu) {
                        distance_feu = distance_temporaire;
                    }
                }
            }
        }
        return distance_euclidienne + distance_feu;
    }
}

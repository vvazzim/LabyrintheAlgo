package Labyrinthe;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Créez votre labyrinthe (remplacez ces valeurs par les vôtres)
        int n = 5;
        int m = 5;
        char[][] labyrinthe = {
                {'.', '.', '.', '.', '#'},
                {'.', 'D', '.', '.', '#'},
                {'.', '#', '#', '#', '#'},
                {'.', '.', 'S', '#', '#'},
                {'.', '#', '#', '#', '#'}
        };

        // Créez une instance de la classe Labyrinthe
        Labyrinthe lab = new Labyrinthe(n, m, labyrinthe);

        // Résolvez le labyrinthe
        List<String> solution = lab.resoudre();

        // Affichez la solution
        if (solution.isEmpty()) {
            System.out.println("Aucune solution trouvée.");
        } else {
            System.out.println("Solution trouvée :");
            for (String etape : solution) {
                System.out.println(etape);
            }
        }
    }
}

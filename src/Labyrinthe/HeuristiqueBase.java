package Labyrinthe;

public class HeuristiqueBase implements Heuristique {

    private Etat sortie;

    public HeuristiqueBase(Etat sortie) {
        this.sortie = sortie;
    }

    @Override
    public int evaluer(Etat etat) {
        return Math.abs(etat.x - sortie.x) + Math.abs(etat.y - sortie.y);
    }
}

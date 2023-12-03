package Labyrinthe;

public class Etat {
    int x;
    int y;
    int temps; // Ajout de la variable temps
    int cout;  // Ajout de la variable cout
    Direction direction;
    Etat pere;

    public Etat(int x, int y, int temps, Direction direction) {
        this.x = x;
        this.y = y;
        this.temps = temps;
        this.direction = direction;
        this.pere = null;
        this.cout = 0; // Initialisez la variable cout
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%d)", x, y, temps);
    }

}

/**
 * Squelette de classe labyrinthe
 */
class Labyrinthe{

    private static final char MUR = 'X';
    private static final char PJ = 'P';
    private static final char SORTIE = 'S';
    private static final char VIDE = '.';

    private static java.lang.String HAUT = "haut";
    private static java.lang.String BAS = "bas";
    private static java.lang.String GAUCHE = "gauche";
    private static java.lang.String DROITE = "droite";

    private boolean[][] murs;
    private Personnage personnage;
    private Sortie sortie;
    char getChar(int x, int y) {
        char c = VIDE;
        if (this.murs[x][y]){
            c = MUR;
        }
        if (this.personnage.getX()==x && this.personnage.getY()==y){
            c = PJ;
        }
        if (this.sortie.getX()==x && this.sortie.getY()==y){
            c = SORTIE;
        }
        return c;
    }


    static int[] getSuivant(int x, int y, String action) {
        if (action.compareTo(HAUT)==0){
            int c;
        }
    }


    void deplacerPerso(String action) throws ActionInconnueException {
        throw new Error("TODO");
    }


    public String toString() {
        throw new Error("TODO");
    }


    public boolean etreFini() {
        throw new Error("TODO");
    }

    public static Labyrinthe chargerLabyrinthe(String nom) {
        throw new Error("TODO");
    }

}

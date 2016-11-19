package lt.vcs;

/**
 * Zaidimo klase, reprezentuojanti viena zaidimo partija
 */
public class Game {

    /** pirmas zaidejas */
    private final Player p1;
    /** antras zaidejas */
    private final Player p2;

    private Player activePlayer;

    /**
     * zaidimo konstruktorius
     * @param p1 pirmas zaidejas
     * @param p2 antras zaidejas
     */
    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        activePlayer = p1;
    }

    /**
     * startuoja zaidima/partija
     */
    public void start() {
        //TODO: cia turetu prasideti visa pagrindine zaidimo mechanika gal cia ir uzsibaigti, nuo jusu priklauso :)
    }
}

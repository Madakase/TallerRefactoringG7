/**
 * Clase principal que gestiona el flujo del juego Rock-Paper-Scissors.
 */
public class RPGGame {

    // Constante para evitar "Números Mágicos"
    private static final int WIN_THRESHOLD = 3;

    private Player p1;
    private Player p2;
    private int roundsPlayed;
    private int drawCount;

    public RPGGame() {
        this.p1 = new Player("Player 1");
        this.p2 = new Player("Player 2");
        this.roundsPlayed = 0;
        this.drawCount = 0;
    }

    /**
     * Inicia el bucle principal del juego.
     */
    public void start() {
        System.out.println("Starting Game: First to " + WIN_THRESHOLD + " wins!");
        
        while (!isGameOver()) {
            playRound();
        }
        
        printFinalResults();
    }

    /**
     * Ejecuta la lógica de una sola ronda.
     */
    private void playRound() {
        roundsPlayed++;
        System.out.println("\n***** Round: " + roundsPlayed + " *****");
        
        // Cada jugador decide su movimiento
        Move m1 = p1.makeMove();
        Move m2 = p2.makeMove();

        System.out.println(p1.getName() + ": " + m1);
        System.out.println(p2.getName() + ": " + m2);

        determineRoundWinner(m1, m2);
        printScore();
    }

    /**
     * Determina el ganador de la ronda actual comparando los movimientos.
     */
    private void determineRoundWinner(Move m1, Move m2) {
        if (m1 == m2) {
            System.out.println("\tIt's a Draw!");
            drawCount++;
        } else if (m1.beats(m2)) {
            System.out.println("\t" + p1.getName() + " Wins this round!");
            p1.incrementWins();
        } else {
            System.out.println("\t" + p2.getName() + " Wins this round!");
            p2.incrementWins();
        }
    }

    private void printScore() {
        System.out.println("Current Score -> " + p1.getName() + ": " + p1.getWins() + 
                           " | " + p2.getName() + ": " + p2.getWins());
    }

    private boolean isGameOver() {
        return p1.getWins() >= WIN_THRESHOLD || p2.getWins() >= WIN_THRESHOLD;
    }

    private void printFinalResults() {
        System.out.println("\n=========================");
        System.out.println("Total Rounds: " + roundsPlayed);
        System.out.println("Total Draws: " + drawCount);
        
        if (p1.getWins() > p2.getWins()) {
            System.out.println("GAME WON by " + p1.getName() + "!");
        } else {
            System.out.println("GAME WON by " + p2.getName() + "!");
        }
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        new RPGGame().start();
    }
}
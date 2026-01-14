public class Printer {
    
    public void printWelcome(int threshold) {
        System.out.println("Starting Game: First to " + threshold + " wins!");
    }

    public void printRoundStart(int roundNumber) {
        System.out.println("\n***** Round: " + roundNumber + " *****");
    }

    public void printMoves(Player p1, Move m1, Player p2, Move m2) {
        System.out.println(p1.getName() + ": " + m1);
        System.out.println(p2.getName() + ": " + m2);
    }

    public void printRoundResult(String message) {
        System.out.println("\t" + message);
    }

    public void printCurrentScore(Player p1, Player p2, Scoreboard board) {
        System.out.println("Current Score -> " + p1.getName() + ": " + board.getP1Wins() + 
                           " | " + p2.getName() + ": " + board.getP2Wins());
    }

    public void printFinalResults(Scoreboard board, Player winner) {
        System.out.println("\n=========================");
        System.out.println("Total Rounds: " + board.getRounds());
        System.out.println("Total Draws: " + board.getDraws());
        if (winner != null) {
            System.out.println("GAME WON by " + winner.getName() + "!");
        } else {
            System.out.println("GAME ENDED IN A DRAW!");
        }
        System.out.println("=========================");
    }
}

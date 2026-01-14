public class RPGGame {

    private final Player p1;
    private final Player p2;
    private final Rules rules;
    private final Scoreboard scoreboard;
    private final Printer printer;

    public RPGGame() {
        this.p1 = new Player("Player 1");
        this.p2 = new Player("Player 2");
        this.rules = new Rules();
        this.printer = new Printer();
        this.scoreboard = new Scoreboard(3);
    }

    public void start() {
        printer.printWelcome(scoreboard.getThreshold());
        
        while (!scoreboard.isGameOver()) {
            playRound();
        }
        
        printer.printFinalResults(scoreboard, scoreboard.getWinner(p1, p2));
    }

    private void playRound() {
        printer.printRoundStart(scoreboard.getRounds() + 1);
        
        Move m1 = p1.makeMove();
        Move m2 = p2.makeMove();

        printer.printMoves(p1, m1, p2, m2);
        resolveRound(m1, m2);
        
        printer.printCurrentScore(p1, p2, scoreboard);
    }

    private void resolveRound(Move m1, Move m2) {
        if (rules.isDraw(m1, m2)) {
            scoreboard.registerDraw();
            printer.printRoundResult("It's a Draw!");
        } else if (rules.doesFirstBeatSecond(m1, m2)) {
            scoreboard.registerWinP1();
            printer.printRoundResult(p1.getName() + " Wins this round!");
        } else {
            scoreboard.registerWinP2();
            printer.printRoundResult(p2.getName() + " Wins this round!");
        }
    }

    public static void main(String[] args) {
        new RPGGame().start();
    }
}
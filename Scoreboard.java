public class Scoreboard {
    private int p1Wins;
    private int p2Wins;
    private int draws;
    private int rounds;
    private final int winThreshold;

    public Scoreboard(int winThreshold) {
        this.winThreshold = winThreshold;
        this.p1Wins = 0;
        this.p2Wins = 0;
        this.draws = 0;
        this.rounds = 0;
    }

    public void registerWinP1() {
        p1Wins++;
        rounds++;
    }

    public void registerWinP2() {
        p2Wins++;
        rounds++;
    }

    public void registerDraw() {
        draws++;
        rounds++;
    }

    public boolean isGameOver() {
        return p1Wins >= winThreshold || p2Wins >= winThreshold;
    }

    public Player getWinner(Player p1, Player p2) {
        if (p1Wins > p2Wins) return p1;
        if (p2Wins > p1Wins) return p2;
        return null;
    }

    public int getP1Wins() { return p1Wins; }
    public int getP2Wins() { return p2Wins; }
    public int getDraws() { return draws; }
    public int getRounds() { return rounds; }
    public int getThreshold() { return winThreshold; }
}
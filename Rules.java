public class Rules {

    
    private final Move[] beats;

    public Rules() {
        beats = new Move[Move.values().length];
        beats[Move.ROCK.ordinal()] = Move.SCISSORS;    
        beats[Move.PAPER.ordinal()] = Move.ROCK;        
        beats[Move.SCISSORS.ordinal()] = Move.PAPER;    
    }

    public boolean doesFirstBeatSecond(Move m1, Move m2) {
        return beats[m1.ordinal()] == m2;
    }

    public boolean isDraw(Move m1, Move m2) {
        return m1 == m2;
    }
}


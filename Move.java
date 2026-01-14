import java.util.Random;

public enum Move {
    ROCK,      
    PAPER,      
    SCISSORS;  

    private static final Random RANDOM = new Random();
   
    public static Move getRandomMove() {
        Move[] values = Move.values();
        return values[RANDOM.nextInt(values.length)];
    }
}
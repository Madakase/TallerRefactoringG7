public class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public Move makeMove() {
        return Move.getRandomMove();
    }

    public String getName() {
        return this.name;
    }
}
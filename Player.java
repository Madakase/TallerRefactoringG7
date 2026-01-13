/**
 * Representa a un jugador en el juego.
 * Maneja su propio estado (victorias) y acciones (hacer un movimiento).
 */
public class Player {
    private String name;
    private int wins;

    public Player(String name) {
        this.name = name;
        this.wins = 0;
    }

    /**
     * El jugador realiza un movimiento.
     * @return Un movimiento aleatorio del Enum Move.
     */
    public Move makeMove() {
        return Move.getRandomMove();
    }

    /**
     * Incrementa el contador de victorias del jugador en 1.
     */
    public void incrementWins() {
        this.wins++;
    }

    public int getWins() {
        return this.wins;
    }

    public String getName() {
        return this.name;
    }
}
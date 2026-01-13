import java.util.Random;

/**
 * Representa los movimientos posibles en el juego (Piedra, Papel, Tijera).
 * Encapsula la lógica de qué movimiento gana a cuál.
 */
public enum Move {
    ROCK, 
    PAPER, 
    SCISSORS;

    /**
     * Verifica si este movimiento gana al movimiento del oponente.
     * @param other El movimiento del oponente.
     * @return true si este movimiento gana, false si pierde o empata.
     */
    public boolean beats(Move other) {
        // Un empate no es una victoria
        if (this == other) {
            return false;
        }
        
        switch (this) {
            case ROCK:
                return other == SCISSORS;
            case PAPER:
                return other == ROCK;
            case SCISSORS:
                return other == PAPER;
            default:
                return false;
        }
    }

    /**
     * Genera un movimiento aleatorio para la IA.
     * @return Un movimiento aleatorio (ROCK, PAPER o SCISSORS).
     */
    public static Move getRandomMove() {
        Move[] values = Move.values();
        return values[new Random().nextInt(values.length)];
    }
}
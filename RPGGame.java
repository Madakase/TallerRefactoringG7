public class RPGGame {
    public static void main(String args[]) {

        Player p1 = new Player();
        Player p2 = new Player();

        boolean gameWon = false;
        int roundsPlayed = 0;  
        int p1Wins = p1.wins;
        int p2Wins = p2.wins;
        int draw = 0;

        String p1Choice;
        String p2Choice;

        
        do {
            System.out.println("***** Round: " + roundsPlayed + " *****\n");
            System.out.println("Number of Draws: " + draw + "\n");

            p1Choice = p1.playerChoice();
            System.out.println("Player 1: " + p1Choice +
                               "  Player 1 Total Wins: " + p1Wins);

            p2Choice = p2.playerChoice();
            System.out.println("Player 2: " + p2Choice);

            if ((p1Choice.equals("rock")) && (p2Choice.equals("paper"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            } else if ((p1Choice.equals("paper")) && (p2Choice.equals("rock"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if ((p1Choice.equals("rock")) && (p2Choice.equals("scissors"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if ((p1Choice.equals("scissors")) && (p2Choice.equals("rock"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            } else if ((p1Choice.equals("scissors")) && (p2Choice.equals("paper"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if ((p1Choice.equals("paper")) && (p2Choice.equals("scissors"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            }

            if (p1Choice.equals(p2Choice)) {
                draw++;
                System.out.println("\n\t\t Draw \n");
            }

            roundsPlayed++;

            if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
                gameWon = true;
                System.out.println("GAME WON");
            }

            System.out.println();

        } while (gameWon != true);
    }
}


/* -The game consists of rolling a die, trying to get a 6.
   -There are 10 "games" in this program.
   -Each game can have up to 3 rounds where the player rolls for each round.
   -Player wins the "game" by rolling a 6 within the 3 rounds*/

public class Game {
    public static void main(String[] args) {
        int value = 6;
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        //10 games
        for (int i = 1; i <= 10; i++) {

            //print which game we're at
            System.out.println("Game: " + i);

            //3 rounds
            for (int j = 1; j <= 3; j++) {

                die1.roll();
                die2.roll();
                //Print the round we're at and the roll's result for each player
                System.out.println("\nRound: " + j + "\n" + "Die 1: " + die1.getValue() + " - " + "Die 2: " + die2.getValue());

                //Player WON the round
                if ((die1.getValue() == value) && (die2.getValue() != value)) {
                    System.out.println("\nPlayer 1 WON!\n\n");
                    break;
                }
                //Player 2 WON the round
                else if ((die1.getValue() != value) && (die2.getValue() == value)) {
                    System.out.println("\nPlayer 2 WON!\n\n");
                    break;
                }
                //Players TIED the round
                else if ((die1.getValue() == value) && (die2.getValue() == value)) {
                    System.out.println("\nYou TIED at Round " + j + "\n");
                }
                //NO player won the round
                else if ((die1.getValue() != value) && (die2.getValue() != value) && (j == 3)) {
                    System.out.println("\nNo one won Game " + i + " :(\n\n");
                }
            }
        } //end inner rounds loop
    } //end outter games loop
}
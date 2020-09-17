/* -Game consists of playing 10 games
   -Each game has 3 rounds
   -Player wins the round by rolling a 6 within the 3 rounds*/

public class Game{
   public static void main (String[] args){
      int value = 6;
      Dice die1 = new Dice();
      Dice die2 = new Dice();
   
      //10 games
      for (int i=1; i<=10; i++){
         //3 rounds
         for (int j=1; j<=3; j++ ){
            
            //roll dice and print result
            die1.roll();
            die2.roll();
            System.out.println(die1.getValue() + " " + die2.getValue());
            
            //Stop round if a player rolls a 6 
            //if ((die1.getValue() == value) | (die2.getValue() == value)) {
               //break;
            //}
            
            //check if Player 1 has won the round
             if ((die1.getValue() == value) && (die2.getValue() != value)){
               System.out.println("Player 1 has won this round");
               break;
            } 
            // check if Player 2 has won the round
             else if ((die1.getValue() != value) && (die2.getValue() == value)){
               System.out.println("Player 2 has won this round");
               break;
            } 
            //check if the players have tied
            else if ((die1.getValue() == value) && (die2.getValue() == value)){
               System.out.println("There's a TIE");
            }
         }
       System.out.println(); //line after last round of each game


      }//end inner rounds loop
   }//end outter games loop
}
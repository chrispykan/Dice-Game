/* -Game consists of playing 10 games
   -Each game has 3 rounds
   -Player wins the round by rolling a 6 within the 3 rounds*/

public class Game{
   public static void main (String[] args){
      int value = 6;
      Dice die = new Dice();
   
      //10 games
      for (int i=1; i<=10; i++){
         //3 rounds
         for (int j=1; j<=3; j++ ){
            
            //roll die and print result
            die.roll();
            System.out.println(die.getValue());
            
            //Stop round if player rolls a 6
            if (die.getValue() == value){
               break;
            }
         }
      //line break between each game
       System.out.println();

      }
   }
}
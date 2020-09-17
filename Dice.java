/* -A class, Dice, which defines a dice object
   -A constructor that initializes the die to 0
   -A Getter that gets the value of the dice
   -A Method that rolls the dice*/
   
import java.util.*;

public class Dice{
   int value;
   //using the Random class from java.util to generate a random number when rolling dice 
   Random r = new Random(); 
   
   //Constructor
   public Dice(){
   this.value = value;
   }
   
   //Getter
   public int getValue(){
      return value;
   }
   
   //Roll Method
   public void roll(){
   //dice has 6 sides, +1 to avoid generating a 0.
   value = r.nextInt(6)+1;
   }

}
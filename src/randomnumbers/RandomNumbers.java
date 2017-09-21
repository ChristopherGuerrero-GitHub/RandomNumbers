package randomnumbers;
import java.util.Random;

/**
 *
 * @author Christopher
 */
public class RandomNumbers {

    public static void main(String[] args) {
        
        /* This program was created to use the Random class and 
           instantiate a Random object and pass an integer value of 
           6 since that will represent the number of unique sides of
           a single rolling dice. A for loop is set to 100 and a
           primitive data variable of countDoubles is used to accumulate
           the total of matching values between two dices.
        */
        
        int die1, die2, countDoubles = 0;
        Random rand = new Random ();
        
        for(int i = 0; i < 100; i++){
            
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            
            if(die1 == die2){
                countDoubles++;
            }
        }
        System.out.println("I rolled " + countDoubles + " doubles");
    }
    
}

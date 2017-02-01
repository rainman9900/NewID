
import java.util.Scanner;
import java.util.Random;

/**
 * Created by akashs on 1/12/17.
 */

public class GuessingGame {
    public static void main(String arg[]){




        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        System.out.print("Enter your Number ");
        int YourNum = keyboard.nextInt();
        int CompNum = generator.nextInt(6)+1;




        while(YourNum != CompNum){

            System.out.print("Enter your Number ");

           YourNum = keyboard.nextInt();




        }

        if(YourNum == CompNum){
            System.out.println("You Win!");
        }


    }
}


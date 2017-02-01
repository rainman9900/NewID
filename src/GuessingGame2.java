/**
 * Created by akashs on 1/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame2 {
    public static void main(String arg[]){
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Guess your number between 1-100: ");
        int yourNum =keyboard.nextInt();
        int compNum = generator.nextInt(100)+1;


        while(yourNum != compNum){


            if (yourNum < compNum){

                System.out.print("My number is bigger, guess again: ");

            }


            if (yourNum > compNum){

                System.out.print("My number is smaller, guess again: ");

            }


            yourNum = keyboard.nextInt();

        }

        System.out.println("You win");

    }

}

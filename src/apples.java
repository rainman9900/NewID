/**
 * Created by akashs on 12/31/16.
 */
import java.util.Scanner;
public class apples {
    public static void main(String arg []){
    Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1 for Perimeter or 2 for Area ");
int whatNum = keyboard.nextInt();

        if(whatNum == 1){

            orange orangeObject = new orange();
            orangeObject.simpleMessage();
        } if (whatNum == 2){
            mangoe mangoeObject = new mangoe();
            mangoeObject.simpleResponse();
        }


    }
}

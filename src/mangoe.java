/**
 * Created by akashs on 1/11/17.
 */
import java.util.Scanner;
public class mangoe {
    public void simpleResponse(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
       int lenght = keyboard.nextInt();
        System.out.print("Enter width of rectangle: ");
        int  width = keyboard.nextInt();
        System.out.println(lenght *width );
    }
}

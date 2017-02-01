/**
 * Created by akashs on 1/14/17.
 */
import java.util.Scanner;
public class fourthFormula {
    public void t(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter vi: ");
        double vi = keyboard.nextDouble();


        System.out.print("Enter x: ");
        double x = keyboard.nextDouble();

        double a = 9.81;

        double vf2 = vi * vi + 2 * a * x;

System.out.println("vf^2 = "+ vf2);
    }
}

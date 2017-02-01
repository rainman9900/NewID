/**
 * Created by akashs on 1/14/17.
 */
import java.util.Scanner;
public class firstFormula {
    public void Vf(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter vi: ");
      double vi = keyboard.nextDouble();

        System.out.print("Enter t: ");
      double t = keyboard.nextDouble();

        double a = 9.81;

        double x = vi*t+.5* a * t * t;

        System.out.println("x = " + x);
    }
}

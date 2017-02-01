/**
 * Created by akashs on 1/14/17.
 */
import java.util.Scanner;
public class secFormula {
    public void a(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter vi: ");
        double vi = keyboard.nextDouble();

        System.out.print("Enter t: ");
        double t = keyboard.nextDouble();

        System.out.print("Enter vf: ");
double vf = keyboard.nextDouble();
        double x = .5 * (vi+vf)* t;

        System.out.println("x = " + x);
    }
}

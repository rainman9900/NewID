/**
 * Created by akashs on 1/14/17.
 */
import java.util.Scanner;
public class thirdFormula {
    public void x(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter vi: ");
        double vi = keyboard.nextDouble();

        System.out.println("Enter t: ");
        double t = keyboard.nextDouble();

        double a = 9.81;

        double vf = vi + a * t;

        System.out.println("vf = "+ vf);
    }
}

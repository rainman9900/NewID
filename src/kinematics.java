/**
 * Created by akashs on 1/14/17.
 */
import java.util.Scanner;
public class kinematics {
    public static void main(String arg []){
        Scanner keyboard = new Scanner(System.in);
        // 1 = x = vit+.5at^2; 2 = x = .5(vi+vf)t; 3 = vf =vi+at; 4 = vf^2 =vi^2+2ax//
        System.out.print("Enter a number 1-4 for your formula: ");
        int formula = keyboard.nextInt();

        switch(formula){
            case 1:
firstFormula object1 = new firstFormula();
                object1.Vf();
                break;
            case 2:
            secFormula object2 = new secFormula();
                object2.a();
                break;
            case 3:
                thirdFormula object3 = new thirdFormula();
                object3.x();
                break;
            default:
                fourthFormula object4 = new fourthFormula();
                object4.t();
                break;
        }
    }

}

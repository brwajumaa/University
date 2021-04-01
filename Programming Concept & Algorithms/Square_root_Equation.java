import java.util.Scanner;

public class Square_root_Equation {
public static void main(String[]args){


    // adding try and catch is only for reducing errors
    try {



        Scanner input = new Scanner(System.in);

        System.out.println("solve quadratic equations");


        /* Adding Scanner input & Creating Variables */
        System.out.print("Write A value: ");
        double A = input.nextDouble();
        System.out.print("Write B value: ");
        double B = input.nextDouble();
        System.out.print("Write C value: ");
        double C = input.nextDouble();

        double u_root = (float) Math.pow((B * B) - (4 * A * C), 0.5);

        /** The possibility and equations **/
        if (u_root > 0) {
            double r1 = (-B + u_root) / (2 * A);
            double r2 = (-B - u_root) / (2 * A);
            System.out.println("The first root is \n" + r1);
            System.out.println("The the second root is \n" + r2);
        } else if (u_root == 0) {
            // it is same if you use r2 instead r1
            double r1 = (-B + u_root) / (2 * A);
            System.out.println("The available root is \n" + r1);
        } else {
            System.out.println("The equation can't be solve or the equation hasn't real roots");
        }




    }
    catch (ArithmeticException e){

        System.out.println("The equation has no solution ");

    }
    catch (Exception e){
        System.out.println("Please, re-run the code & write Numbers instead Letters or other characters ");

    }
    }

}

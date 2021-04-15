import java.util.Scanner;

public class Algebra_quadratic_equation {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double r1, r2;
        double a, b, c;
        System.out.print("Enter 'a' value: ");
        a = input.nextDouble();
        System.out.print("Enter 'b' value: ");
        b = input.nextDouble();
        System.out.print("Enter 'c' value: ");
        c = input.nextDouble();

        double root = Math.pow((b * b) - (4 * a * c), .5);
        r1 = (-b + root) / (2*a) ;
        r2 = (-b - root) / (2*a) ;

        System.out.println("R1 is = " + r1);
        System.out.println("R2 is = " + r2);

        if(root > 0){
            System.out.println("The equation has 2 real roots");
        } else if(root == 0 ){
            System.out.println("The equation has one real root");
        } else {
            System.out.println("The equation has no real roots");
        }


    }
}

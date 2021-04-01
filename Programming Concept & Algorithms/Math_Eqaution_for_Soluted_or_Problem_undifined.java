import java.util.Scanner;

public class Math_Eqaution_for_Soluted_or_Problem_undifined {
    public static void main(String[]args){
        /* adding scanner and creating variables and EXCEPTION  */
        // adding try and catch is only for reducing errors
        try {


            Scanner input = new Scanner(System.in);


            /* Adding Scanner input & Creating Variables */
            System.out.print("Write a Value:");
            int a = input.nextInt();
            System.out.print("Write b Value:");
            int b = input.nextInt();
            System.out.print("Write c Value:");
            int c = input.nextInt();
            System.out.print("Write d Value:");
            int d = input.nextInt();
            System.out.print("Write e Value:");
            int e = input.nextInt();
            System.out.print("Write f Value:");
            int f = input.nextInt();
            System.out.print("Write g Value:");

            int x_top = (e*d) - (b*f);
            int y_top = (a*f) - (e*c);
            int below = (a*d) - (b*c);

            int x_equation = x_top / below;
            int y_equation = y_top / below;
            /** result **/
            System.out.println("Your X is: " + x_equation);
            System.out.println("Your Y is: " + y_equation);




        } catch (ArithmeticException e){

            System.out.println("The equation has no solution ");

        }
        catch (Exception e){
            System.out.println("Please, re-run the code & write Numbers instead Letters or other characters ");

        }

    }
}

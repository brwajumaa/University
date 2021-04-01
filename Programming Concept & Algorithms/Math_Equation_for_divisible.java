import java.util.Scanner;

public class Math_Equation_for_divisible {
    public static void main(String[]args) {

        // adding try and catch is only for reducing errors
        try {



            System.out.println("Check a number it's solvable if you dividing by X, Y ");


            /* Adding Scanner input & Creating Variables */
            Scanner input = new Scanner(System.in);


            System.out.println("Write values for 'X', 'Y'");

            System.out.print("X: ");
            int X = input.nextInt();
            System.out.print("Y: ");
            int Y = input.nextInt();

            System.out.println("Your value for X: " + X + "\nYour value for Y: " + Y);
            System.out.print("Write a Integer: ");
            int value = input.nextInt();


            if (value % X == 0 && value % Y == 0) {
                System.out.println("is divisible by both " + X + "," + Y);
            } else if (value % X != 0 && value % Y != 0) {
                System.out.println("is not divisible by either " + X + "," + Y);
            } else if (value % X == 0 && value % Y != 0) {
                System.out.println("is divisible by " + X + " but not " + Y);
            } else if (value % X != 0 && value % Y == 0) {
                System.out.println("is divisible by " + Y + " but not " + X);
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


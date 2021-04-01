import java.util.Scanner;


public class Area_Of_Circle{
    public static void main(String[] args){

        // adding try and catch is only for reducing errors
        try{

            System.out.println("To find your Circle Area write your Radius.");
            System.out.println("You should write in Meter (M) ");
            System.out.print("Radius: ");

            /* Adding Scanner input & Creating Variables */
            Scanner input = new Scanner(System.in);
            double r = input.nextDouble();
            double pi = (float) 22 / 7;
            double a = (float) pi * r * r;

            /* Area Of The Circle output */
            System.out.println("Your Area = " + a + " m");




            }
            catch (ArithmeticException e){

                System.out.println("The equation has no solution ");

            }
            catch (Exception e){
                System.out.println("Please, re-run the code & write Numbers instead Letters or other characters ");

            }




    }

}
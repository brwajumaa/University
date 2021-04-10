import java.util.Scanner;

public class Perimute_of_a_triangle {
    public static void main(String[]args){

        // adding try and catch is only for reducing errors
       try {



           Scanner input = new Scanner(System.in);

           System.out.println("Find perimeter of your triangle");

           /* Adding Scanner input & Creating Variables */
           System.out.print("Write a value: ");
           double a = input.nextDouble();
           System.out.print("Write b value: ");
           double b = input.nextDouble();
           System.out.print("Write c value: ");
           double c = input.nextDouble();

           double x = a + b;
           double y = a + b + c;


           if (x > c) {
               System.out.println("The Perimeter of the triangle is: " + y);
           } else {
               System.out.println("The values are invalid ");
           }
           // or just do all if else in sout it self shortly
       }
       catch (ArithmeticException e){

           System.out.println("The equation has no solution ");




       }
       catch (Exception e){
           System.out.println("Please, re-run the code & write Numbers instead Letters or other characters ");

       }
    }
}

import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("find your rectangle area.");

        double width, lenght;
        System.out.print("Write the width: ");
        width = input.nextDouble();
        System.out.print("Write the lenght: ");
        lenght = input.nextDouble();

        if (width >=0 && lenght >= 0){
            System.out.println("your area = " + width * lenght);
        } else {
            System.out.println("Incorrect input");
        }
    }
}
import java.util.Scanner;

public class radio {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please only use Yes or No");
        System.out.print("Enter manager Opinion: ");
        String manager = input.nextLine();
        System.out.print("Enter Secretor 1  Opinion: ");
        String secretor1 = input.nextLine();
        System.out.print("Enter Secretor 2 Opinion: ");
        String secretor2 = input.nextLine();

        manager = manager.toLowerCase();
        secretor1 = secretor1.toLowerCase();
        secretor2 = secretor2.toLowerCase();

        String condition1 = "yes";
        String condition2 = "no";
        boolean condition = (manager.equals(condition1) || manager.equals(condition2)) && (secretor1.equals(condition1) || secretor1.equals(condition2)) || (secretor2.equals(condition1) || secretor2.equals(condition2));

        if (manager.equals("") || secretor1.equals("") || secretor2.equals("")) {
            System.out.println("please write all opinions");
        } else if(condition) {
            if (manager.equals("yes") && secretor1.equals("yes") && secretor2.equals("yes")) {
                System.out.println("Turned On");
            } else if (manager.equals("no") && secretor1.equals("yes") && secretor2.equals("yes")) {
                System.out.println("Turned On");
            } else if (manager.equals("yes") && secretor1.equals("no") && secretor2.equals("yes")) {
                System.out.println("Turned On");
            } else if (manager.equals("yes") && secretor1.equals("yes") && secretor2.equals("no")) {
                System.out.println("Turned On");
            }
            else {
                System.out.println("The radio is OFF");
            }
        }
        else {
            System.out.println("Please only use Yes or No");
        }


    }
}

import java.util.Scanner;
public class zodiac {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        // Info about the program
        System.out.println("To find your Zodiac Symbols, write Day & Month of your birth.");
        System.out.println("Don't forget to try 29 / 2 (January).");

        // Instruction
        System.out.println("You can write your month's Name or Number [\"December\", \"12\"]" );

        // adding Exception to fix int wrong symbol
        try {


        //Creating variable for day and month
        int day;
        String month;
        //Getting input
        System.out.print("Day: ");
        day = input.nextInt();
        System.out.print("Month: ");
        month = input.next();

        // changing letters to lower case
        month = month.toLowerCase();



        //create an If to don't let users to give a number more than 31
            if(day > 0 && day <= 31) {


                /*
                * it's the first version of the zodiac project no error and easy to use, which is contain all operation inside IF Else
                * we have 2 general conditions one for month, one for day. check the day and the month to give you it's you Zodiac Symbol
                * inside those conditions we have two other conditions
                * first bracket: The first condition is to select the day for the Symbols and the other one is for don't let the user enter wrong
                *       number for the month like (30 / February) we know in February we have 28 days for a normal year and 29 days for Leap year
                *      The second condition is for to write number of the month instead the Name like (1 || january)
                * Second  is like the first one without selecting day's number of months
                * */

                if ((day >= 20  && (month.equals("january") || month.equals("1"))) || (day <= 18 && (month.equals("february") || month.equals("2")))) {
                    System.out.println("Aquarius");
                } else if (((day >= 19 && day <= 29) && (month.equals("february") || month.equals("2"))) || (day <= 20 && (month.equals("march") || month.equals("3")))) {
                    System.out.println("Pisces");
                    if(day == 29){
                        System.out.println("you was born in special year (Leap Year), which February have " + day + " days instead 28");
                    }
                } else if ((day >= 21 && (month.equals("march") || month.equals("3"))) || (day <= 19 && (month.equals("april") || month.equals("4")))) {
                    System.out.println("Aries");
                } else if (((day >= 20 && day <= 30) && (month.equals("april") || month.equals("4"))) || (day <= 20 && (month.equals("may") || month.equals("5")))) {
                    System.out.println("Taurus");
                } else if ((day >= 21 && (month.equals("may") || month.equals("5"))) || (day <= 20 && (month.equals("june") || month.equals("6")))) {
                    System.out.println("Gemini");
                } else if (((day >= 21 && day <= 30) && (month.equals("june") || month.equals("6"))) || (day <= 22 && (month.equals("july") || month.equals("7")))) {
                    System.out.println("Cancer");
                } else if ((day >= 23 && (month.equals("july") || month.equals("7"))) || (day <= 22 && (month.equals("august") || month.equals("8")))) {
                    System.out.println("Leo");
                } else if ((day >= 22 && (month.equals("august") || month.equals("8"))) || (day <= 22 && (month.equals("september") || month.equals("9")))) {
                    System.out.println("Virgo");
                } else if (((day >= 23 && day <= 30) && (month.equals("september") || month.equals("9"))) || (day <= 22 && (month.equals("october") || month.equals("10")))) {
                    System.out.println("Libra");
                } else if ((day >= 22 && (month.equals("october") || month.equals("10"))) || (day <= 21 && (month.equals("november") || month.equals("11")))) {
                    System.out.println("Scorpio");
                } else if (((day >= 22 && day <= 30) && (month.equals("november") || month.equals("11"))) || (day <= 22 && (month.equals("december") || month.equals("12")))) {
                    System.out.println("Sagittarius");
                } else if ((day >= 22 && (month.equals("december") || month.equals("12"))) || (day <= 19 && (month.equals("january") || month.equals("1")))) {
                    System.out.println("Capricorn");
                } else {
                    System.out.println("Please check your day and month if it's wrote correctly \n like " +
                            "there is not 31 / 2 (January)");
                }

            } else {
                System.out.println("huh!!! 32 > xx??\n Really?");
            }



        } catch (Exception e) {
            System.out.println("Dude!!, you know month start from 1 - 31. What's your problem? ");
        }
    }
}

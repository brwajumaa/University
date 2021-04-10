  /*
   * it's the second version of the zodiac project no error and easy to use, which is contain two parts
   * one is for reducing and make easy code without writing all inside the if else, which we create
   * variable to month and days
   * the second part is the if which is really easy to read
   *
   * */




import java.util.Scanner;
public class zodiac_v2 {
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


            //moth and day variable
            boolean jan1 = (day >= 20  && (month.equals("january") || month.equals("1")));
            boolean jan2 = (day <= 19 && (month.equals("january") || month.equals("1")));
            boolean feb1 = (day <= 18 && (month.equals("february") || month.equals("2"))) ;
            boolean feb2 = ((day >= 19 && day <= 29) && (month.equals("february") || month.equals("2")));
            boolean mar1 = (day <= 20 && (month.equals("march") || month.equals("3")));
            boolean mar2 = (day >= 21 && (month.equals("march") || month.equals("3")));
            boolean apr1 = (day <= 19 && (month.equals("april") || month.equals("4")));
            boolean apr2 = ((day >= 20 && day <= 30) && (month.equals("april") || month.equals("4")));
            boolean may1 = (day <= 20 && (month.equals("may") || month.equals("5")));
            boolean may2 = (day >= 21 && (month.equals("may") || month.equals("5"))) ;
            boolean jun1 = (day <= 20 && (month.equals("june") || month.equals("6")));
            boolean jun2 = ((day >= 21 && day <= 30) && (month.equals("june") || month.equals("6")));
            boolean jul1 = (day <= 22 && (month.equals("july") || month.equals("7")));
            boolean jul2 = (day >= 23 && (month.equals("july") || month.equals("7")));
            boolean aug1 = (day <= 22 && (month.equals("august") || month.equals("8")));
            boolean aug2 = (day >= 22 && (month.equals("august") || month.equals("8")));
            boolean sep1 = (day <= 22 && (month.equals("september") || month.equals("9")));
            boolean sep2 = ((day >= 23 && day <= 30) && (month.equals("september") || month.equals("9")));
            boolean oct1 = (day <= 22 && (month.equals("october") || month.equals("10")));
            boolean oct2 = (day >= 22 && (month.equals("october") || month.equals("10")));
            boolean nov1 = (day <= 21 && (month.equals("november") || month.equals("11")));
            boolean nov2 = ((day >= 22 && day <= 30) && (month.equals("november") || month.equals("11")));
            boolean dec1 = (day <= 22 && (month.equals("december") || month.equals("12")));
            boolean dec2 = (day >= 22 && (month.equals("december") || month.equals("12")));



            //create an If to don't let users to give a number more than 31
            if(day > 0 && day <= 31) {

                // main function for recognize the month
                if (jan1 || feb1) {
                    System.out.println("Aquarius");

                } else if ( feb2 || mar1 ) {
                    System.out.println("Pisces");

                    if(day == 29){
                        System.out.println("you was born in special year (Leap Year), which February have " + day + " days instead 28");
                    }

                } else if ( mar2 || apr1 ) {
                    System.out.println("Aries");

                } else if ( apr2 || may1 ) {
                    System.out.println("Taurus");

                } else if ( may2 || jun1 ) {
                    System.out.println("Gemini");

                } else if ( jun2 || jul1 ) {
                    System.out.println("Cancer");

                } else if ( jul2 || aug1 ) {
                    System.out.println("Leo");

                } else if ( aug2 || sep1 ) {
                    System.out.println("Virgo");

                } else if ( sep2 || oct1 ) {
                    System.out.println("Libra");

                } else if ( oct2 || nov1 ) {
                    System.out.println("Scorpio");

                } else if ( nov2 || dec1 ) {
                    System.out.println("Sagittarius");

                } else if ( dec2 || jan2 ) {
                    System.out.println("Capricorn");

                    //if input is wrong
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

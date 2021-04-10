import javax.swing.*;
public class zodiac_v3_graphical {

    public static void main(String[] args) {



        // adding Exception to fix int wrong symbol
        try {


            //Creating variable for day and month
            int day;
            String month;
            //Getting input
            day = Integer.parseInt(JOptionPane.showInputDialog(null,"You can write your month's Name or Number [\"December\", \"12\"]","enter the day"));
            month = (JOptionPane.showInputDialog("You can write your month's Name or Number [\"December\", \"12\"]","enter the month"));
            // changing letters to lower case
            month = month.toLowerCase();


            //create an If to don't let users to give a number more than 31
            if(day > 0 && day <= 31) {


                /*
                 *Graphical Version
                 * it's the Third version of the zodiac project with Graphical interface & no error and easy to use, which is contain all operation inside IF Else
                 * we have 2 general conditions one for month, one for day. check the day and the month to give you it's you Zodiac Symbol
                 * inside those conditions we have two other conditions
                 * first bracket: The first condition is to select the day for the Symbols and the other one is for don't let the user enter wrong
                 *       number for the month like (30 / February) we know in February we have 28 days for a normal year and 29 days for Leap year
                 *      The second condition is for to write number of the month instead the Name like (1 || january)
                 * Second  is like the first one without selecting day's number of months
                 * */

                if ((day >= 20  && (month.equals("january") || month.equals("1"))) || (day <= 18 && (month.equals("february") || month.equals("2")))) {
                    JOptionPane.showMessageDialog(null, "Aquarius");
                } else if (((day >= 19 && day <= 29) && (month.equals("february") || month.equals("2"))) || (day <= 20 && (month.equals("march") || month.equals("3")))) {
                    if((day != 29)) {
                        JOptionPane.showMessageDialog(null, "Pisces");
                    }else{
                        JOptionPane.showMessageDialog(null,"you was born in special year (Leap Year), which February have 29 days instead 28");
                        JOptionPane.showMessageDialog(null, "Pisces");
                    }
                } else if ((day >= 21 && (month.equals("march") || month.equals("3"))) || (day <= 19 && (month.equals("april") || month.equals("4")))) {
                    JOptionPane.showMessageDialog(null, "Aries");
                } else if (((day >= 20 && day <= 30) && (month.equals("april") || month.equals("4"))) || (day <= 20 && (month.equals("may") || month.equals("5")))) {
                    JOptionPane.showMessageDialog(null, "Taurus");
                } else if ((day >= 21 && (month.equals("may") || month.equals("5"))) || (day <= 20 && (month.equals("june") || month.equals("6")))) {
                    JOptionPane.showMessageDialog(null, "Gemini");
                } else if (((day >= 21 && day <= 30) && (month.equals("june") || month.equals("6"))) || (day <= 22 && (month.equals("july") || month.equals("7")))) {
                    JOptionPane.showMessageDialog(null, "Cancer");
                } else if ((day >= 23 && (month.equals("july") || month.equals("7"))) || (day <= 22 && (month.equals("august") || month.equals("8")))) {
                    JOptionPane.showMessageDialog(null, "Leo");
                } else if ((day >= 22 && (month.equals("august") || month.equals("8"))) || (day <= 22 && (month.equals("september") || month.equals("9")))) {
                    JOptionPane.showMessageDialog(null, "Virgo");
                } else if (((day >= 23 && day <= 30) && (month.equals("september") || month.equals("9"))) || (day <= 22 && (month.equals("october") || month.equals("10")))) {
                    JOptionPane.showMessageDialog(null, "Libra");
                } else if ((day >= 22 && (month.equals("october") || month.equals("10"))) || (day <= 21 && (month.equals("november") || month.equals("11")))) {
                    JOptionPane.showMessageDialog(null, "Scorpio");
                } else if ((day >= 22 && (month.equals("november") || month.equals("11"))) || (day <= 22 && (month.equals("december") || month.equals("12")))) {
                    JOptionPane.showMessageDialog(null, "Sagittarius");
                } else if ((day >= 22 && (month.equals("december") || month.equals("12"))) || (day <= 19 && (month.equals("january") || month.equals("1")))) {
                    JOptionPane.showMessageDialog(null, "Capricorn");
                } else {
                	/*\
                	 * "Please check your day and month if it's wrote correctly \n like " +
                            "there is not 31 / 2 (January)"
                	 */
                    JOptionPane.showMessageDialog(null, "\"Please check your day and month if it's wrote correctly \\n like \" \n" +
                            "                            \"there is not 31 / 2 (January)\"");
                }

            } else {
//                System.out.println("huh!!! 32 > xx??\n Really?");
                JOptionPane.showMessageDialog(null, "\"huh!!! 32 > xx??\\n Really?\"");
            }



        } catch (Exception e) {
//            System.out.println("Dude!!, you know month start from 1 - 31. What's your problem? ");
            JOptionPane.showMessageDialog(null, "\"Dude!!, you know month start from 1 - 31. What's your problem?\"");

        }
    }

}
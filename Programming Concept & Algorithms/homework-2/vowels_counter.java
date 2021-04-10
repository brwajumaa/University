import java.util.Scanner;

public class vowels_counter {
    public static void main(String[]args){

        // Creating Scanner for getting inputs
        System.out.print("Input The String: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //creating integer and for
        int count = 0;
        for (int ch=0 ; ch<sentence.length(); ch++){
            char vowel = sentence.charAt(ch);
            if(vowel == 'a'|| vowel == 'e'|| vowel == 'i' ||vowel == 'o' ||vowel == 'u'){
                count ++;
            }
        }
        System.out.println("Number of vowels in the string:  " + count);

    }
}

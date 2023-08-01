import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the word to be analyzed: ");
        String word = sc.nextLine();

        int numVowels = 0;
        String vowels = "aeiouAEIOU";

        //word = word.toString().toLowerCase();

        for (int i=0; i <word.length(); i++) {
            char letter = word.charAt(i);

            //if the character we pass is contained in the variable that the variables are defined in, we count it
            if(vowels.contains(String.valueOf(letter))) {
                numVowels++;
            }
        }

        System.out.println("The word: " + word + ", has " + numVowels + " vowels");
    }
}

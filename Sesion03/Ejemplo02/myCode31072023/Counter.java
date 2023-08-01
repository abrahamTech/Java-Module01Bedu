package Sesion03.Ejemplo02.myCode31072023;

public class Counter {
    //Method that will return a boolean to see if it is a vowel or not
    public boolean isVowel(char c) {
        return (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                );
    }

    //Method that will return a boolean to see if it is a number
    public boolean isNumber(char c) {
        //CAST from char to short
        short asciiCode = (short) c;

        //The numbers from 0-9 in ASCII are 48 to 57
        return (
                asciiCode >= 48 && asciiCode<=57
                );
    }

    //Method that will return a boolean to see if it is a consonant
    public boolean isConsonant(char c) {
        //CAST from char to short
        short asciiCode = (short) c;

        //The letter from a-z in ASCII are 97 to 122
        return asciiCode >=97 && asciiCode <= 122 && !isVowel(c);
    }

    //Method that will return a boolean to see if it is a symbol
    public boolean isSymbol(char c) {
        return (!isVowel(c) && !isConsonant(c) && isNumber(c));
    }


    

    //Method that will return a number of vowels in the String
    public int numVowels(String s) {
        int counter = 0;

        //toCharArray() -> Loop through the entire string, character by character
        for (char c: s.toCharArray() ) {
            if(isVowel(c)){
                counter ++;
            }
        }

        return counter;
    }

    //Method that will return a number of numbers in the String
    public int numNumbers(String s) {
        int counter = 0;

        //toCharArray() -> Loop through the entire string, character by character
        for (char c: s.toCharArray() ) {
            if(isNumber(c)){
                counter ++;
            }
        }

        return counter;
    }

    //Method that will return a number of consonants in the String
    public int numConsonants(String s) {
        int counter = 0;

        //toCharArray() -> Loop through the entire string, character by character
        for (char c: s.toCharArray() ) {
            if(isConsonant(c)){
                counter ++;
            }
        }

        return counter;
    }

    //Method that will return a number of symbols in the String
    public int numSymbols(String s) {
        int counter = 0;

        //toCharArray() -> Loop through the entire string, character by character
        for (char c: s.toCharArray() ) {
            if(isSymbol(c)){
                counter ++;
            }
        }

        return counter;
    }
}

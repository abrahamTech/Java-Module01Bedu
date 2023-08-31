package Sesion03.Ejemplo02.myCode31072023;

public class Letters {
    public static void main(String[] args) {

        //Get the String to Analize with LECTOR class
        Reader lector = new Reader();

        lector.showMessage("Enter the text to analize: ");
        String text = lector.readInput();

        //The counter only works with lowercase letters
        //text = text.toLowerCase();

        //Analize the String with CONTADOR class
        Counter contador = new Counter();

        int numVow = contador.numVowels(text);
        int numNum = contador.numNumbers(text);
        int numCon = contador.numConsonants(text);
        int numSym = contador.numConsonants(text);

        lector.showMessage("There are " + numVow + " Vowels");
        lector.showMessage("There are " + numNum + " Numbers");
        lector.showMessage("There are " + numCon + " Consonants");
        lector.showMessage("There are " + numSym + " Symbols");

    }
}

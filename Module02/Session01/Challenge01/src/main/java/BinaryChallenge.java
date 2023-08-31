package Module02.Session01.Challenge01.src.main.java;

public class BinaryChallenge {
    public static void main(String[] args) {
        int number = 20;

        String binary = Integer.toBinaryString(number);



        System.out.println("The number: " + number + " in binary is: " + binary);
        //1.- Compile with `gradle build` in the menu
        //2.- Execute with `java -jar build/libs/Challenge01.jar` in the terminal
    }
}

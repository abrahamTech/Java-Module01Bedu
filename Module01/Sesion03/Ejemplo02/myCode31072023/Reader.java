package Sesion03.Ejemplo02.myCode31072023;

import java.util.Scanner;

public class Reader {
    //Scanner Attribute
    private Scanner sc = new Scanner(System.in);

    //Method to PRINT a Message with Scanner
    public void showMessage(String message) {
        System.out.println(message);
    }

    //Method to READ a user input
    public String readInput() {
        //If you don't use "void" you need to RETURN something
        return sc.nextLine();
    }
}

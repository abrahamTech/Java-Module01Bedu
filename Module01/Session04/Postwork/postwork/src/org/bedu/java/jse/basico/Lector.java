package Session04.Postwork.postwork.src.org.bedu.java.jse.basico;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.print("Opción: ");
        return scanner.nextByte();
    }
}

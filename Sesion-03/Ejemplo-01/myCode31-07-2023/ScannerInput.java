import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        // Scanner Constructor
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Hi " + name + "!");
    }
}

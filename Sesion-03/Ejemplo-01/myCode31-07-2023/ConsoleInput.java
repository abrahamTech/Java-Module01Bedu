import java.io.Console;

public class ConsoleInput {

    public static void main(String[] args) {
        //Creating the console (Without instance)
        Console console = System.console();

        //Validate that console exist
        if(console == null) {
            System.err.println("No console");
            //Finish the program
            System.exit(1);
        }

        System.out.println("Enter your name: ");
        String name = console.readLine();

        System.out.println("Hi " + name + "!");

        //First go to the folder that has the Class
        //cd src/main/java

        //Next: Compile the program
        //javac FileName.java

        //Then, a class object will be created to execute it.
        //FileName.class

        //Finally Execute the program in console
        //java FileName

    }
}

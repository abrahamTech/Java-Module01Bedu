public class Cycles {
    public static void main(String[] args) {

        System.out.println("\n**FOR with i++**");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n**FOR with ++i**");
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i);
        }

        // Array Iteration FOR and FOR EACH
        short[] values = {1,2,3,4,5,6,7,8,9};

        System.out.println("\n**Array Iteration with For**");
        for (int i = 0; i < values.length; i++) {
            System.out.println("F" + values[i]);
        }

        System.out.println("\n**Array Iteration with For Each**");
        for (short value : values) {
            System.out.println("FE" +value);
        }

        // While
        System.out.println("\n**While**");
        short i = 0;

        // Receive a Condition (Works until the condition is false)
        while (++i <= 10) {
            System.out.println("W" + i);
        }

        //Do While
        System.out.println("\n**Do While**");

        short f = 0;
        do {
            System.out.println("Bye");
        } while (++f <= 3); {
            System.out.println("DW" + f);
        }
    }
}

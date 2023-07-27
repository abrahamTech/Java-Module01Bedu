public class DataType {
    public static void main(String[] args) {
        // Explicitly Typed -> the data type of a variable must be declared before using it.
        // Extrict Typed -> the variable can´t change of data type

        byte valueByte = 1;
        short valueShort = 1;
        int valueInt = 77;
        long valueLong = 1L;

        float valueFloat = 1.5F;
        double valueDouble = 1.5;

        boolean valueBoolean = false;

        char valueChar = 'B';

        // Error: int numAdd1 = valueInt + valueFloat;
        float numAdd1 = valueInt + valueFloat;

        // CAST -> Chant data type of a variable
        System.out.println("\n**CAST**");

        int newFloatInt = (int) valueFloat;
        // newFloatInt = 1 not 1.5
        System.out.println(newFloatInt);

        int newCharInt = (int) valueChar;
        // newFloatInt = 66
        System.out.println(newCharInt);

        char newIntChar = (char) valueInt;
        // newFloatInt = M not 77
        System.out.println(newIntChar);


        // INT -> Increase and Decrease
        int num1 = 1;
        System.out.println("\nINT-> Increase and decrease of variable: " + num1);
        num1 = num1 + 1;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);

        // CHAR -> Increase and Decrease
        char char1 = 'B';
        System.out.println("\nCHAR-> Increase and decrease of variable: " + char1);
        char1++;
        System.out.println(char1);
        char1--;
        System.out.println(char1);

        }
}

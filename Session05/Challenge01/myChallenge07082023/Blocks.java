package Session05.Challenge01.myChallenge07082023;

public class Blocks {
    //Final values ​​in Java are in UPPERCASE.
    private static final int VALUE;
    //"final" -> we will not be able to modify a value
    //Final Methods -> Means that we cannot override the method
    //Final Classes -> Means that cannot have daughters (NO Inheritance)



    //We can initialize in the Constructor or in a Initialize Block
    //It is a static variable, so we have to initialize it in an initialization block
    static {
        VALUE = 7;
    }


    public static void showValue() {
        System.out.println("Value: " + VALUE);
    }
}

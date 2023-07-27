public class Challenge01 {
    public static void main(String[] args) {

        // Challenge 01
        short valueShortMax = Short.MAX_VALUE;
        System.out.println("\nShortMax value before increment: " + valueShortMax);
        valueShortMax++;
        System.out.println("ShortMax value after increment: " + valueShortMax);

        byte valueByteMax = Byte.MAX_VALUE;
        System.out.println("\nByteMax value before increment: " + valueByteMax);
        valueByteMax++;
        System.out.println("ByteMax value after increment: " + valueByteMax);

        float valueFloatMax = Float.MAX_VALUE;
        System.out.println("\nFloatMax value before increment: " + valueFloatMax);
        valueFloatMax++;
        System.out.println("FloatMax value after increment: " + valueFloatMax);

        double valueDoubleMax = Double.MAX_VALUE;
        System.out.println("\nDoubleMax value before increment: " + valueDoubleMax);
        valueDoubleMax++;
        System.out.println("DoubleMax value after increment: " + valueDoubleMax);

        // Explanation
        // If a value exceeds the maximum range for integer data types (byte, short, int, long), an overflow occurs and the value "wraps" the range of negative values.
        // Floating-point data types (float and double) behave differently due to how floating-point numbers are represented in IEEE Standard 754. If a calculation results in a number that is too large to be represented, the result will be "Infinity" (Infinity). Similarly, if the calculation results in a number that is too small to be represented, the result will be "0"
    
    }
}

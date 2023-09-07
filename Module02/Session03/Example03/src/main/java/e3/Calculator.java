package e3;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) {

        if (b == 0) {
            throw new IllegalArgumentException("No es posible dividir un valor entre 0");
        }

        return a / b;
    }
}

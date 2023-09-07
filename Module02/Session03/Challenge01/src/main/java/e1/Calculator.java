package e1;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b){

        if(b == 0){
            throw new IllegalArgumentException("It is not possible to divide a value by 0");
        }

        return a / b;
    }

}

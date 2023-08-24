package Session10.Example03Polymorphism;

public abstract class Operation {
    int value1;
    int value2;

    int result;

    public void print() {
        System.out.println("The result is: " + result);
    }

    public abstract void operate();
}

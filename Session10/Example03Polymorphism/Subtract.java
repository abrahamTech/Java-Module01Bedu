package Session10.Example03Polymorphism;

public class Subtract extends Operation{

    //Class 'Subtract' must either be declared abstract or implement abstract method
    @Override
    public void operate() {
        result = value1 - value2;
    }
}

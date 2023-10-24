package org.example.Example03;

//We can use objects that come from Number
public class LimitedConverter <E extends Number>{

    public boolean isGreaterThan(E number1, E number2) {
        System.out.println(number1.doubleValue() - number2.doubleValue());
        return (number1.doubleValue() - number2.doubleValue()) > 0;
    }
}

package org.example.Example03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitedConverterTest {

    @Test
    @DisplayName("With Integers")
    void integersFunc() {
        Integer number1 = 5;
        Integer number2 = 10;

        LimitedConverter<Integer> converter = new LimitedConverter<>();

        //If it is false it will pass the test
        assertFalse(converter.isGreaterThan(number1, number2));
    }

    @Test
    @DisplayName("With Doubles")
    void doublesFunc() {
        Double number1 = 3.4;
        Double number2 = 4.7;

        LimitedConverter<Double> converter = new LimitedConverter<>();

        //If it is false it will pass the test
        assertFalse(converter.isGreaterThan(number1, number2));
    }
}
package e3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorSubstractTest {

    static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Substract Test")
    void substract() {
        int expected = 1;
        assertEquals(expected, calculator.substract(3,2));
    }
}
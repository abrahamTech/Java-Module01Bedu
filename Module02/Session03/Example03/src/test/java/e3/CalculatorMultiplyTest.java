package e3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMultiplyTest {

    static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Multiply Test")
    void multiply() {
        int expected = 6;
        assertEquals(expected, calculator.multiply(3,2));
    }
}
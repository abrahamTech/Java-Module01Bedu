package e3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorDivideTest {

    static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Divide Test")
    void divide() {
        int expected = 9;
        assertEquals(expected, calculator.divide(18,2));
    }
}
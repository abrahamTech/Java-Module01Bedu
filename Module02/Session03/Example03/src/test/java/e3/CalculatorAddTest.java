package e3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAddTest {
    static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add Test")
    void add() {
        int expected = 5;
        assertEquals(expected, calculator.add(3,2));
    }
}
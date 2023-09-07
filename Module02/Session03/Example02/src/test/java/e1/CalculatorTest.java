package e1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Add Test")
    void add() {
        int expected = 5;
        assertEquals(expected, calculator.add(3,2));
    }

    @Test
    @DisplayName("Substract Test")
    void subtract() {
        int expected = 1;
        assertEquals(expected, calculator.subtract(3,2));
    }

    @Test
    @DisplayName("Multiply Test")
    void multiply() {
        int expected = 6;
        assertEquals(expected, calculator.multiply(3,2));
    }

    @Test
    @DisplayName("Divide Test")
    void divide() {
        float expected = 1.5F;
        assertEquals(expected, calculator.divide(3,2));
    }

    @Test
    @DisplayName("Divide Test with Exception")
    void divideException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(100, 0), "It is not possible to divide a value by 0");
    }
}
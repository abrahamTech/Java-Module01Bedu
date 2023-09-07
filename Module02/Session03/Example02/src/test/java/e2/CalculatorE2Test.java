package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CalculatorE2Test {

    @Mock
    CalculatorDao calculatorDao; //Declare the class with the values

    @InjectMocks
    CalculatorE2 calculator; //Inject the class values

    @BeforeEach
    void setUp() {
        given(calculatorDao.findValueConstant()).willReturn(3);
    }

    @Test
    @DisplayName("Add Test")
    void add() {
        int expected = 8; //3 + 2 + 3(Mockito value declared in @BeforeEach void setUp{})
        assertEquals(expected, calculator.add(3,2));
    }

    @Test
    @DisplayName("Substract Test")
    void subtract() {
        int expected = 4; //3 - 2 + 3(Mockito value declared in @BeforeEach void setUp{})
        assertEquals(expected, calculator.subtract(3,2));
    }

    @Test
    @DisplayName("Multiply Test")
    void multiply() {
        int expected = 9; //3 * 2 + 3(Mockito value declared in @BeforeEach void setUp{})
        assertEquals(expected, calculator.multiply(3,2));
    }
}
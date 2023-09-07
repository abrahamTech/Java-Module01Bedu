package e3;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorAddTest.class, CalculatorSubstractTest.class, CalculatorMultiplyTest.class, CalculatorDivideTest.class})
public class CalculatorTest {
}

package org.abrahamtech.session01B;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.abrahamtech.session01B.exception.InvalidSequenceException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BalancedParenthesesTest {
    
    @Test
    @DisplayName("Empty sequence should be valid")
    public void emptyCase() throws InvalidSequenceException {
        boolean result01 = BalancedParentheses.isBalanced("");

        assertEquals(true, result01);
    }

    @Test
    @DisplayName("Not balanced sequence should be invalid")
    public void notBalancedCase() throws InvalidSequenceException {
        boolean result01 = BalancedParentheses.isBalanced(")(");

        assertEquals(false, result01);
    }

    @Test
    @DisplayName("Non-parentheses sequence should be invalid")
    public void nonParenthesesCase() {
        assertThrows(InvalidSequenceException.class, () -> BalancedParentheses.isBalanced("abc"));
    }

}

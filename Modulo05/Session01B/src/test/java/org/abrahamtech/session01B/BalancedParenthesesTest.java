package org.abrahamtech.session01B;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BalancedParenthesesTest {
    
    @Test
    @DisplayName("Empty sequence should be valid")
    public void emptyCase() {
        boolean result01 = BalancedParentheses.isBalanced("");

        assertEquals(true, result01);
    }

    @Test
    @DisplayName(")( sequence should be not valid")
    public void notBalancedCase() {
        boolean result01 = BalancedParentheses.isBalanced(")(");

        assertEquals(false, result01);
    }
}

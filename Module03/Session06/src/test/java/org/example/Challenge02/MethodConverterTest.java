package org.example.Challenge02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodConverterTest {

    @Test
    @DisplayName("Test with Integers")
    void prueba(){
        Integer input = 23423;
        String expected = "23423";

        String output = MethodConverter.convertToString(input);

        assertEquals(expected, output);
    }

}
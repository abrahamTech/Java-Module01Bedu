package org.example.Challenge01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    @DisplayName("Convert to integers")
    void stringFunc() {
        Integer integer = 5242;
        String expected = "5242";

        Converter<Integer> integerConverter = new Converter<>();

        assertEquals(expected, integerConverter.convert(integer));
    }

    @Test
    @DisplayName("Convert to Boolean")
    void booleanFunc() {
        Boolean aBoolean = Boolean.TRUE;
        String expected = "true";

        Converter<Boolean> integerConverter = new Converter<>();

        assertEquals(expected, integerConverter.convert(aBoolean));
    }
}
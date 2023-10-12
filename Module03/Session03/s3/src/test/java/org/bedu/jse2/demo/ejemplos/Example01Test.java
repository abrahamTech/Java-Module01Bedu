package org.bedu.jse2.demo.ejemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example01Test {

    @Test
    @DisplayName("Add of two strings converted to Integers")
    void addUpTwoIntegers(){
        String a = "4";
        String b = "8";

        Integer expected = 12;;

        Example01 example01 = new Example01();
        assertEquals(expected, example01.add(a, b));
    }
}
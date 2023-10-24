package org.example.Example02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchoClassTest {
    @Test
    @DisplayName("Echo of a String (Explicit generic)")
    void echoString() {
        String input = "Hello world";
        String output = EchoClass.<String>echo(input);

        assertEquals(input, output);
    }

    //Recommended
    @Test
    @DisplayName("Echo of a Integer (Implicit generic, type inflicted)")
    void echoInteger() {
        Integer input = 71345;
        Integer output = EchoClass.echo(input);

        assertEquals(input, output);
    }
}
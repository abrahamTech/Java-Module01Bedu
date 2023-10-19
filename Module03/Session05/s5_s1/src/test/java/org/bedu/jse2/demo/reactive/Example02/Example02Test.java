package org.bedu.jse2.demo.reactive.Example02;

import org.bedu.jse2.demo.reactive.example01.Example01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Example02Test {

    @Test
    @DisplayName("Add the elements and returns Mono")
    void addMono() {
        Example02.addMono()
                .subscribe(s -> assertThat(s).isEqualTo(21));
    }

    @Test
    @DisplayName("Add the elements and returns a value (blocker)")
    void add() {
        assertThat(Example02.add()).isEqualTo(21);
    }
}
package org.bedu.jse2.demo.reactive.example01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Example01Test {

    @Test
    @DisplayName("Add the elements and returns Single")
    void addSingle() {
        Example01.addSingle()
                .subscribe(s -> assertThat(s).isEqualTo(21));
    }

    @Test
    @DisplayName("Add the elements and returns a value (blocker)")
    void add() {
        assertThat(Example01.add()).isEqualTo(21);
    }
}
package org.bedu.jse2.demo.reactive.Challenge01;

import org.bedu.jse2.demo.reactive.example01.Example01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Challenge01Test {

    @Test
    @DisplayName("Add the elements and returns Single")
    void addSingle() {
        Challenge01.addSingle()
                .subscribe(s -> assertThat(s).isEqualTo(21));
    }

    @Test
    @DisplayName("Add the elements and returns a value (blocker)")
    void add() {
        assertThat(Challenge01.add()).isEqualTo(21);
    }

    @Test
    @DisplayName("Challenge 01")
    void cubosFiltrados(){
        Challenge01.challenge1().subscribe(s -> assertThat(s).isEqualTo(405));
    }
}
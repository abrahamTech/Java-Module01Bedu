package org.bedu.jse2.demo.reactive.Challenge02;

import org.bedu.jse2.demo.reactive.Example02.Example02;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Challenge02Test {

    @Test
    @DisplayName("Add the elements and returns Mono")
    void addMono() {
        Challenge02.addMono()
                .subscribe(s -> assertThat(s).isEqualTo(21));
    }

    @Test
    @DisplayName("Add the elements and returns a value (blocker)")
    void add() {
        assertThat(Challenge02.add()).isEqualTo(21);
    }

    @Test
    @DisplayName("Challenge 2")
    void cubosFiltrados(){
        Challenge02.challenge2().subscribe(s -> assertThat(s).isEqualTo(36));
    }
}
package org.bedu.jse2.demo.ejemplos;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Example02Test {

    private final List<Integer> SET = Arrays.asList(1, 4, 6, 2, -5, 9);

    @Test
    @DisplayName("Negatives")
    void negatives(){
        Example02 example02 = new Example02();
        List<Integer> real = example02.transform(SET, s -> -s);
        assertThat(real).containsExactly(-1, -4, -6, -2, 5, -9);
    }

    @Test
    @DisplayName("Squares")
    void squares(){
        Example02 example02 = new Example02();
        List<Integer> real = example02.transform(SET, s -> s * s);
        assertThat(real).containsExactly(1, 16, 36, 4, 25, 81);
    }

}
package org.bedu.jse2.demo.ejemplos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


class Example03Test {

    IntStream iterator = new Random().ints(10, 1, 2);

    @Test
    @DisplayName("Manipulate and add")
    void transformsAndAdsUp(){
        Example03 example03 = new Example03();

        List<Integer> set = Arrays.asList(1,4,-6,7,3,5,-1);

        Integer expected = -27;

        assertThat(example03.manipulate(set, i -> i < 0 ? i:-i)).isEqualTo(expected);

    }

}

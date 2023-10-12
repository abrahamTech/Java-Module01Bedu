package org.bedu.jse2.demo.ejemplos;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


class Example03Test {

    @Test
    @DisplayName("Manipulate and add")
    void transformsAndAdsUp(){
        Example03 example03 = new Example03();

        List<Integer> set = Arrays.asList(1,4,-6,7,3,5,-1);

        Integer expected = -27;

        assertThat(example03.manipulate(set, i -> i < 0 ? i:-i)).isEqualTo(expected);

    }

    //Extra
    IntStream iterator = new Random().ints(10, 1, 2);

    @Test
    @DisplayName("Add numbers")
    void addNumbers() {
        assertThat(iterator.sum()).isEqualTo(10);
    }

    @Test
    @DisplayName("Check values")
    void checkValues() {
        System.out.println(Arrays.toString(iterator.toArray()));
    }

    List<String> list = Arrays.asList("Anthony", "Maria", "Jhon", "Peter", "Raphael", "Jim");

    @Test
    @DisplayName("Iterate with For")
    void iterateWithFor(){
        int i = 0;
        for (String name : list) {
            if (name.contains("a")) {
                i++;
            }
        }
        //A !== a That explains why it gets 2
        assertThat(i).isEqualTo(2);
    }

    @Test
    @DisplayName("Iterate with Stream")
    void iterateWithStream(){
        //A !== a That explains why it gets 2
        assertThat(list.stream().filter(name -> name.contains("a")).count()).isEqualTo(2);
    }


}

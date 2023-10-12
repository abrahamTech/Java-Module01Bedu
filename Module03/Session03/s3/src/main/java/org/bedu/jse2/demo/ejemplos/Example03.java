package org.bedu.jse2.demo.ejemplos;

import java.util.List;
import java.util.function.IntUnaryOperator;

public class Example03 {
    Integer manipulate(List<Integer> set, IntUnaryOperator transformation){
        return set.stream().mapToInt(s -> s).map(transformation).sum();
    }
}

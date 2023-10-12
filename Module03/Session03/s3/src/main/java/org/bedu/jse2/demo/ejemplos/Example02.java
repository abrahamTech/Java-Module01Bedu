package org.bedu.jse2.demo.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Example02 {

    List<Integer> transform(Iterable<Integer> set, Function<Integer, Integer> function){
        List<Integer> list = new ArrayList<>();
        for (Integer value: set) {
            list.add(function.apply(value));
        }
        return list;
    }
}

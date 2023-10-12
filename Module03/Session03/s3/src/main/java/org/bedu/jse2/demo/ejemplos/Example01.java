package org.bedu.jse2.demo.ejemplos;

import java.util.function.Function;

public class Example01 {

    //With Anonymous function
    //private final StringToInteger parser = new StringToInteger() {
    //    @Override
    //    public Integer convert(String str) {
    //        return null;
    //    }
    //};

    //With Lambda Function
    //private final StringToInteger parser = str -> Integer.parseInt(str);

    //Lambda with reference method
    /*private final StringToInteger parser = Integer::parseInt;

    Integer add(String a, String b){
        return parser.convert(a) + parser.convert(b);
    }*/

    //Challenge01
    private final Function<String, Integer> parser = Integer::parseInt;

    Integer add(String a, String b){
        return parser.apply(a) + parser.apply(b);
    }


}

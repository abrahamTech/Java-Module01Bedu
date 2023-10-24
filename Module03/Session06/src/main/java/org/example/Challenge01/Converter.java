package org.example.Challenge01;

public class Converter<E> {
    private E param;

    public String convert(E param){
        return param.toString();
    }
}

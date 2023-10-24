package org.example.Example02;

public class EchoClass {

    //The <E> says that the method is generic. The E is the type of data that will be returned, and the (E input) is the parameter that will be received.
    public static <E> E echo(E input) {
        return  input;
    }
}

package org.example.Challenge02;

public class MethodConverter {

    //The <E> says that the method is generic. The String is the type of data that will be returned, and the (E input) is the parameter that will be received.
    public static <E> String convertToString(E input) {
        return input.toString();
    }
}

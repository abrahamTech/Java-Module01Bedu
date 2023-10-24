package org.example.Example01;

public class Holder<E> {
    private E object;

    void hold(E object) {
        this.object = object;
    }

    E release() {
        return object;
    }
}

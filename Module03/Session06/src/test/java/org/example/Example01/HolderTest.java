package org.example.Example01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolderTest {

    @Test
    @DisplayName("Can save an Integer")
    void intNum() {
        Integer integer = 123;
        Holder<Integer> holder = new Holder<>();
        holder.hold(integer);

        assertEquals(integer, holder.release());
    }

    @Test
    @DisplayName("Can save a String")
    void string() {
        String str = "Hello World";
        Holder<String> holder = new Holder<>();
        holder.hold(str);

        assertEquals(str, holder.release());
    }

    private class OwnClass {
        private final String name;
        private final Integer age;

        public OwnClass(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

    @Test
    @DisplayName("Can save an own class")
    void ownCl() {
        OwnClass oc = new OwnClass("Beto", 10);
        Holder<OwnClass> holder = new Holder<>();
        holder.hold(oc);

        assertEquals(oc.getName(), "Beto");
        assertEquals(oc.getAge(), 10);
    }
}
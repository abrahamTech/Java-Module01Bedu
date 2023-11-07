package org.example;

import org.example.hilos.Hilos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Example 01 - THREADS
        for (int i = 1; i < 10; i++) {

            // User Thread
            // The project is not finished until the background threads finish executing
            //new Hilos("Hilo " + i, 1000).start();

            //Daemon Thread
            //The threads are executed by the virtual machine, and the project continue
            Thread hilo = new Hilos("Hilo " + i, 10000);
            hilo.setDaemon(true);
            hilo.start();

        }

        //Example 02 - LAMBDA
        System.out.println(sizeOf.apply("Bedu"));
        System.out.println(sizeOfLambda.apply("Bedu"));
        System.out.println(new SizeOfFunction().apply("Bedu"));

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Beto"));
        personas.add(new Persona("Carlos"));
        personas.add(new Persona("Andrés"));

        personas.sort(Comparator.comparing(p -> p.nombre));

        Stream<Persona> stream = personas.stream();
        List<String> nombres = stream
                .filter(p -> p.nombre != null)
                .map(p -> p.nombre)
                .collect(Collectors.toList());

        System.out.println(nombres);
    }

    //Example 02 - LAMBDA
    static Function<String, Integer> sizeOf = (String placeholder) -> {
        return placeholder.length();
    };

    static Function<String, Integer> sizeOfLambda = placeholder -> placeholder.length();

    public static class SizeOfFunction implements Function<String, Integer> {
        public Integer apply(String placeholder){
            return placeholder.length();
        }
    }

    static class Persona{
        String nombre;
        Persona(String nombre){
            this.nombre = nombre;
        }
    }
}
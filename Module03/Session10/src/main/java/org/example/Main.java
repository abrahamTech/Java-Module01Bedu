package org.example;

import org.example.hilos.Hilos;

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
    }
}
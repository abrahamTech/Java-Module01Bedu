package org.example.Example02;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example02 {
    public static void main(String[] args) {
        System.out.println("--------------- Example02 ---------------");
        List<Integer> ids = IntStream.range(1, 11)
                .boxed()
                .collect(Collectors.toList()); //.toList()

        //<CompletableFuture> It is to simplify the handling of asynchronous tasks.
        //We are going to use a CompletableFuture so that all calls to "read" process it synchronously and will return a List
        List<CompletableFuture<Double>> futures = ids.stream()
                .map(id -> CompletableFuture.supplyAsync(() -> read(id)))
                .collect(Collectors.toList());

        getAverage(futures); // Concurrent processing
    }

    static void getAverage(List<CompletableFuture<Double>> futures){
        LocalTime begin = LocalTime.now();
        double average = futures.stream()
                .mapToDouble(id -> id.join())
                .average()
                .orElse(0);
        Duration time = Duration.between(begin, LocalTime.now());
        System.out.println((Math.round(average * 100.) / 100.) + " in " + time.toMillis() + " ms");
    }

    static double read(int id){
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return id * Math.random();
    }
}

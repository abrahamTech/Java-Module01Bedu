package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example01 {

    public static void main(String[] args) {
        List<Integer> ids = IntStream.range(1, 101)
                .boxed()
                .collect(Collectors.toList()); //.toList()
        getAverage(ids.stream()); // Concurrent processing
        getAverage(ids.parallelStream()); // Parallel processing
    }

    static void getAverage(Stream<Integer> ids){
        LocalTime begin = LocalTime.now();
        double average = ids.mapToDouble(id -> read(id))
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

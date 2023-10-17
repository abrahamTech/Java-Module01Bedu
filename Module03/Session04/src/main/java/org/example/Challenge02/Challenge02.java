package org.example.Challenge02;

import org.example.Challenge01.ChainRestaurants;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge02 {

    public static void main(String[] args) {
        System.out.println("--------------- Challenge02 ---------------");
        List<Integer> ids = IntStream.rangeClosed(0, 1000)
                .boxed()
                .collect(Collectors.toList()); //.toList()

        //<CompletableFuture> It is to simplify the handling of asynchronous tasks.
        //We are going to use a CompletableFuture so that all calls to "read" process it synchronously and will return a List
        List<CompletableFuture<Double>> futures = ids.stream()
                .map(id -> CompletableFuture.supplyAsync(() -> new ChainRestaurants02().getFranchiseProfits(id)))
                .collect(Collectors.toList());

        //getAverage(futures); // Concurrent processing

        OptionalDouble maxNum = futures.stream()
                .mapToDouble(CompletableFuture::join)
                .max();

        if (maxNum.isPresent()) {
            System.out.printf("The total profits are: $%5.2f%n", maxNum.getAsDouble());
        } else {
            System.out.print("Error");
        }

    }
}

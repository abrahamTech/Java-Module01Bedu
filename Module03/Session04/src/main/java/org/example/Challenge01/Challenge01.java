package org.example.Challenge01;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge01 {

    public static void main(String[] args) {
        List<Integer> ids = IntStream.range(0, 1000)
                .boxed()
                .collect(Collectors.toList());
        getSum(ids.parallelStream());  //parallel processing
    }

    private static void getSum(Stream<Integer> ids) {
        LocalTime begin = LocalTime.now(); //We record the start time
        double addition = ids.mapToDouble(id -> new ChainRestaurants()
                        .makeFranchiseProfits(id))
                        .sum();
        System.out.printf("The total profits are: $%5.2f%n", addition);
        Duration time = Duration.between(begin, LocalTime.now());    //we record the end time
        System.out.println((Math.round(addition * 100.) / 100.) + " in " + time.toMillis() + "ms"); //we print the result

    }
}

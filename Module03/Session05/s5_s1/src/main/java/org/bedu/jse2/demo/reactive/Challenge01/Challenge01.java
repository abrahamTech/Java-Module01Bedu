package org.bedu.jse2.demo.reactive.Challenge01;

import io.reactivex.Single;
import org.bedu.jse2.demo.reactive.generator.RxJavaObservableGenerator;

public class Challenge01 {

    //Asynchronous mode
    static Single<Integer> addSingle() {
        return RxJavaObservableGenerator
                .observableStream()
                //.reduce(0, (a,b) -> a + b);
                .reduce(0, Integer::sum); //Lambda //Return a Single<Integer>
    }

    //Blocker mode (Synchronous)
    static Integer add() {
        return RxJavaObservableGenerator
                .observableStream()
                //.reduce(0, (a,b) -> a + b);
                .reduce(0, Integer::sum) //Lambda
                .blockingGet();
    }

    static Single<Integer> challenge1(){
        return RxJavaObservableGenerator
                .observableStream()
                .map( v -> v*v*v)
                .filter(v -> v > 50)
                .reduce(0, Integer::sum); //Reduce return a Single //Make an Asynchronous // Add all the values
    }
}

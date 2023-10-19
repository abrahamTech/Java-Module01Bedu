package org.bedu.jse2.demo.reactive.example01;

import io.reactivex.Single;
import org.bedu.jse2.demo.reactive.generator.RxJavaObservableGenerator;

public class Example01 {

    //Synchronous mode
    static Single<Integer> addSingle() {
        return RxJavaObservableGenerator
                .observableStream()
                //.reduce(0, (a,b) -> a + b);
                .reduce(0, Integer::sum); //Lambda //Return a Single<Integer>
    }

    //Blocker mode
    static Integer add() {
        return RxJavaObservableGenerator
                .observableStream()
                //.reduce(0, (a,b) -> a + b);
                .reduce(0, Integer::sum) //Lambda
                .blockingGet();
    }
}

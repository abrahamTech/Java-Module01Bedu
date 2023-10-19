package org.bedu.jse2.demo.reactive.Challenge02;

import org.bedu.jse2.demo.reactive.generator.ReactorFluxGenerator;
import reactor.core.publisher.Mono;

public class Challenge02 {

    //Asynchronous mode
    static Mono<Integer> addMono() {
        return ReactorFluxGenerator
                .fluxStream()
                //.reduce(0, (a,b) -> <+b)
                .reduce(0, Integer::sum);
    }

    //Blocker mode (Synchronous)
    static Integer add() {
        return ReactorFluxGenerator
                .fluxStream()
                //.reduce(0, (a,b) -> <+b)
                .reduce(0, Integer::sum)
                .block();
    }

    static Mono<Integer> challenge2(){
        return ReactorFluxGenerator
                .fluxStream()
                .flatMap(v -> Mono.just(v*v*v))
                .filter(v -> v < 50)
                .reduce(0, Integer::sum);
    }


}

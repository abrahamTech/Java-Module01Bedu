package org.bedu.jse2.demo.reactive.Challenge03;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class C3Repository {

    private static final PersonaEntityC3[] LISTA = {new PersonaEntityC3("Juan", "Romo", "Pérez", "5550000001"),
            new PersonaEntityC3("Diana", "Sánchez", "García", "5550000002"),
            new PersonaEntityC3("Sebastián", "Rodríguez", "Soto", "5550000003")};

    public Flux<PersonaEntityC3> getPersonas(){
        return Flux.fromArray(LISTA).delayElements(Duration.ofSeconds(2));
    }

}

package org.bedu.jse2.demo.reactive.Example03;

import reactor.core.publisher.Flux;

public class E3Service {
    private static final E3Repository REPOSITORY = new E3Repository();

    public Flux<String> getListaNombre(){
        return REPOSITORY
                .getPersonas()
                .map(this::formatearNombre);
    }

    private String formatearNombre(PersonaEntity persona){
        return String.format("%s %s, %s", persona.getPrimerApellido(), persona.getSegundoApellido(), persona.getNombre());
    }

}

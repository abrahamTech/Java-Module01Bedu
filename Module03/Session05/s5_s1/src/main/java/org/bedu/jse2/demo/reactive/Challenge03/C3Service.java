package org.bedu.jse2.demo.reactive.Challenge03;

import org.bedu.jse2.demo.reactive.Example03.PersonaEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class C3Service {

    private static final C3Repository REPOSITORY = new C3Repository();

    public Flux<String> getListaNombre() {
        return REPOSITORY
                .getPersonas()
                .map(this::formatearNombre);
    }


    public Mono<Agenda> buscarPorNombre(String nombre) {
        return REPOSITORY.getPersonas()
                .filter(p -> filterFunction(p, nombre))
                .map(this::personToAgenda)
                .next();
    }

    private Boolean filterFunction(PersonaEntityC3 p, String nombre) {
        return p.getNombre().contains(nombre) || p.getPrimerApellido().contains(nombre) || p.getSegundoApellido().contains(nombre);
    }

    private Agenda personToAgenda(PersonaEntityC3 p) {
        return new Agenda(String.format("%s %s %s", p.getNombre(), p.getPrimerApellido(), p.getSegundoApellido()), p.getTelefono());
    }

    private String formatearNombre(PersonaEntityC3 persona){
        return String.format("%s %s, %s", persona.getPrimerApellido(), persona.getSegundoApellido(), persona.getNombre());
    }

}

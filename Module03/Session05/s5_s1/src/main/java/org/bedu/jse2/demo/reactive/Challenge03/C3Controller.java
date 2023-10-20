package org.bedu.jse2.demo.reactive.Challenge03;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class C3Controller {
    private static final C3Service SERVICE = new C3Service();

    public Flux<String> nombresUsuarios() {
        return SERVICE.getListaNombre();
    }

    public Mono<Agenda> buscarPorNombre(String nombre) {
        return SERVICE.buscarPorNombre(nombre);
    }

}

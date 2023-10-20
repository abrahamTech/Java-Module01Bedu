package org.bedu.jse2.demo.reactive.Challenge03;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class PersonaEntityC3 {
    private final String nombre;
    private final String primerApellido;
    private final String segundoApellido;

    private final String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }
}


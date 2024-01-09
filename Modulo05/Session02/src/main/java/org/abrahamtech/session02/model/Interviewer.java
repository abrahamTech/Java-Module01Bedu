package org.abrahamtech.session02.model;

import lombok.Builder;
import lombok.Data;

// @Getter: Agregar getters de todos los atributos
// @Setter: Agregar setters a todos los atributos
// @ToString
// @EqualsAndHashCode: Comparar dos objetos del mismo tipo
@Data
@Builder //Patron de Diseño que permite crear instancias (Objetos) utilizando metodos
public class Interviewer {
    
    private long id;
    private String name;
    private String email;


}

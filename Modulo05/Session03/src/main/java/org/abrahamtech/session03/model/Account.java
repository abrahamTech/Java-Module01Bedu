package org.abrahamtech.session03.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //Crear constructor con todos los parametros
public class Account {
    //Si dejabamos los "finale" no se iban a crear los "setters" para modificar el valor
    /*private finale long id;
    private fnale double amount;*/

    private long id;
    private double amount;
}
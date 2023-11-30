package com.abrahamtech.Session06.dto;

import com.abrahamtech.Session06.model.Type;

import lombok.Data;

@Data
public class PokemonDTO {
    
    private long id;
    private int number;
    private String name;
    private Type type;
}

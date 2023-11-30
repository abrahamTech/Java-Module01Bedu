package com.abrahamtech.Session06.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.abrahamtech.Session06.dto.CreatePokemonDTO;
import com.abrahamtech.Session06.dto.PokemonDTO;
import com.abrahamtech.Session06.model.Pokemon;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PokemonMapper {

    //Metodo para convertir del MODELO a DTO
    PokemonDTO toDTO(Pokemon model);
    
    //Metodo para convertir del DTO de como manda la info el usuario (Create DTO) a MODELO
    @Mapping(target = "id", ignore = true) //Ignora el id para que coincidan
    Pokemon toModel(CreatePokemonDTO dto);
}

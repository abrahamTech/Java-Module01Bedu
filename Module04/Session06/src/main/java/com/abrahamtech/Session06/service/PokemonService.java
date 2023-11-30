package com.abrahamtech.Session06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abrahamtech.Session06.dto.CreatePokemonDTO;
import com.abrahamtech.Session06.dto.PokemonDTO;
import com.abrahamtech.Session06.mapper.PokemonMapper;
import com.abrahamtech.Session06.model.Pokemon;
import com.abrahamtech.Session06.repository.PokemonRepository;

@Service
public class PokemonService {
    
    //Instancia del repositorio
    @Autowired
    private PokemonRepository repository;

    //Instancia del mapper
    @Autowired
    private PokemonMapper mapper;

    //Entregar una Lista de todos los Pokemon, 
    //Se transformaran cada uno de los Modelos guardados que tenemos en el Repositorio a tipo DTO para la Lista
    public List<PokemonDTO> findAll(){
        return repository
            .findAll()
            .stream()
            .map(mapper::toDTO)
            .toList();
    }

    //Guardado, de un CreateDTO a un Modelo DTO
    public PokemonDTO save(CreatePokemonDTO data) {
        Pokemon entity = repository
            .save(mapper.toModel(data));

        return mapper.toDTO(entity);
    }
}

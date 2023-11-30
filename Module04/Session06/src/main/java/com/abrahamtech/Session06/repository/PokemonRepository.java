package com.abrahamtech.Session06.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abrahamtech.Session06.model.Pokemon;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
    
    //Query que regresa la lista de TODOS los Pokemon
    List<Pokemon> findAll();

    //EL metodo save() ya esta incluido en el CrudRepository
}

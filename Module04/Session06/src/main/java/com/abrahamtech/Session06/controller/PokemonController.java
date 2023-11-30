package com.abrahamtech.Session06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abrahamtech.Session06.dto.CreatePokemonDTO;
import com.abrahamtech.Session06.dto.PokemonDTO;
import com.abrahamtech.Session06.service.PokemonService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("pokemon")
public class PokemonController {
    
    //Inyecion de dependencia del servicio
    @Autowired
    private PokemonService service;

    //Ruta con GET para obtener TODOS los POKEMON creados
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PokemonDTO> findAll() {
        return service.findAll();
    }

    //Ruta con POST para crear un pokemon
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PokemonDTO save(@Valid @RequestBody CreatePokemonDTO data) {
        return service.save(data);
    }
}

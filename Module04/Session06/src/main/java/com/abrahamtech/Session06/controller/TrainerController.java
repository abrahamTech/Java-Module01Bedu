package com.abrahamtech.Session06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abrahamtech.Session06.dto.TrainerDTO;
import com.abrahamtech.Session06.service.TrainerService;

@RestController
@RequestMapping("trainers")
public class TrainerController {

    @Autowired
    private TrainerService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TrainerDTO> findAll() {
        return service.findAll();
    }
}

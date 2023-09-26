package org.abraham.java.backend.Session08.controllers;

import org.abraham.java.backend.Session08.models.Client;
import org.abraham.java.backend.Session08.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostMapping
    public ResponseEntity<Void> createClient(@RequestBody Client cliente){
        Client clientDB = clientRepository.save(cliente);
        return ResponseEntity.created(URI.create(clientDB.getId().toString())).build();
    }
}

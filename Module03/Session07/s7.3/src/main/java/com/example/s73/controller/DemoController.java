package com.example.s73.controller;

import com.example.s73.entity.Worker;
import com.example.s73.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/workers")
public class DemoController {

    //Dependency injection
    @Autowired
    private WorkerRepository workerRepository;

    
    @GetMapping
    private Flux<Worker> getAllWorkers() {
        return workerRepository.findAllWorkers();
    }
}

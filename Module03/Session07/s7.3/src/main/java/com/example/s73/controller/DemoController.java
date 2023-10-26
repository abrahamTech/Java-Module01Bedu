package com.example.s73.controller;

import com.example.s73.entity.Worker;
import com.example.s73.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @GetMapping("/{id}")
    private Mono<Worker> getWorkerById(@PathVariable String id) {
        return workerRepository.findWorkerById(id);
    }

    //@PostMapping("/update")
    //@PutMapping("/update")
    @PutMapping //Only with http://localhost:8080/workers works (Don't need other URL "/update")
    private Mono<Worker> updateWorker(@RequestBody Worker worker) {
        return workerRepository.updateWorker(worker);
    }
}

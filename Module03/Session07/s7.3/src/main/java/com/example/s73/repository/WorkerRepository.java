package com.example.s73.repository;

import com.example.s73.entity.Worker;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class WorkerRepository {
    static Map<String, Worker> workerMap;

    static {
        workerMap = new HashMap<>();
        workerMap.put("1", new Worker("1", "Worker 1"));
        workerMap.put("2", new Worker("2", "Worker 2"));
        workerMap.put("3", new Worker("3", "Worker 3"));
        workerMap.put("4", new Worker("4", "Worker 4"));
        workerMap.put("5", new Worker("5", "Worker 5"));
        workerMap.put("6", new Worker("6", "Worker 6"));
        workerMap.put("7", new Worker("7", "Worker 7"));
        workerMap.put("8", new Worker("8", "Worker 8"));
        workerMap.put("9", new Worker("9", "Worker 9"));
        workerMap.put("10", new Worker("10", "Worker 10"));
    }

    //Searches
    //Mono and Flux is to do searches without blocking the main thread
    public Mono<Worker> findWorkerById(String id){
        return Mono.just(workerMap.get(id));
    }

    public Flux<Worker> findAllWorkers(){
        return Flux.fromIterable(workerMap.values());
    }

    public Mono<Worker> updateWorker(Worker worker){
        Worker workerExist = workerMap.get(worker.getId());
        if(workerExist != null) {
            workerExist.setName(worker.getName());
        }
        return Mono.just(workerExist);
    }
}

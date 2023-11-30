package com.abrahamtech.Session06.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abrahamtech.Session06.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Long> {
    
    List<Trainer> findAll();
 
}

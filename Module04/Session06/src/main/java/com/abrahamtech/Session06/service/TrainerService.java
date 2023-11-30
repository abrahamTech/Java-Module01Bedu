package com.abrahamtech.Session06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abrahamtech.Session06.dto.CreateTrainerDTO;
import com.abrahamtech.Session06.dto.TrainerDTO;
import com.abrahamtech.Session06.mapper.TrainerMapper;
import com.abrahamtech.Session06.model.Trainer;
import com.abrahamtech.Session06.repository.TrainerRepository;

@Service
public class TrainerService {
   @Autowired
   private TrainerRepository repository;

   @Autowired
   private TrainerMapper mapper;
   
   public List<TrainerDTO> findAll() {
        List<Trainer> data = repository.findAll();
        return data.stream().map(mapper::toDTO).toList();
   }

   public TrainerDTO save(CreateTrainerDTO data) {
      Trainer entity = repository.save(mapper.toModel(data));
      return mapper.toDTO(entity);
   }
}

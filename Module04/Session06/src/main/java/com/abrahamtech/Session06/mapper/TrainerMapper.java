package com.abrahamtech.Session06.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.abrahamtech.Session06.dto.TrainerDTO;
import com.abrahamtech.Session06.model.Trainer;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TrainerMapper {
    
    TrainerDTO toDTO(Trainer model);  
}

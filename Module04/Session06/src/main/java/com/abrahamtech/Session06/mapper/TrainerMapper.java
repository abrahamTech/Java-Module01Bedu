package com.abrahamtech.Session06.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.abrahamtech.Session06.dto.CreateTrainerDTO;
import com.abrahamtech.Session06.dto.TrainerDTO;
import com.abrahamtech.Session06.model.Trainer;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TrainerMapper {

    TrainerDTO toDTO(Trainer model);
    
    @Mapping(target = "id", ignore = true)
    Trainer toModel(CreateTrainerDTO dto);
}

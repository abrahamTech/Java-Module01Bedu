package com.abrahamtech.Session06.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateTrainerDTO {
    
    @NotBlank
    private String name;
}

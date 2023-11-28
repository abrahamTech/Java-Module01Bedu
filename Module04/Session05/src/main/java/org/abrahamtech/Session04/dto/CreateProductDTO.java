package org.abrahamtech.Session04.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* @Data es la union de: 
    - @Getter
    - @Setter
    - @ToString
    - @EqualsAndHashCode <- Llega a tener conflictos con otras librerias, por ejemplo: JPA
    - @RequiredArgsConstructor
*/

@Data
public class CreateProductDTO {
    
    @NotBlank(message = "El nombre del proyecto es obligatorio")
    private String name;

    // @Min(1)
    @Min(value = 1, message = "La cantidad debe ser mayor a cero")
    private int stock;

    // @DecimalMin("0.0")
    @DecimalMin(value = "0.0", message = "El precio debe ser mayor o igual a cero")
    private double price;

}

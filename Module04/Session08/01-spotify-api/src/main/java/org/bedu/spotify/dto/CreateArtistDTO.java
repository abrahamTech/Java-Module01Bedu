package org.bedu.spotify.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateArtistDTO {
    
    @Schema(description = "Nombre del artista", example = "Sin Bandera")
    @NotBlank
    private String name;
}

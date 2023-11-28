package org.abrahamtech.Session04.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/* @AllArgsConstructor toma todos los atributos y genera un constructor
 * 
 * public ErrorDTO(String code, String message, Object details) {
        this.code = code;
        this.message = message;
        this.details = details;
    }
 */

@Data
@AllArgsConstructor
public class ErrorDTO {
    private String code;
    private String message;
    private Object details;

}

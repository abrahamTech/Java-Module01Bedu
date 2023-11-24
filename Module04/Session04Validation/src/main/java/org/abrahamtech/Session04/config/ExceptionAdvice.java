package org.abrahamtech.Session04.config;

import java.util.LinkedList;
import java.util.List;

import org.abrahamtech.Session04.dto.ErrorDTO;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    //Este metodo se va a ejecutar cuando se detecten errores de validación
    //es decir, cuando se lancen excepciones de tipo MethodArgumentNotValidException

    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    public Object validationErrors() {
        ErrorDTO error = new ErrorDTO("ERR_VALID", "Hubo un error al validar los datos de entrada", null);
        return error;
    }*/

    //Extrae los mensaje error de la validacion para que vengan como detalle en el error que creamos
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO validationErrors(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        List<String> errors = new LinkedList<>();

        //Extrayendo los mensajes de error directamente de la excepción
        for(FieldError fieldError : fieldErrors) {
            errors.add(fieldError.getDefaultMessage());
        }
        
        ErrorDTO error = new ErrorDTO("ERR_VALID", "Hubo un error al validar los datos de entrada", errors);
        return error;
    }

}

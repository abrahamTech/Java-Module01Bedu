package org.abrahamTech.Session03.controller;


import java.util.List;

import org.abrahamTech.Session03.dto.CreateTodoDTO;
import org.abrahamTech.Session03.dto.TodoDTO;
import org.abrahamTech.Session03.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;


    // Get all the tasks
    // URL: http://localhost:8080/obtenerTodos
    @RequestMapping("/obtenerTodos")
    public List<TodoDTO> getAll() {
        return todoService.getAll();
    }


    // Create a new task
    @RequestMapping("/crearTodo")
    public TodoDTO create(@Valid @RequestBody CreateTodoDTO data) {
        return todoService.create(data);
    }
    /** JSON body:
    {
        "title": "Nueva Tarea de Prueba",
        "description": "Esta es una nueva tarea que se genero por Thunder Client"
    }
     */

}

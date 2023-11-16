package org.abrahamTech.Session03.service;

import java.util.LinkedList;
import java.util.List;

import org.abrahamTech.Session03.dto.CreateTodoDTO;
import org.abrahamTech.Session03.dto.TodoDTO;
import org.abrahamTech.Session03.model.Todo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

@Service
public class TodoService {
    
    private List<Todo> todos;
    private long currentId = 1;

    public TodoService() {
        todos = new LinkedList<>();
        todos.add(new Todo(1, "Tarea de prueba", "Esto es una tarea de prueba", false));
    }

    public List<TodoDTO> getAll() {
        List<TodoDTO> data = new LinkedList<>();

        for(Todo model : todos) {
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.getCompleted());
            data.add(dto);
        }

        return data;
    }

    public TodoDTO create(@Valid @RequestBody CreateTodoDTO data) {

        //Conversion de DTO a MOdel
        //Model es como almaceno los datos
        //DTO es cómo los recibo en el controlador y cómo los regreso
        Todo model = new Todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model);

        TodoDTO dto = new TodoDTO();
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
        dto.setCompleted(model.getCompleted());

        return dto;
    }
}

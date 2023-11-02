package com.example.demo.controller;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/empleados")
public class DemoController {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/{id}")
    private Mono<Empleado> getEmpleadoById(@PathVariable String id) {
        return empleadoRepository.findById(id);
    }

    @GetMapping
    private Flux<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @PostMapping
    private Mono<Empleado> crear(@RequestBody Empleado empleado) {
        //System.out.println(empleado.getId());
        //System.out.println(empleado.getNombre());
        //return empleadoRepository.save(empleado);

        //Validacion para que salga un ERROR en caso de que el ID del usuario este ya registrado
        return empleadoRepository.findById(empleado.getId())
                .flatMap(empleadoRegistrado -> Mono.error(
                        new Exception(String.format("Empleado con el id %s ya existe!!!", empleadoRegistrado.getId())))
                )
                .cast(Empleado.class)
                .switchIfEmpty(empleadoRepository.save(empleado));
    }

    //Metodo para actualizar usuarios
    @PutMapping("/{id}")
    public Mono<Empleado> actualizar(@PathVariable String id, @RequestBody Empleado empleado){
        return empleadoRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("El empleado no existe")))
                .map(fetchedEmpleado -> {
                    fetchedEmpleado.setNombre(empleado.getNombre());
                    return fetchedEmpleado;
                })
                .flatMap(empleadoRepository::save);
    }

    //Metodo para eliminar usuarios
    @DeleteMapping("/{id}")
    public Mono<Void> eliminar(@PathVariable String id){
        return empleadoRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("El empleado no existe")))
                .flatMap(empleadoRepository::delete);
    }
    
}

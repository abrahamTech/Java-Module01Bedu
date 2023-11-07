package com.example.demo.controller;

import com.example.demo.entity.Checador;
import com.example.demo.entity.Empleado;
import com.example.demo.repository.ChecadorRepository;
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
    @Autowired
    private ChecadorRepository checadorRepository;

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

    //Registrar entrada/salida de empleado
    @PostMapping("/checador")
    public Mono<Checador> checador(@RequestBody Checador checador){
        return empleadoRepository.findById(checador.getEmpleado().getId())
                .switchIfEmpty(Mono.error(new Exception("El empleado no existe")))
                .map(fetchedEmpleado -> checador)
                .flatMap(checadorRepository::save);
    }

    //Filter to see the employees that enter or exit
    @GetMapping("/checador/{empleadoId}/{esEntrada}")
    public Flux<Checador> getRegistrosById(@PathVariable String empleadoId, @PathVariable boolean esEntrada){
        return checadorRepository.findByEmpleado(empleadoId, esEntrada);
    }

}

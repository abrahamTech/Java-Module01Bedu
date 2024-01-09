package org.abrahamtech.session02.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.abrahamtech.session02.model.Interviewer;

public class InterviewerRepository {
    
    private List<Interviewer> data;
    private long currentId = 0;

    public InterviewerRepository() {
        data = new LinkedList<>();
    }

    public void clear() {
        data.clear();
    }

    //Regresa cuantos elementos hay en nuestra persistencia o Base de Datos
    public int count() {
        return data.size();
    }

    //Guardado
    public Interviewer save(String name, String email) {
        //Opcion sin patrón builder
        // Interviewer interviewer = new Interviewer(++currentId, name, email);
        
        //Opcion CON patrón builder
        Interviewer interviewer = Interviewer
            .builder()
            .name(name)
            .email(email)
            .id(++currentId)
            .build();
        
        data.add(interviewer);

        return interviewer;
    }

    //Implementar busqueda por email
    public Optional<Interviewer> findEmail(String email) {
        //El Optional sirve para indicar es una manera segura de manejar algo o nada (Existe o NO Existe)

        //Version JUNIOR (Programación Imperativo)
        /*for(Interviewer interviewer : data) {
            if(interviewer.getEmail().equals(email)) {
                return Optional.of(interviewer);
            }
        }

        return Optional.empty();*/

        //Version SENIOR (Programación Funcional)
        return data.stream().filter(x -> x.getEmail().equals(email)).findFirst();
    }
}

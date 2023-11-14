package org.abrahamtech.Session02.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import java.util.Map.Entry;

import org.abrahamtech.Session02.dto.ContactDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //We indicate that ir is a Controller
public class AgendaController {

    private HashMap<String, String> agenda;
    
    public AgendaController() {
        agenda = new HashMap<>();

        //Contacto por defecto
        agenda.put("Emergency", "911");
        agenda.put("Maria", "5534290365");
    }

    //Returns a json file
    @RequestMapping("/getAgenda")
    public HashMap getAgenda() {
        return agenda;
    }

    //Returns a List file [{}, {}]
    @RequestMapping("/getAgendaList")
    public List<ContactDTO> getAgenda2() {

        List<ContactDTO> data = new LinkedList<>();
        
        Set<Entry<String, String>> agendaSet = agenda.entrySet();

        for(Entry<String, String> entry : agendaSet) {
            data.add(new ContactDTO(entry.getKey(), entry.getValue()));
        }

        return data;
    }
}

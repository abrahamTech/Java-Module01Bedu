package com.example.demo.services;

import com.example.demo.models.Casa;
import com.example.demo.repository.CasaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class CasaServiceImpl implements CasaService {

    private final CasaRepository casaRepository;

    public  CasaServiceImpl(CasaRepository casaRepository) {
        this.casaRepository = casaRepository;
    }

    @Override
    public void guardar(Casa casa) {
        if (casa.getJefeDeFamilia() == null)
            throw new RuntimeException("Se debe tener un padre de familia");

        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        /*ArrayList<String> otrosMayusculas = new ArrayList<>();

        for (String nombre : casa.getOtros()) {
            otrosMayusculas.add(nombre.toUpperCase());
        }*/
        casa.setOtros(casa.getOtros().stream().map(String::toUpperCase).collect(Collectors.toList()));

        casaRepository.save(casa);
    }

    @Override
    public Casa buscarPorId(Long id) {
        return casaRepository.findById(id).get();
    }
}

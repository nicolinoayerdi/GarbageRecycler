package com.example.GarbageRecycler.service;

import com.example.GarbageRecycler.model.Persona;
import com.example.GarbageRecycler.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonaServiceImp implements PersonaService {
    @Autowired
    PersonaRepository pr;
    @Override
    public Persona register(Persona p) {
        return pr.save(p);
    }
    @Override
    public Persona findByUsername(String username) {
        return pr.findByUsername(username);
    }

    @Override
    public List<Persona> getAllPersonas() {
        return pr.findBy();
    }
}

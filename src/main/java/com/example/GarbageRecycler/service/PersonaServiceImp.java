package com.example.GarbageRecycler.service;

import com.example.GarbageRecycler.model.Persona;
import com.example.GarbageRecycler.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaServiceImp implements PersonaService {
    @Autowired
    PersonaRepository pr;
    @Override
    public Persona register(Persona p) {
        return pr.save(p);
    }
    @Override
    public Persona findByName(String name) {
        return pr.findByName(name);
    }

    @Override
    public List<Persona> getAllPersonas() {
        return null;
    }
}

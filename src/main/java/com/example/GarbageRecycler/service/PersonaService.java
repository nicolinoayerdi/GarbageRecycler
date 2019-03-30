package com.example.GarbageRecycler.service;

import com.example.GarbageRecycler.model.Persona;

import java.util.List;

public interface PersonaService {
    Persona register(Persona p);
    Persona findByName(String name);

    List<Persona> getAllPersonas();
}

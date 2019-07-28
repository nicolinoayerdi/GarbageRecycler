package com.example.GarbageRecycler.service;

import com.example.GarbageRecycler.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PersonaService {
    Persona register(Persona p);
    Persona findByUsername(String username);

    List<Persona> getAllPersonas();
}

package com.example.GarbageRecycler.controller;

import com.example.GarbageRecycler.model.Persona;
import com.example.GarbageRecycler.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService ps;
    @PostMapping(path = "/api/personas")
    public ResponseEntity<Persona> registerPersona(@RequestBody Persona p){
        Persona newP = ps.register(p);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newP.getId())
                .toUri();
        return ResponseEntity.created(location).body(newP);
    }
    @GetMapping(path = "/api/personas")
    public ResponseEntity<List<Persona>> getPersonas( ){
        List<Persona> list = ps.getAllPersonas();
        return ResponseEntity.ok(list);
    }
    @GetMapping(path = "/api/personas/{name}/")
    public ResponseEntity<Persona> getPersona(@PathVariable(value = "name")
                                                      String name){
        Persona p = ps.findByName(name);
        return ResponseEntity.ok(p);
    }
}

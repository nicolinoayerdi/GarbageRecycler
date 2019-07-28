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
    @PostMapping(path = "/api/users")
    public ResponseEntity<Persona> registerPersona(@RequestBody Persona p){
        Persona newP = ps.register(p);
        if (newP == null){
            return ResponseEntity.badRequest().body(newP);
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newP.getId())
                .toUri();
        return ResponseEntity.created(location).body(newP);
    }

    @GetMapping(path = "/api/users/")
    public ResponseEntity<List<Persona>> getPersonas( ){
        List<Persona> list = ps.getAllPersonas();
        return ResponseEntity.ok(list);
    }

    @GetMapping(path = "/api/users/{username}/")
    public ResponseEntity<Persona> getPersona(@PathVariable(value = "username")
                                                      String username){
        Persona p = ps.findByUsername(username);
        if (p == null){
            return ResponseEntity.badRequest().body(p);
        }
        return ResponseEntity.ok(p);
    }
}

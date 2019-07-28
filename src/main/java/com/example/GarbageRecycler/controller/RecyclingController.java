package com.example.GarbageRecycler.controller;

import com.example.GarbageRecycler.dto.TotalRecycling;
import com.example.GarbageRecycler.model.Persona;
import com.example.GarbageRecycler.model.Recycling;
import com.example.GarbageRecycler.service.PersonaService;
import com.example.GarbageRecycler.service.RecyclingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class RecyclingController {
    @Autowired
    RecyclingService rs;
    @Autowired
    PersonaService ps;
    @PostMapping(path = "/api/users/{username}/recycling/")
    public ResponseEntity<Recycling> addRecycling(@PathVariable(value = "username") String username,
                                                  @RequestBody Recycling r){
        Recycling newR = null;
        Persona p = ps.findByUsername(username);
        if (p == null){
            return ResponseEntity.badRequest().body(newR);
        }
        Recycling recycling = rs.addRecycling(r);
        recycling.setPersona(p);
        newR = rs.addRecycling(recycling);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newR.getId())
                .toUri();
        return ResponseEntity.created(location).body(newR);
    }

    @GetMapping(path = "/api/users/{username}/recycling/")
    public ResponseEntity<List<Recycling>> getRecyclingPersona(@PathVariable(value = "username") String username){
        Persona p = ps.findByUsername(username);
        List<Recycling> recyclings = null;
        if (p == null){
            return ResponseEntity.badRequest().body(recyclings);
        }
        recyclings = rs.getAllRecyclingPersona(p.getId());
        return ResponseEntity.ok(recyclings);
    }

    @GetMapping(path = "api/users/{username}/total/")
    public ResponseEntity<TotalRecycling> getTotalRecyclingPersona(@PathVariable(value = "username") String username){
        TotalRecycling total = null;
        Persona p = ps.findByUsername(username);
        if (p == null){
            return ResponseEntity.badRequest().body(total);
        }
        total = rs.getTotalRecyclingPersona(p.getId());
        return ResponseEntity.ok(total);
    }

}

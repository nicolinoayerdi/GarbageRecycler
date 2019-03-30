package com.example.GarbageRecycler.repository;

import com.example.GarbageRecycler.model.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {
    Persona findByName(String name);
}
package com.example.GarbageRecycler.repository;

import com.example.GarbageRecycler.model.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(exported = false)
public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {
    Persona findByUsername(String username);

    List<Persona> findBy();
}
package com.example.GarbageRecycler.repository;

import com.example.GarbageRecycler.model.Persona;
import com.example.GarbageRecycler.model.Recycling;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(exported = false)
public interface RecyclingRepository extends PagingAndSortingRepository<Recycling, Long> {
    List<Recycling> findAllByPersonaId(Long persona_id);
}

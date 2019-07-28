package com.example.GarbageRecycler.service;

import com.example.GarbageRecycler.dto.TotalRecycling;
import com.example.GarbageRecycler.model.Recycling;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RecyclingService {
    Recycling addRecycling(Recycling recycling);

    List<Recycling> getAllRecyclingPersona(Long idPersona);

    TotalRecycling getTotalRecyclingPersona(Long idPersona);

}

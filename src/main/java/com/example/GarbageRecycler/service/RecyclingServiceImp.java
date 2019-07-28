package com.example.GarbageRecycler.service;

import com.example.GarbageRecycler.dto.TotalRecycling;
import com.example.GarbageRecycler.model.Recycling;
import com.example.GarbageRecycler.repository.RecyclingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecyclingServiceImp implements  RecyclingService {

    @Autowired
    RecyclingRepository rr;

    @Override
    public Recycling addRecycling(Recycling recycling) {
        return rr.save(recycling);
    }

    @Override
    public List<Recycling> getAllRecyclingPersona(Long idPersona) {
        return rr.findAllByPersonaId(idPersona);
    }

    @Override
    public TotalRecycling getTotalRecyclingPersona(Long idPersona) {
        List<Recycling> recyclings = rr.findAllByPersonaId(idPersona);

        Float bottles = new Float(0);
        Float cans = new Float(0);
        Float glass = new Float(0);
        Float paperboard = new Float(0);
        Float tetrabriks = new Float(0);

        for (Recycling r: recyclings){
            bottles += r.getBottles();
            cans += r.getCans();
            glass += r.getGlass();
            paperboard += r.getPaperboard();
            tetrabriks += r.getTetrabriks();
        }

        Float tons = bottles + cans + glass + paperboard + tetrabriks;
        TotalRecycling totalRecycling = new TotalRecycling(bottles, cans, glass, paperboard, tetrabriks, tons);

        return totalRecycling;
    }
}

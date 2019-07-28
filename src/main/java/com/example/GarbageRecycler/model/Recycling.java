package com.example.GarbageRecycler.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity //
@Table //
public class Recycling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Persona persona;

    @Column(name = "tetrabriks", nullable = false)
    private Float tetrabriks;

    @Column(name = "glass", nullable = false)
    private Float glass;

    @Column(name = "paperboard", nullable = false)
    private Float paperboard;

    @Column(name = "cans", nullable = false)
    private Float cans;

    @Column(name = "bottles", nullable = false)
    private Float bottles;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    public Float getTetrabriks() {
        return tetrabriks;
    }

    public void setTetrabriks(Float tetrabriks) {
        this.tetrabriks = tetrabriks;
    }

    public Float getGlass() {
        return glass;
    }

    public void setGlass(Float glass) {
        this.glass = glass;
    }

    public Float getPaperboard() {
        return paperboard;
    }

    public void setPaperboard(Float paperboard) {
        this.paperboard = paperboard;
    }

    public Float getCans() {
        return cans;
    }

    public void setCans(Float cans) {
        this.cans = cans;
    }

    public Float getBottles() {
        return bottles;
    }

    public void setBottles(Float bottles) {
        this.bottles = bottles;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*"bottles": 10,
             "tetrabriks": 50,
             "glass": 30,
             "paperboard": 40,
             "cans": 20,
             "date": "2019-03-30"*/
}

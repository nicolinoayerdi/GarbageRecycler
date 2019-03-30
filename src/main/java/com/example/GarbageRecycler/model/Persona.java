package com.example.GarbageRecycler.model;

import javax.persistence.*;

@Entity //
@Table //
public class Persona {
    @Column(name = "name", nullable = false)
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return this.id;
    }
    //Insertar getter, setter, equals, hashcode
    }

package com.example.GarbageRecycler.model;

import javax.persistence.*;

@Entity //
@Table //
public class Persona {
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "username", nullable = false)
    private String username;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

/*  @Column(name = "address",  nullable = true)*/
    @Embedded
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //Insertar getter, setter, equals, hashcode
    }

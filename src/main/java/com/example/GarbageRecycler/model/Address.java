package com.example.GarbageRecycler.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "department", nullable = true)
    private String department;

    @Column(name = "number", nullable = true)
    private int number;

    @Column(name = "streetAddress", nullable = true)
    private String streetAddress;

    @Column(name = "city", nullable = true)
    private String city;

    @Column(name = "state", nullable = true)
    private String state;

    @Column(name = "zipCode", nullable = true)
    private String zipCode;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /*"department":"Tandil",
            "number":874,
            "streetAddress":"Alberdi",
            "city":"Tandil",
            "state":"Buenos Aires",
            "zipCode":"7000"}*/
}

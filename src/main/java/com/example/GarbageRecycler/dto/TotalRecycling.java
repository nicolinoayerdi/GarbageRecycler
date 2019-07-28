package com.example.GarbageRecycler.dto;

public class TotalRecycling {
    private Float bottles;
    private Float cans;
    private Float tetrabriks;
    private Float glass;
    private Float paperboard;
    private Float tons;

    public TotalRecycling(Float bottles, Float cans, Float tetrabriks, Float glass, Float paperboard, Float tons) {
        this.bottles = bottles;
        this.cans = cans;
        this.tetrabriks = tetrabriks;
        this.glass = glass;
        this.paperboard = paperboard;
        this.tons = tons;
    }

    public Float getBottles() {
        return bottles;
    }

    public void setBottles(Float bottles) {
        this.bottles = bottles;
    }

    public Float getCans() {
        return cans;
    }

    public void setCans(Float cans) {
        this.cans = cans;
    }

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

    public Float getTons() {
        return tons;
    }

    public void setTons(Float tons) {
        this.tons = tons;
    }
}

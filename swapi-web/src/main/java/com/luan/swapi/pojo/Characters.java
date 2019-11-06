package com.luan.swapi.pojo;

import java.util.List;


public class Characters {
    
    private String name;
    private List<String> species;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSpecies() {
        return this.species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

}
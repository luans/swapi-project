package com.luan.swapi.pojo;

import java.util.List;

public class Films {
    
    private String edited;
    private String director;
    private String created;
    private List<String> characters;

    public List<String> getCharacters() {
        return this.characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public String getEdited() {
        return this.edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    //private List<Vehicles> vehicles;




}
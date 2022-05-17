package com.viruta.models;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private String country;

    public Person(UUID id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Person() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

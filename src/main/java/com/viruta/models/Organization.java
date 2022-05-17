package com.viruta.models;

import com.viruta.controllers.KidsController;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Organization {
    private UUID id;
    private String name;
    private String country;
    private String mission;
    private Map<UUID, Integer> donors;

    public Organization(UUID id, String name, String country, String mission, Map<UUID, Integer> donors) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.mission = mission;
        this.donors = donors;
    }

    public Organization() {
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

    public String getMission() {
        return mission;
    }

    public Map<UUID, Integer> getDonors() {
        return donors;
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

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setDonors(Map<UUID, Integer> donors) {
        this.donors = donors;
    }
}
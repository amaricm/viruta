package com.viruta.models;

import java.util.UUID;

public class Children {
    private UUID id;
    private String name;
    private int age;
    private UUID organizationId;

    public Children() {
    }

    public Children(UUID id, String name, int age, UUID organizationId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.organizationId = organizationId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UUID getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(UUID organizationId) {
        this.organizationId = organizationId;
    }
}

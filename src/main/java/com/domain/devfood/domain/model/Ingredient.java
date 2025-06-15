package com.domain.devfood.domain.model;

public class Ingredient {

    private final String id;
    private String name;

    public Ingredient(String id, String name) {

        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be null or blank");
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        this.name = name;
    }
}

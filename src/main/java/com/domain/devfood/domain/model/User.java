package com.domain.devfood.domain.model;

public class User {

    private final String id;
    private String name;
    private String email;
    private String passwordHash;

    public User(String id, String name, String email, String passwordHash) {

        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be null or blank");
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("Email cannot be null or blank");
        if (passwordHash == null || passwordHash.isBlank())
            throw new IllegalArgumentException("PasswordHash cannot be null or blank");

        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("Email cannot be null or blank");
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        if (passwordHash == null || passwordHash.isBlank())
            throw new IllegalArgumentException("PasswordHash cannot be null or blank");
        this.passwordHash = passwordHash;
    }
}

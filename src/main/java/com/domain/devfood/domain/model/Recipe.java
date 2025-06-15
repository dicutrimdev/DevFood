package com.domain.devfood.domain.model;

import java.util.List;

public class Recipe {

    private final String id;
    private String title;
    private String description;
    private List<RecipeIngredient> ingredients;
    private String instructions;
    private String createdBy;

    public Recipe(
            String id,
            String title,
            String description,
            List<RecipeIngredient> ingredients,
            String instructions,
            String createdBy) {

        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be null or blank");
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be null or blank");
        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be null or blank");
        if (ingredients == null || ingredients.isEmpty())
            throw new IllegalArgumentException("Ingredients cannot be null or empty");
        if (instructions == null || instructions.isBlank())
            throw new IllegalArgumentException("Instructions cannot be null or blank");
        if (createdBy == null || createdBy.isBlank())
            throw new IllegalArgumentException("CreatedBy cannot be null or blank");

        this.id = id;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be null or blank");
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be null or blank");
        this.description = description;
    }

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeIngredient> ingredients) {
        if (ingredients == null || ingredients.isEmpty())
            throw new IllegalArgumentException("Ingredients cannot be null or empty");
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        if (instructions == null || instructions.isBlank())
            throw new IllegalArgumentException("Instructions cannot be null or blank");
        this.instructions = instructions;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        if (createdBy == null || createdBy.isBlank())
            throw new IllegalArgumentException("CreatedBy cannot be null or blank");
        this.createdBy = createdBy;
    }
}

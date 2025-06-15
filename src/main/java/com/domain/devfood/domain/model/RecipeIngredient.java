package com.domain.devfood.domain.model;

public class RecipeIngredient {

    private final String id;
    private final Ingredient ingredient;
    private double quantity;
    private String unit;

    public RecipeIngredient(String id, Ingredient ingredient, double quantity, String unit) {

        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Id is required");

        if (ingredient == null)
            throw new IllegalArgumentException("Ingredient is required");

        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive");

        if (unit == null || unit.isBlank())
            throw new IllegalArgumentException("Unit is required");

        this.id = id;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void updateQuantity(double quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive");
        this.quantity = quantity;
    }

    public void updateUnit(String unit) {
        if (unit == null || unit.isBlank())
            throw new IllegalArgumentException("Unit is required");
        this.unit = unit;
    }
}

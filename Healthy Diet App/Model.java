package com.example.healthydiet.model;

/**
 * Model class representing a diet plan.
 */
public class Model {
    private String mealName;
    private String mealType; // Breakfast, Lunch, Dinner
    private int calories;
    private String description;

    // Constructor
    public Model(String mealName, String mealType, int calories, String description) {
        this.mealName = mealName;
        this.mealType = mealType;
        this.calories = calories;
        this.description = description;
    }

    // Getters and Setters
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

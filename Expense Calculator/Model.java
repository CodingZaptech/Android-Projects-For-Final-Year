package com.example.expense.model;

/**
 * Model class representing an expense record.
 */
public class Model {

    private String title;
    private double amount;
    private String category;

    // Constructor
    public Model(String title, double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

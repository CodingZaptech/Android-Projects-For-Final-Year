package com.example.incometax.model;

/**
 * Model class representing a taxpayer.
 */
public class Model {
    private String name;
    private double income;
    private double tax;

    // Constructor
    public Model(String name, double income) {
        this.name = name;
        this.income = income;
        this.tax = 0.0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}

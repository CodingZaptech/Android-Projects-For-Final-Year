package com.example.healthmonitoring.model;

/**
 * Model class representing a user in the Health Monitoring Application.
 */
public class Model {

    private String name;
    private String email;
    private String password;
    private double weight; // in kilograms
    private double height; // in meters
    private int age;
    private String gender;
    private int steps;
    private double dailyCaloriesGoal;
    private double carbsConsumed;
    private double proteinConsumed;
    private double fatsConsumed;

    // Constructor
    public Model(String name, String email, String password, double weight, double height, int age, String gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.steps = 0;
        this.dailyCaloriesGoal = 2000; // default goal
        this.carbsConsumed = 0;
        this.proteinConsumed = 0;
        this.fatsConsumed = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public double getDailyCaloriesGoal() {
        return dailyCaloriesGoal;
    }

    public void setDailyCaloriesGoal(double dailyCaloriesGoal) {
        this.dailyCaloriesGoal = dailyCaloriesGoal;
    }

    public double getCarbsConsumed() {
        return carbsConsumed;
    }

    public void setCarbsConsumed(double carbsConsumed) {
        this.carbsConsumed = carbsConsumed;
    }

    public double getProteinConsumed() {
        return proteinConsumed;
    }

    public void setProteinConsumed(double proteinConsumed) {
        this.proteinConsumed = proteinConsumed;
    }

    public double getFatsConsumed() {
        return fatsConsumed;
    }

    public void setFatsConsumed(double fatsConsumed) {
        this.fatsConsumed = fatsConsumed;
    }
}

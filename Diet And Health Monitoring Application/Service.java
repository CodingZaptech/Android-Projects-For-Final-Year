package com.example.healthmonitoring.service;

import com.example.healthmonitoring.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle business logic for Health Monitoring Application.
 */
public class Service {

    private List<Model> users;

    public Service() {
        this.users = new ArrayList<>();
    }

    // Account Management
    public void registerUser(Model user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public boolean login(String email, String password) {
        for (Model user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful for: " + user.getName());
                return true;
            }
        }
        System.out.println("Login failed for: " + email);
        return false;
    }

    // BMI Calculation
    public double calculateBMI(Model user) {
        double bmi = user.getWeight() / (user.getHeight() * user.getHeight());
        System.out.println("BMI for " + user.getName() + ": " + bmi);
        return bmi;
    }

    // Diet Monitoring
    public void addFoodIntake(Model user, double carbs, double protein, double fats) {
        user.setCarbsConsumed(user.getCarbsConsumed() + carbs);
        user.setProteinConsumed(user.getProteinConsumed() + protein);
        user.setFatsConsumed(user.getFatsConsumed() + fats);
        System.out.println("Updated diet for " + user.getName());
    }

    public void displayDietStatus(Model user) {
        System.out.println("Diet Status for " + user.getName());
        System.out.println("Carbs consumed: " + user.getCarbsConsumed());
        System.out.println("Protein consumed: " + user.getProteinConsumed());
        System.out.println("Fats consumed: " + user.getFatsConsumed());
        System.out.println("Daily Calorie Goal: " + user.getDailyCaloriesGoal());
    }

    // Footsteps Monitoring
    public void addSteps(Model user, int steps) {
        user.setSteps(user.getSteps() + steps);
        System.out.println("Total steps for " + user.getName() + ": " + user.getSteps());
    }

    // Recommendation System (AI simulation)
    public void recommendDiet(Model user) {
        double remainingCalories = user.getDailyCaloriesGoal() - 
                (user.getCarbsConsumed()*4 + user.getProteinConsumed()*4 + user.getFatsConsumed()*9);
        System.out.println("Recommended calories to consume: " + remainingCalories);
        System.out.println("Suggested: Increase protein intake if below target.");
    }

    public void recommendSleep(Model user) {
        System.out.println("Recommended daily sleep: 7-8 hours for " + user.getName());
    }
}

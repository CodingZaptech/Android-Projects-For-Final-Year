package com.example.healthmonitoring.controller;

import com.example.healthmonitoring.model.Model;
import com.example.healthmonitoring.service.Service;

/**
 * Controller class to handle interactions for Diet and Health Monitoring App.
 */
public class Controller {

    private Service healthService;

    public Controller() {
        this.healthService = new Service();
    }

    // Account
    public void register(String name, String email, String password, double weight, double height, int age, String gender) {
        Model user = new Model(name, email, password, weight, height, age, gender);
        healthService.registerUser(user);
    }

    public boolean login(String email, String password) {
        return healthService.login(email, password);
    }

    // BMI
    public double getBMI(Model user) {
        return healthService.calculateBMI(user);
    }

    // Diet Monitoring
    public void addFood(Model user, double carbs, double protein, double fats) {
        healthService.addFoodIntake(user, carbs, protein, fats);
    }

    public void showDietStatus(Model user) {
        healthService.displayDietStatus(user);
    }

    // Footsteps Monitoring
    public void addSteps(Model user, int steps) {
        healthService.addSteps(user, steps);
    }

    // Recommendations
    public void recommendDiet(Model user) {
        healthService.recommendDiet(user);
    }

    public void recommendSleep(Model user) {
        healthService.recommendSleep(user);
    }
}

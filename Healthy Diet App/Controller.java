package com.example.healthydiet.controller;

import com.example.healthydiet.model.Model;
import com.example.healthydiet.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Healthy Diet App.
 */
public class Controller {

    private Service dietService;

    public Controller() {
        this.dietService = new Service();
    }

    /**
     * Adds a new diet plan.
     * @param mealName Name of the meal
     * @param mealType Meal type
     * @param calories Calories in the meal
     * @param description Description
     */
    public void addDietPlan(String mealName, String mealType, int calories, String description) {
        Model plan = new Model(mealName, mealType, calories, description);
        dietService.addDietPlan(plan);
        System.out.println("Diet plan added: " + mealName);
    }

    /**
     * Retrieves all diet plans.
     * @return List of diet plans
     */
    public List<Model> getDietPlans() {
        return dietService.getAllDietPlans();
    }

    /**
     * Clears all diet plans.
     */
    public void clearDietPlans() {
        dietService.clearDietPlans();
        System.out.println("All diet plans cleared.");
    }
}

package com.example.healthydiet.service;

import com.example.healthydiet.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage diet plans.
 */
public class Service {

    private List<Model> dietPlans;

    public Service() {
        this.dietPlans = new ArrayList<>();
    }

    /**
     * Adds a new diet plan.
     * @param plan Diet plan model
     */
    public void addDietPlan(Model plan) {
        dietPlans.add(plan);
    }

    /**
     * Returns all diet plans.
     * @return List of diet plans
     */
    public List<Model> getAllDietPlans() {
        return dietPlans;
    }

    /**
     * Clears all diet plans.
     */
    public void clearDietPlans() {
        dietPlans.clear();
    }
}

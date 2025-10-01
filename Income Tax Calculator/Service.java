package com.example.incometax.service;

import com.example.incometax.model.Model;

/**
 * Service class to handle income tax calculations.
 */
public class Service {

    /**
     * Calculates tax based on income.
     * @param taxpayer Model object
     */
    public void calculateTax(Model taxpayer) {
        double income = taxpayer.getIncome();
        double tax;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
        }
        taxpayer.setTax(tax);
    }
}

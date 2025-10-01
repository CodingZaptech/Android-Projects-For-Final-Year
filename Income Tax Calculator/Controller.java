package com.example.incometax.controller;

import com.example.incometax.model.Model;
import com.example.incometax.service.Service;

/**
 * Controller class to handle Income Tax Calculator interactions.
 */
public class Controller {

    private Service taxService;

    public Controller() {
        this.taxService = new Service();
    }

    /**
     * Calculates tax for a taxpayer.
     * @param name Taxpayer name
     * @param income Taxpayer income
     * @return Tax amount
     */
    public double calculate(String name, double income) {
        Model taxpayer = new Model(name, income);
        taxService.calculateTax(taxpayer);
        System.out.println("Income tax for " + name + ": " + taxpayer.getTax());
        return taxpayer.getTax();
    }
}

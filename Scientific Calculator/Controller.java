package com.example.calculator.controller;

import com.example.calculator.service.Service;

/**
 * Controller class to handle interactions for Scientific Calculator App.
 */
public class Controller {

    private Service calculatorService;

    public Controller() {
        calculatorService = new Service();
    }

    public double add(double a, double b) {
        return calculatorService.add(a, b);
    }

    public double subtract(double a, double b) {
        return calculatorService.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return calculatorService.multiply(a, b);
    }

    public double divide(double a, double b) {
        return calculatorService.divide(a, b);
    }

    public double square(double a) {
        return calculatorService.square(a);
    }

    public double squareRoot(double a) {
        return calculatorService.squareRoot(a);
    }

    public double power(double a, double b) {
        return calculatorService.power(a, b);
    }

    public double sin(double angle) {
        return calculatorService.sin(angle);
    }

    public double cos(double angle) {
        return calculatorService.cos(angle);
    }

    public double tan(double angle) {
        return calculatorService.tan(angle);
    }
}

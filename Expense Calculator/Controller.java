package com.example.expense.controller;

import com.example.expense.model.Model;
import com.example.expense.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Expense Calculator App.
 */
public class Controller {

    private Service expenseService;

    public Controller() {
        expenseService = new Service();
    }

    public void addExpense(String title, double amount, String category) {
        Model expense = new Model(title, amount, category);
        expenseService.addExpense(expense);
    }

    public double getTotalExpense() {
        return expenseService.getTotalExpense();
    }

    public List<Model> getAllExpenses() {
        return expenseService.getExpenses();
    }
}

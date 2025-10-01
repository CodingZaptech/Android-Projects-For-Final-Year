package com.example.expense.service;

import com.example.expense.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage expenses.
 */
public class Service {

    private List<Model> expenses;

    public Service() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Model expense) {
        expenses.add(expense);
        System.out.println("Expense added: " + expense.getTitle());
    }

    public double getTotalExpense() {
        return expenses.stream().mapToDouble(Model::getAmount).sum();
    }

    public List<Model> getExpenses() {
        return expenses;
    }
}

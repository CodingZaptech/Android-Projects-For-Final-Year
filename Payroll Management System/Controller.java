package com.example.payroll.controller;

import com.example.payroll.model.Model;
import com.example.payroll.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Payroll Management System App.
 */
public class Controller {

    private Service payrollService;

    public Controller() {
        payrollService = new Service();
    }

    public void addEmployee(String name, String id, double basic, double allowances, double deductions) {
        Model employee = new Model(name, id, basic, allowances, deductions);
        payrollService.addEmployee(employee);
    }

    public double getNetSalary(Model employee) {
        return payrollService.calculateNetSalary(employee);
    }

    public List<Model> getAllEmployees() {
        return payrollService.getAllEmployees();
    }
}

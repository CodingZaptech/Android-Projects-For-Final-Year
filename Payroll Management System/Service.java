package com.example.payroll.service;

import com.example.payroll.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage payroll operations.
 */
public class Service {

    private List<Model> employees;

    public Service() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Model employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getEmployeeName());
    }

    public double calculateNetSalary(Model employee) {
        return employee.getNetSalary();
    }

    public List<Model> getAllEmployees() {
        return employees;
    }
}

package com.example.employee.service;

import com.example.employee.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage employees.
 */
public class Service {

    private List<Model> employees;

    public Service() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Model employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public void updateSalary(Model employee, double salary) {
        employee.setSalary(salary);
        System.out.println("Updated salary for: " + employee.getName());
    }

    public List<Model> getEmployees() {
        return employees;
    }
}

package com.example.employee.controller;

import com.example.employee.model.Model;
import com.example.employee.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Employee Management System.
 */
public class Controller {

    private Service employeeService;

    public Controller() {
        employeeService = new Service();
    }

    public void addEmployee(String name, String id, String department, double salary) {
        Model employee = new Model(name, id, department, salary);
        employeeService.addEmployee(employee);
    }

    public void updateSalary(Model employee, double salary) {
        employeeService.updateSalary(employee, salary);
    }

    public List<Model> getAllEmployees() {
        return employeeService.getEmployees();
    }
}

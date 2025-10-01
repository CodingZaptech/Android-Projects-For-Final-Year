package com.example.payroll.model;

/**
 * Model class representing an employee payroll record.
 */
public class Model {

    private String employeeName;
    private String employeeId;
    private double basicSalary;
    private double allowances;
    private double deductions;

    // Constructor
    public Model(String employeeName, String employeeId, double basicSalary, double allowances, double deductions) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    // Getters and Setters
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getNetSalary() {
        return basicSalary + allowances - deductions;
    }
}

package com.example.crimereporter.controller;

import com.example.crimereporter.model.Model;
import com.example.crimereporter.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions in Crime Reporter App.
 */
public class Controller {

    private Service reportService;

    public Controller() {
        this.reportService = new Service();
    }

    /**
     * Adds a new report.
     * @param type Report type (Crime/MissingPerson)
     * @param description Report description
     * @param location Location
     * @param date Report date
     */
    public void addReport(String type, String description, String location, String date) {
        Model report = new Model(type, description, location, date);
        reportService.addReport(report);
        System.out.println(type + " report added.");
    }

    /**
     * Retrieves all reports.
     * @return List of reports
     */
    public List<Model> getReports() {
        return reportService.getAllReports();
    }

    /**
     * Clears all reports.
     */
    public void clearReports() {
        reportService.clearReports();
        System.out.println("All reports cleared.");
    }
}

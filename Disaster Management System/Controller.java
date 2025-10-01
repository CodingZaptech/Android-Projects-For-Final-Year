package com.example.disastermanagement.controller;

import com.example.disastermanagement.model.Model;
import com.example.disastermanagement.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Disaster Management Helping App.
 */
public class Controller {

    private Service disasterService;

    public Controller() {
        this.disasterService = new Service();
    }

    /**
     * Adds a new disaster report.
     * @param type Disaster type
     * @param location Location
     * @param description Description
     * @param reportedBy Reporter name
     */
    public void addReport(String type, String location, String description, String reportedBy) {
        Model report = new Model(type, location, description, reportedBy);
        disasterService.addReport(report);
        System.out.println("Disaster report added: " + type);
    }

    /**
     * Retrieves all disaster reports.
     * @return List of reports
     */
    public List<Model> getReports() {
        return disasterService.getAllReports();
    }

    /**
     * Clears all disaster reports.
     */
    public void clearReports() {
        disasterService.clearReports();
        System.out.println("All disaster reports cleared.");
    }
}

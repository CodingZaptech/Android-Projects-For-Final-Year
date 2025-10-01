package com.example.disastermanagement.service;

import com.example.disastermanagement.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage disaster reports.
 */
public class Service {

    private List<Model> reports;

    public Service() {
        this.reports = new ArrayList<>();
    }

    /**
     * Adds a disaster report.
     * @param report Report model
     */
    public void addReport(Model report) {
        reports.add(report);
    }

    /**
     * Returns all disaster reports.
     * @return List of reports
     */
    public List<Model> getAllReports() {
        return reports;
    }

    /**
     * Clears all disaster reports.
     */
    public void clearReports() {
        reports.clear();
    }
}

package com.example.crimereporter.service;

import com.example.crimereporter.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle crime reports and missing persons.
 */
public class Service {

    private List<Model> reports;

    public Service() {
        this.reports = new ArrayList<>();
    }

    /**
     * Adds a new report.
     * @param report Report model
     */
    public void addReport(Model report) {
        reports.add(report);
    }

    /**
     * Returns all reports.
     * @return List of reports
     */
    public List<Model> getAllReports() {
        return reports;
    }

    /**
     * Clears all reports.
     */
    public void clearReports() {
        reports.clear();
    }
}

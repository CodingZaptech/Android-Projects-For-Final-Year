package com.example.disastermanagement.model;

/**
 * Model class representing a disaster report.
 */
public class Model {
    private String disasterType;
    private String location;
    private String description;
    private String reportedBy;

    // Constructor
    public Model(String disasterType, String location, String description, String reportedBy) {
        this.disasterType = disasterType;
        this.location = location;
        this.description = description;
        this.reportedBy = reportedBy;
    }

    // Getters and Setters
    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }
}

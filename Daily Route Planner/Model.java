package com.example.dailyroutes.model;

/**
 * Model class representing a planned route.
 */
public class Model {
    private String startLocation;
    private String endLocation;
    private String date;
    private String notes;

    // Constructor
    public Model(String startLocation, String endLocation, String date, String notes) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.date = date;
        this.notes = notes;
    }

    // Getters and Setters
    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

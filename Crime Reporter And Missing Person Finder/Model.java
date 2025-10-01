package com.example.crimereporter.model;

/**
 * Model class representing a report (crime or missing person).
 */
public class Model {
    private String type; // Crime or MissingPerson
    private String description;
    private String location;
    private String date;

    // Constructor
    public Model(String type, String description, String location, String date) {
        this.type = type;
        this.description = description;
        this.location = location;
        this.date = date;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

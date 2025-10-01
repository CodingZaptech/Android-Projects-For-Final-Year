package com.example.tourism.model;

/**
 * Model class representing a tourist destination.
 */
public class Model {

    private String placeName;
    private String location;
    private String description;
    private double entryFee;

    // Constructor
    public Model(String placeName, String location, String description, double entryFee) {
        this.placeName = placeName;
        this.location = location;
        this.description = description;
        this.entryFee = entryFee;
    }

    // Getters and Setters
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
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

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }
}

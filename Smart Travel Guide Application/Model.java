package com.example.smarttravel.model;

/**
 * Model class representing a Tourist Place or Travel Spot.
 */
public class Model {
    private String name;
    private String location;
    private String description;

    // Constructor
    public Model(String name, String location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

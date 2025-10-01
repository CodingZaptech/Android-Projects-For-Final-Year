package com.example.realestate.model;

/**
 * Model class representing a property and its details.
 */
public class Model {

    private String propertyId;
    private String ownerName;
    private String propertyType; // e.g., Apartment, House, Commercial
    private double price;
    private String location;

    // Constructor
    public Model(String propertyId, String ownerName, String propertyType, double price, String location) {
        this.propertyId = propertyId;
        this.ownerName = ownerName;
        this.propertyType = propertyType;
        this.price = price;
        this.location = location;
    }

    // Getters and Setters
    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

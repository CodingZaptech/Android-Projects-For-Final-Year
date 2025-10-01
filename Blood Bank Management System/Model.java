package com.example.bloodbank.model;

/**
 * Model class representing a blood donor or blood unit.
 */
public class Model {

    private String donorName;
    private String bloodGroup;
    private int units;

    // Constructor
    public Model(String donorName, String bloodGroup, int units) {
        this.donorName = donorName;
        this.bloodGroup = bloodGroup;
        this.units = units;
    }

    // Getters and Setters
    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}

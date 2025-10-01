package com.example.womensecurity.model;

/**
 * Model class representing an emergency alert.
 */
public class Model {

    private String userName;
    private String phoneNumber;
    private String location;
    private boolean alertSent;

    // Constructor
    public Model(String userName, String phoneNumber, String location) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.alertSent = false;
    }

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAlertSent() {
        return alertSent;
    }

    public void sendAlert() {
        this.alertSent = true;
        System.out.println("Alert sent for user: " + userName);
    }
}

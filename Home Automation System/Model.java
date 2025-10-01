package com.example.homeautomation.model;

/**
 * Model class representing a device in the home automation system.
 */
public class Model {

    private String deviceName;
    private String location;
    private boolean status; // true = ON, false = OFF

    // Constructor
    public Model(String deviceName, String location) {
        this.deviceName = deviceName;
        this.location = location;
        this.status = false; // default OFF
    }

    // Getters and Setters
    public String getDeviceName() {
        return deviceName;
    }

    public String getLocation() {
        return location;
    }

    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        this.status = true;
        System.out.println(deviceName + " turned ON.");
    }

    public void turnOff() {
        this.status = false;
        System.out.println(deviceName + " turned OFF.");
    }
}

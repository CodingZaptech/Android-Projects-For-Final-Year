package com.example.vehicletracking.model;

/**
 * Model class representing a vehicle.
 */
public class Model {
    private String vehicleNumber;
    private String driverName;
    private double latitude;
    private double longitude;

    // Constructor
    public Model(String vehicleNumber, String driverName, double latitude, double longitude) {
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

package com.example.vehicletracking.controller;

import com.example.vehicletracking.model.Model;
import com.example.vehicletracking.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Vehicle Tracking System.
 */
public class Controller {

    private Service vehicleService;

    public Controller() {
        this.vehicleService = new Service();
    }

    /**
     * Adds a new vehicle record.
     * @param vehicleNumber Vehicle number
     * @param driverName Driver name
     * @param latitude Current latitude
     * @param longitude Current longitude
     */
    public void addVehicle(String vehicleNumber, String driverName, double latitude, double longitude) {
        Model vehicle = new Model(vehicleNumber, driverName, latitude, longitude);
        vehicleService.addVehicle(vehicle);
        System.out.println("Vehicle added: " + vehicleNumber);
    }

    /**
     * Retrieves all vehicles.
     * @return List of vehicles
     */
    public List<Model> getVehicles() {
        return vehicleService.getAllVehicles();
    }

    /**
     * Clears all vehicle records.
     */
    public void clearVehicles() {
        vehicleService.clearVehicles();
        System.out.println("All vehicle records cleared.");
    }
}

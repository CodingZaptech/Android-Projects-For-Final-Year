package com.example.vehicletracking.service;

import com.example.vehicletracking.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage vehicle tracking.
 */
public class Service {

    private List<Model> vehicles;

    public Service() {
        this.vehicles = new ArrayList<>();
    }

    /**
     * Adds a new vehicle.
     * @param vehicle Vehicle model
     */
    public void addVehicle(Model vehicle) {
        vehicles.add(vehicle);
    }

    /**
     * Returns all vehicles.
     * @return List of vehicles
     */
    public List<Model> getAllVehicles() {
        return vehicles;
    }

    /**
     * Clears all vehicle records.
     */
    public void clearVehicles() {
        vehicles.clear();
    }
}

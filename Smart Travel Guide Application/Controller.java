package com.example.smarttravel.controller;

import com.example.smarttravel.model.Model;
import com.example.smarttravel.service.Service;
import java.util.List;

/**
 * Controller class to handle user interactions for Smart Travel Guide.
 */
public class Controller {

    private Service travelService;

    public Controller() {
        this.travelService = new Service();
    }

    /**
     * Adds a travel spot.
     * @param name Name of the place
     * @param location Location details
     * @param description Brief description
     */
    public void addTravelSpot(String name, String location, String description) {
        Model spot = new Model(name, location, description);
        travelService.addTravelSpot(spot);
        System.out.println("Travel spot added: " + name);
    }

    /**
     * Retrieves all travel spots.
     * @return List of spots
     */
    public List<Model> getTravelSpots() {
        return travelService.getAllTravelSpots();
    }

    /**
     * Clears all travel spots.
     */
    public void clearTravelSpots() {
        travelService.clearTravelSpots();
        System.out.println("All travel spots cleared.");
    }
}

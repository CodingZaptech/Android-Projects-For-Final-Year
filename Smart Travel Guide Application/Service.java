package com.example.smarttravel.service;

import com.example.smarttravel.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle business logic for Smart Travel Guide.
 */
public class Service {

    private List<Model> travelSpots;

    public Service() {
        this.travelSpots = new ArrayList<>();
    }

    /**
     * Adds a new travel spot.
     * @param spot Travel spot model
     */
    public void addTravelSpot(Model spot) {
        travelSpots.add(spot);
    }

    /**
     * Returns all travel spots.
     * @return List of travel spots
     */
    public List<Model> getAllTravelSpots() {
        return travelSpots;
    }

    /**
     * Clears all travel spots.
     */
    public void clearTravelSpots() {
        travelSpots.clear();
    }
}

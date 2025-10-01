package com.example.tourism.service;

import com.example.tourism.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage tourist destinations.
 */
public class Service {

    private List<Model> destinations;

    public Service() {
        destinations = new ArrayList<>();
    }

    public void addDestination(Model destination) {
        destinations.add(destination);
        System.out.println("Destination added: " + destination.getPlaceName());
    }

    public List<Model> getAllDestinations() {
        return destinations;
    }
}

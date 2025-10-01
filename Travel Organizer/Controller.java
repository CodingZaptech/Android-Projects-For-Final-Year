package com.example.travelorganiser.controller;

import com.example.travelorganiser.model.Model;
import com.example.travelorganiser.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Travel Organiser App.
 */
public class Controller {

    private Service travelService;

    public Controller() {
        travelService = new Service();
    }

    public void addTrip(String name, String destination, String start, String end, String notes) {
        Model trip = new Model(name, destination, start, end, notes);
        travelService.addTrip(trip);
    }

    public List<Model> getAllTrips() {
        return travelService.getAllTrips();
    }

    public Model searchTrip(String tripName) {
        return travelService.searchTripByName(tripName);
    }
}

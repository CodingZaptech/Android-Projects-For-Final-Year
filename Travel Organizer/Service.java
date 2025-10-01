package com.example.travelorganiser.service;

import com.example.travelorganiser.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage travel plans.
 */
public class Service {

    private List<Model> trips;

    public Service() {
        trips = new ArrayList<>();
    }

    public void addTrip(Model trip) {
        trips.add(trip);
        System.out.println("Trip added: " + trip.getTripName());
    }

    public List<Model> getAllTrips() {
        return trips;
    }

    public Model searchTripByName(String tripName) {
        for (Model trip : trips) {
            if (trip.getTripName().equalsIgnoreCase(tripName)) {
                return trip;
            }
        }
        return null;
    }
}

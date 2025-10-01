package com.example.busticket.service;

import com.example.busticket.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage bus ticket bookings.
 */
public class Service {

    private List<Model> buses;

    public Service() {
        buses = new ArrayList<>();
    }

    public void addBus(Model bus) {
        buses.add(bus);
        System.out.println("Bus added: " + bus.getBusName());
    }

    public void bookSeats(Model bus, int seats) {
        bus.bookSeats(seats);
        System.out.println("Booked " + seats + " seats for bus " + bus.getBusName());
    }

    public List<Model> getBuses() {
        return buses;
    }
}

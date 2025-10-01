package com.example.busticket.controller;

import com.example.busticket.model.Model;
import com.example.busticket.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Bus Ticket Booking App.
 */
public class Controller {

    private Service busService;

    public Controller() {
        busService = new Service();
    }

    public void addBus(String name, String route, int totalSeats) {
        Model bus = new Model(name, route, totalSeats);
        busService.addBus(bus);
    }

    public void bookSeats(Model bus, int seats) {
        busService.bookSeats(bus, seats);
    }

    public List<Model> getAllBuses() {
        return busService.getBuses();
    }
}

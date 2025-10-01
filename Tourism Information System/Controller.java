package com.example.tourism.controller;

import com.example.tourism.model.Model;
import com.example.tourism.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Tourism Information System App.
 */
public class Controller {

    private Service tourismService;

    public Controller() {
        tourismService = new Service();
    }

    public void addDestination(String name, String location, String description, double fee) {
        Model destination = new Model(name, location, description, fee);
        tourismService.addDestination(destination);
    }

    public List<Model> getAllDestinations() {
        return tourismService.getAllDestinations();
    }
}

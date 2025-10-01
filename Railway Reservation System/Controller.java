package com.example.railway.controller;

import com.example.railway.model.Model;
import com.example.railway.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Railway Reservation System App.
 */
public class Controller {

    private Service railwayService;

    public Controller() {
        railwayService = new Service();
    }

    public void addTrain(String name, String source, String destination, int totalSeats) {
        Model train = new Model(name, source, destination, totalSeats);
        railwayService.addTrain(train);
    }

    public void bookSeats(Model train, int seats) {
        railwayService.bookSeats(train, seats);
    }

    public List<Model> getAllTrains() {
        return railwayService.getAllTrains();
    }
}

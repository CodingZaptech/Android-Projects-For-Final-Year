package com.example.railway.service;

import com.example.railway.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage train reservations.
 */
public class Service {

    private List<Model> trains;

    public Service() {
        trains = new ArrayList<>();
    }

    public void addTrain(Model train) {
        trains.add(train);
        System.out.println("Train added: " + train.getTrainName());
    }

    public void bookSeats(Model train, int seats) {
        train.bookSeats(seats);
        System.out.println("Booked " + seats + " seats on " + train.getTrainName());
    }

    public List<Model> getAllTrains() {
        return trains;
    }
}

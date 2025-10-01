package com.example.movieticket.controller;

import com.example.movieticket.model.Model;
import com.example.movieticket.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Movie Ticket Booking App.
 */
public class Controller {

    private Service movieService;

    public Controller() {
        movieService = new Service();
    }

    public void addMovie(String name, String showTime, int totalSeats) {
        Model movie = new Model(name, showTime, totalSeats);
        movieService.addMovie(movie);
    }

    public void bookSeats(Model movie, int seats) {
        movieService.bookSeats(movie, seats);
    }

    public List<Model> getAllMovies() {
        return movieService.getMovies();
    }
}

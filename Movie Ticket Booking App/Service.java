package com.example.movieticket.service;

import com.example.movieticket.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage movie ticket bookings.
 */
public class Service {

    private List<Model> movies;

    public Service() {
        movies = new ArrayList<>();
    }

    public void addMovie(Model movie) {
        movies.add(movie);
        System.out.println("Movie added: " + movie.getMovieName());
    }

    public void bookSeats(Model movie, int seats) {
        movie.bookSeats(seats);
        System.out.println("Booked " + seats + " seats for " + movie.getMovieName());
    }

    public List<Model> getMovies() {
        return movies;
    }
}

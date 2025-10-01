package com.example.movieticket.model;

/**
 * Model class representing a movie show and booking details.
 */
public class Model {

    private String movieName;
    private String showTime;
    private int totalSeats;
    private int bookedSeats;

    // Constructor
    public Model(String movieName, String showTime, int totalSeats) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    // Getters and Setters
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void bookSeats(int seats) {
        if (seats + bookedSeats <= totalSeats) {
            bookedSeats += seats;
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}

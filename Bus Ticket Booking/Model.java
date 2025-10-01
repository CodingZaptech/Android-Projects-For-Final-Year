package com.example.busticket.model;

/**
 * Model class representing a bus and ticket booking details.
 */
public class Model {

    private String busName;
    private String route;
    private int totalSeats;
    private int bookedSeats;

    // Constructor
    public Model(String busName, String route, int totalSeats) {
        this.busName = busName;
        this.route = route;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    // Getters and Setters
    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
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

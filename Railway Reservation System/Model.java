package com.example.railway.model;

/**
 * Model class representing a train and ticket booking.
 */
public class Model {

    private String trainName;
    private String source;
    private String destination;
    private int totalSeats;
    private int bookedSeats;

    // Constructor
    public Model(String trainName, String source, String destination, int totalSeats) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    // Getters and Setters
    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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
        if (bookedSeats + seats <= totalSeats) {
            bookedSeats += seats;
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}

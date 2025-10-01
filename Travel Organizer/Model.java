package com.example.travelorganiser.model;

/**
 * Model class representing a travel plan or itinerary.
 */
public class Model {

    private String tripName;
    private String destination;
    private String startDate;
    private String endDate;
    private String notes;

    // Constructor
    public Model(String tripName, String destination, String startDate, String endDate, String notes) {
        this.tripName = tripName;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.notes = notes;
    }

    // Getters and Setters
    public String getTripName() {
        return tripName;
    }

    public String getDestination() {
        return destination;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

package com.example.partymanagement.model;

/**
 * Model class representing a party event.
 */
public class Model {
    private String eventName;
    private String date;
    private String location;
    private int attendees;

    // Constructor
    public Model(String eventName, String date, String location, int attendees) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.attendees = attendees;
    }

    // Getters and Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }
}

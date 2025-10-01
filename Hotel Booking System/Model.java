package com.example.hotel.model;

/**
 * Model class representing a hotel room and booking details.
 */
public class Model {

    private String roomId;
    private String roomType; // e.g., Single, Double, Suite
    private double pricePerNight;
    private boolean booked;

    // Constructor
    public Model(String roomId, String roomType, double pricePerNight) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.booked = false;
    }

    // Getters and Setters
    public String getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookRoom() {
        if (!booked) {
            this.booked = true;
            System.out.println("Room booked: " + roomId);
        } else {
            System.out.println("Room already booked: " + roomId);
        }
    }
}

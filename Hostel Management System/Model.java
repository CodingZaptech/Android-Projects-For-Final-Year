package com.example.hostelmanagement.model;

/**
 * Model class representing a hostel student record.
 */
public class Model {
    private String studentName;
    private String roomNumber;
    private int floor;
    private String contact;

    // Constructor
    public Model(String studentName, String roomNumber, int floor, String contact) {
        this.studentName = studentName;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.contact = contact;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

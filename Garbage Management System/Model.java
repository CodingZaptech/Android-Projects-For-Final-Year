package com.example.garbage.model;

/**
 * Model class representing a garbage collection request.
 */
public class Model {

    private String requestId;
    private String userName;
    private String location;
    private String garbageType;
    private boolean collected;

    // Constructor
    public Model(String requestId, String userName, String location, String garbageType) {
        this.requestId = requestId;
        this.userName = userName;
        this.location = location;
        this.garbageType = garbageType;
        this.collected = false;
    }

    // Getters and Setters
    public String getRequestId() {
        return requestId;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public String getGarbageType() {
        return garbageType;
    }

    public boolean isCollected() {
        return collected;
    }

    public void markCollected() {
        this.collected = true;
    }
}

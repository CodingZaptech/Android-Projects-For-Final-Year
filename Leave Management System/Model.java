package com.example.leave.model;

/**
 * Model class representing an employee or student leave request.
 */
public class Model {

    private String name;
    private String id;
    private int leaveDays;
    private String reason;
    private boolean approved;

    // Constructor
    public Model(String name, String id, int leaveDays, String reason) {
        this.name = name;
        this.id = id;
        this.leaveDays = leaveDays;
        this.reason = reason;
        this.approved = false;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isApproved() {
        return approved;
    }

    public void approve() {
        this.approved = true;
    }
}

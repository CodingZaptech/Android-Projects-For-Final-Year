package com.example.chatgame.model;

/**
 * Model class representing a chat game message.
 */
public class Model {

    private String sender;
    private String message;

    // Constructor
    public Model(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    // Getters and Setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

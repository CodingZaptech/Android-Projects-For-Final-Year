package com.example.studentscommunication.service;

import com.example.studentscommunication.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle business logic for student communication.
 */
public class Service {

    private List<Model> messages;

    public Service() {
        this.messages = new ArrayList<>();
    }

    /**
     * Adds a new message.
     * @param message Message model
     */
    public void addMessage(Model message) {
        messages.add(message);
    }

    /**
     * Returns all messages.
     * @return List of messages
     */
    public List<Model> getAllMessages() {
        return messages;
    }

    /**
     * Clears all messages.
     */
    public void clearMessages() {
        messages.clear();
    }
}

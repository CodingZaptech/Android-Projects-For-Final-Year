package com.example.bluetoothchatapp.service;

import com.example.bluetoothchatapp.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle business logic for sending and storing messages.
 */
public class Service {

    // Store all chat messages in memory (for simplicity)
    private List<Model> messageList;

    public Service() {
        this.messageList = new ArrayList<>();
    }

    /**
     * Adds a message to the chat history.
     * @param message The chat message to add
     */
    public void addMessage(Model message) {
        messageList.add(message);
    }

    /**
     * Returns all chat messages.
     * @return List of messages
     */
    public List<Model> getAllMessages() {
        return messageList;
    }

    /**
     * Clears all chat messages.
     */
    public void clearMessages() {
        messageList.clear();
    }
}

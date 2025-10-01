package com.example.bluetoothchatapp.controller;

import com.example.bluetoothchatapp.model.Model;
import com.example.bluetoothchatapp.service.Service;

import java.util.List;

/**
 * Controller class to handle user interactions and requests.
 */
public class Controller {

    private Service chatService;

    public Controller() {
        this.chatService = new Service();
    }

    /**
     * Sends a message by adding it to the service.
     * @param sender Name of the sender
     * @param message Message text
     */
    public void sendMessage(String sender, String message) {
        long timestamp = System.currentTimeMillis();
        Model chatMessage = new Model(sender, message, timestamp);
        chatService.addMessage(chatMessage);
        System.out.println("Message sent: " + message);
    }

    /**
     * Retrieves all chat messages.
     * @return List of chat messages
     */
    public List<Model> getChatHistory() {
        return chatService.getAllMessages();
    }

    /**
     * Clears all chat history.
     */
    public void clearChat() {
        chatService.clearMessages();
        System.out.println("Chat history cleared.");
    }
}

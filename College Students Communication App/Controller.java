package com.example.studentscommunication.controller;

import com.example.studentscommunication.model.Model;
import com.example.studentscommunication.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions in the Students Communication App.
 */
public class Controller {

    private Service messageService;

    public Controller() {
        this.messageService = new Service();
    }

    /**
     * Sends a message.
     * @param sender Sender's name
     * @param message Message text
     */
    public void sendMessage(String sender, String message) {
        long timestamp = System.currentTimeMillis();
        Model msg = new Model(sender, message, timestamp);
        messageService.addMessage(msg);
        System.out.println("Message sent by " + sender);
    }

    /**
     * Retrieves all messages.
     * @return List of messages
     */
    public List<Model> getMessages() {
        return messageService.getAllMessages();
    }

    /**
     * Clears all messages.
     */
    public void clearMessages() {
        messageService.clearMessages();
        System.out.println("All messages cleared.");
    }
}

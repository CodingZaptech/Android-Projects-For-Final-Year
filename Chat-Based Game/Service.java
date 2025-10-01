package com.example.chatgame.service;

import com.example.chatgame.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage chat messages in the game.
 */
public class Service {

    private List<Model> messages;

    public Service() {
        messages = new ArrayList<>();
    }

    public void sendMessage(Model message) {
        messages.add(message);
        System.out.println(message.getSender() + ": " + message.getMessage());
    }

    public List<Model> getAllMessages() {
        return messages;
    }
}

package com.example.chatgame.controller;

import com.example.chatgame.model.Model;
import com.example.chatgame.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Chat-Based Game App.
 */
public class Controller {

    private Service chatService;

    public Controller() {
        chatService = new Service();
    }

    public void sendMessage(String sender, String message) {
        Model msg = new Model(sender, message);
        chatService.sendMessage(msg);
    }

    public List<Model> getAllMessages() {
        return chatService.getAllMessages();
    }
}

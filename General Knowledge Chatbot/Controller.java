package com.example.gkchatbot.controller;

import com.example.gkchatbot.service.Service;

/**
 * Controller class to handle interactions for General Knowledge Chatbot App.
 */
public class Controller {

    private Service chatbotService;

    public Controller() {
        this.chatbotService = new Service();
    }

    /**
     * Asks a question to the chatbot.
     * @param question User question
     * @return Chatbot answer
     */
    public String askQuestion(String question) {
        String answer = chatbotService.getAnswer(question);
        System.out.println("Q: " + question);
        System.out.println("A: " + answer);
        return answer;
    }
}

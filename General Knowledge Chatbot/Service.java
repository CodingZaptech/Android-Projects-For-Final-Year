package com.example.gkchatbot.service;

import com.example.gkchatbot.model.Model;
import java.util.HashMap;
import java.util.Map;

/**
 * Service class to manage chatbot logic.
 */
public class Service {

    private Map<String, String> knowledgeBase;

    public Service() {
        knowledgeBase = new HashMap<>();
        knowledgeBase.put("capital of France", "Paris");
        knowledgeBase.put("largest planet", "Jupiter");
        knowledgeBase.put("speed of light", "299,792 km/s");
    }

    /**
     * Returns answer for a question.
     * @param question User question
     * @return Answer
     */
    public String getAnswer(String question) {
        return knowledgeBase.getOrDefault(question.toLowerCase(), "I don't know the answer.");
    }
}

package com.example.gkchatbot.model;

/**
 * Model class representing a chatbot response.
 */
public class Model {
    private String question;
    private String answer;

    // Constructor
    public Model(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

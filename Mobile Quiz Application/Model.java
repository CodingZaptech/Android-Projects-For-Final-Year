package com.example.quiz.model;

/**
 * Model class representing a quiz question.
 */
public class Model {

    private String question;
    private String[] options;
    private int correctOption; // index of correct option

    // Constructor
    public Model(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }
}

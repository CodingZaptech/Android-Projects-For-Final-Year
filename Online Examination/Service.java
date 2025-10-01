package com.example.onlineexam.service;

import com.example.onlineexam.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage exam questions.
 */
public class Service {

    private List<Model> questions;

    public Service() {
        this.questions = new ArrayList<>();
    }

    /**
     * Adds a new question.
     * @param question Question model
     */
    public void addQuestion(Model question) {
        questions.add(question);
    }

    /**
     * Returns all questions.
     * @return List of questions
     */
    public List<Model> getAllQuestions() {
        return questions;
    }

    /**
     * Clears all questions.
     */
    public void clearQuestions() {
        questions.clear();
    }
}

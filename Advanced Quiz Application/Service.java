package com.example.mobilequiz.service;

import com.example.mobilequiz.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage quiz questions.
 */
public class Service {

    private List<Model> questions;

    public Service() {
        this.questions = new ArrayList<>();
    }

    /**
     * Adds a new quiz question.
     * @param question Question model
     */
    public void addQuestion(Model question) {
        questions.add(question);
    }

    /**
     * Returns all quiz questions.
     * @return List of questions
     */
    public List<Model> getAllQuestions() {
        return questions;
    }

    /**
     * Clears all quiz questions.
     */
    public void clearQuestions() {
        questions.clear();
    }
}

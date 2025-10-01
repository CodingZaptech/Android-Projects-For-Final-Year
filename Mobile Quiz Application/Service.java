package com.example.quiz.service;

import com.example.quiz.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage quiz questions.
 */
public class Service {

    private List<Model> questions;

    public Service() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Model question) {
        questions.add(question);
        System.out.println("Question added: " + question.getQuestion());
    }

    public List<Model> getQuestions() {
        return questions;
    }

    public boolean checkAnswer(Model question, int selectedOption) {
        return question.getCorrectOption() == selectedOption;
    }
}

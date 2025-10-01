package com.example.quiz.controller;

import com.example.quiz.model.Model;
import com.example.quiz.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Mobile Quiz App.
 */
public class Controller {

    private Service quizService;

    public Controller() {
        quizService = new Service();
    }

    public void addQuestion(String question, String[] options, int correctOption) {
        Model q = new Model(question, options, correctOption);
        quizService.addQuestion(q);
    }

    public List<Model> getAllQuestions() {
        return quizService.getQuestions();
    }

    public boolean checkAnswer(Model question, int selectedOption) {
        return quizService.checkAnswer(question, selectedOption);
    }
}

package com.example.mobilequiz.controller;

import com.example.mobilequiz.model.Model;
import com.example.mobilequiz.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Mobile Quiz Application.
 */
public class Controller {

    private Service quizService;

    public Controller() {
        this.quizService = new Service();
    }

    /**
     * Adds a new quiz question.
     * @param question Question text
     * @param options Options array
     * @param correctIndex Correct option index
     */
    public void addQuestion(String question, String[] options, int correctIndex) {
        Model q = new Model(question, options, correctIndex);
        quizService.addQuestion(q);
        System.out.println("Question added: " + question);
    }

    /**
     * Retrieves all quiz questions.
     * @return List of questions
     */
    public List<Model> getQuestions() {
        return quizService.getAllQuestions();
    }

    /**
     * Clears all quiz questions.
     */
    public void clearQuestions() {
        quizService.clearQuestions();
        System.out.println("All questions cleared.");
    }
}

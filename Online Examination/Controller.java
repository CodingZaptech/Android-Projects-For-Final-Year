package com.example.onlineexam.controller;

import com.example.onlineexam.model.Model;
import com.example.onlineexam.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Online Examination.
 */
public class Controller {

    private Service examService;

    public Controller() {
        this.examService = new Service();
    }

    /**
     * Adds a new question to the exam.
     * @param question Question text
     * @param options Answer options
     * @param correctAnswerIndex Correct option index
     */
    public void addQuestion(String question, String[] options, int correctAnswerIndex) {
        Model q = new Model(question, options, correctAnswerIndex);
        examService.addQuestion(q);
        System.out.println("Question added: " + question);
    }

    /**
     * Retrieves all questions.
     * @return List of questions
     */
    public List<Model> getQuestions() {
        return examService.getAllQuestions();
    }

    /**
     * Clears all questions.
     */
    public void clearQuestions() {
        examService.clearQuestions();
        System.out.println("All questions cleared.");
    }
}

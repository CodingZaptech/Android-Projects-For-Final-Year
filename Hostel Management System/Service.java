package com.example.hostelmanagement.service;

import com.example.hostelmanagement.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage hostel student records.
 */
public class Service {

    private List<Model> studentList;

    public Service() {
        this.studentList = new ArrayList<>();
    }

    /**
     * Adds a new student record.
     * @param student Student model
     */
    public void addStudent(Model student) {
        studentList.add(student);
    }

    /**
     * Returns all student records.
     * @return List of students
     */
    public List<Model> getAllStudents() {
        return studentList;
    }

    /**
     * Clears all student records.
     */
    public void clearStudents() {
        studentList.clear();
    }
}

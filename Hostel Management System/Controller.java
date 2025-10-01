package com.example.hostelmanagement.controller;

import com.example.hostelmanagement.model.Model;
import com.example.hostelmanagement.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Hostel Management.
 */
public class Controller {

    private Service hostelService;

    public Controller() {
        this.hostelService = new Service();
    }

    /**
     * Adds a new student record.
     * @param name Student name
     * @param room Room number
     * @param floor Floor number
     * @param contact Contact information
     */
    public void addStudent(String name, String room, int floor, String contact) {
        Model student = new Model(name, room, floor, contact);
        hostelService.addStudent(student);
        System.out.println("Student record added: " + name);
    }

    /**
     * Retrieves all student records.
     * @return List of students
     */
    public List<Model> getStudents() {
        return hostelService.getAllStudents();
    }

    /**
     * Clears all student records.
     */
    public void clearStudents() {
        hostelService.clearStudents();
        System.out.println("All student records cleared.");
    }
}

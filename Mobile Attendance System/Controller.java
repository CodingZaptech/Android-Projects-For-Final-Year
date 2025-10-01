package com.example.attendance.controller;

import com.example.attendance.model.Model;
import com.example.attendance.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Mobile Attendance System.
 */
public class Controller {

    private Service attendanceService;

    public Controller() {
        this.attendanceService = new Service();
    }

    public void addStudent(String name, String id) {
        Model student = new Model(name, id);
        attendanceService.addStudent(student);
    }

    public void markAttendance(Model student, String subject, boolean present) {
        attendanceService.markAttendance(student, subject, present);
    }

    public List<Model> getAllStudents() {
        return attendanceService.getStudents();
    }
}

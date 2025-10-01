package com.example.attendance.service;

import com.example.attendance.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage student attendance.
 */
public class Service {

    private List<Model> students;

    public Service() {
        students = new ArrayList<>();
    }

    public void addStudent(Model student) {
        students.add(student);
        System.out.println("Added student: " + student.getStudentName());
    }

    public void markAttendance(Model student, String subject, boolean present) {
        student.markAttendance(subject, present);
        System.out.println("Marked " + subject + " attendance for " + student.getStudentName() + ": " + present);
    }

    public List<Model> getStudents() {
        return students;
    }
}

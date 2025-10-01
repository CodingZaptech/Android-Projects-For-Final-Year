package com.example.attendance.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Model class representing a student and their attendance record.
 */
public class Model {

    private String studentName;
    private String studentId;
    private Map<String, Boolean> attendance; // Subject -> Present/Absent

    // Constructor
    public Model(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.attendance = new HashMap<>();
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Map<String, Boolean> getAttendance() {
        return attendance;
    }

    public void markAttendance(String subject, boolean present) {
        attendance.put(subject, present);
    }
}

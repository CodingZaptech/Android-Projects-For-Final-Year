package com.example.hospitalmanagement.model;

/**
 * Model class representing a patient record.
 */
public class Model {
    private String patientName;
    private int age;
    private String ailment;
    private String doctorAssigned;

    // Constructor
    public Model(String patientName, int age, String ailment, String doctorAssigned) {
        this.patientName = patientName;
        this.age = age;
        this.ailment = ailment;
        this.doctorAssigned = doctorAssigned;
    }

    // Getters and Setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }
}

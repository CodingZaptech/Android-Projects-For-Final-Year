package com.example.vaccination.model;

/**
 * Model class representing a vaccination record.
 */
public class Model {

    private String personName;
    private String vaccineName;
    private String dateOfVaccination;
    private boolean completed;

    // Constructor
    public Model(String personName, String vaccineName, String dateOfVaccination) {
        this.personName = personName;
        this.vaccineName = vaccineName;
        this.dateOfVaccination = dateOfVaccination;
        this.completed = false;
    }

    // Getters and Setters
    public String getPersonName() {
        return personName;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public String getDateOfVaccination() {
        return dateOfVaccination;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
        System.out.println("Vaccination completed for: " + personName);
    }
}

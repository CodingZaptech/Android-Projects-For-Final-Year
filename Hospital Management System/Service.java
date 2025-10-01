package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle hospital management business logic.
 */
public class Service {

    private List<Model> patientList;

    public Service() {
        this.patientList = new ArrayList<>();
    }

    /**
     * Adds a new patient record.
     * @param patient Patient model
     */
    public void addPatient(Model patient) {
        patientList.add(patient);
    }

    /**
     * Returns all patient records.
     * @return List of patients
     */
    public List<Model> getAllPatients() {
        return patientList;
    }

    /**
     * Clears all patient records.
     */
    public void clearPatients() {
        patientList.clear();
    }
}

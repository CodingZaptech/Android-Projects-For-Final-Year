package com.example.hospitalmanagement.controller;

import com.example.hospitalmanagement.model.Model;
import com.example.hospitalmanagement.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Hospital Management System.
 */
public class Controller {

    private Service hospitalService;

    public Controller() {
        this.hospitalService = new Service();
    }

    /**
     * Adds a new patient record.
     * @param name Patient name
     * @param age Age
     * @param ailment Ailment description
     * @param doctor Assigned doctor
     */
    public void addPatient(String name, int age, String ailment, String doctor) {
        Model patient = new Model(name, age, ailment, doctor);
        hospitalService.addPatient(patient);
        System.out.println("Patient record added: " + name);
    }

    /**
     * Retrieves all patient records.
     * @return List of patients
     */
    public List<Model> getPatients() {
        return hospitalService.getAllPatients();
    }

    /**
     * Clears all patient records.
     */
    public void clearPatients() {
        hospitalService.clearPatients();
        System.out.println("All patient records cleared.");
    }
}

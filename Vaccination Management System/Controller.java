package com.example.vaccination.controller;

import com.example.vaccination.model.Model;
import com.example.vaccination.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Vaccination Management System App.
 */
public class Controller {

    private Service vaccinationService;

    public Controller() {
        vaccinationService = new Service();
    }

    public void addRecord(String name, String vaccine, String date) {
        Model record = new Model(name, vaccine, date);
        vaccinationService.addRecord(record);
    }

    public void markCompleted(Model record) {
        vaccinationService.markCompleted(record);
    }

    public List<Model> getAllRecords() {
        return vaccinationService.getAllRecords();
    }
}

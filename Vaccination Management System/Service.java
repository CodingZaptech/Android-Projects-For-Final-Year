package com.example.vaccination.service;

import com.example.vaccination.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage vaccination records.
 */
public class Service {

    private List<Model> records;

    public Service() {
        records = new ArrayList<>();
    }

    public void addRecord(Model record) {
        records.add(record);
        System.out.println("Vaccination record added: " + record.getPersonName());
    }

    public void markCompleted(Model record) {
        record.markCompleted();
    }

    public List<Model> getAllRecords() {
        return records;
    }
}

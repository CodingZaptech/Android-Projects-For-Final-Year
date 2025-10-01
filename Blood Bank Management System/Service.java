package com.example.bloodbank.service;

import com.example.bloodbank.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage blood units and donors.
 */
public class Service {

    private List<Model> donors;

    public Service() {
        donors = new ArrayList<>();
    }

    public void addDonor(Model donor) {
        donors.add(donor);
        System.out.println("Donor added: " + donor.getDonorName());
    }

    public void updateUnits(Model donor, int units) {
        donor.setUnits(units);
        System.out.println("Updated units for " + donor.getDonorName());
    }

    public List<Model> getDonors() {
        return donors;
    }
}

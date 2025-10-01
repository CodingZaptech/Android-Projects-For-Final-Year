package com.example.bloodbank.controller;

import com.example.bloodbank.model.Model;
import com.example.bloodbank.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Blood Bank Management System.
 */
public class Controller {

    private Service bloodBankService;

    public Controller() {
        bloodBankService = new Service();
    }

    public void addDonor(String name, String bloodGroup, int units) {
        Model donor = new Model(name, bloodGroup, units);
        bloodBankService.addDonor(donor);
    }

    public void updateUnits(Model donor, int units) {
        bloodBankService.updateUnits(donor, units);
    }

    public List<Model> getAllDonors() {
        return bloodBankService.getDonors();
    }
}

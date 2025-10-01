package com.example.homeautomation.controller;

import com.example.homeautomation.model.Model;
import com.example.homeautomation.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Home Automation System App.
 */
public class Controller {

    private Service automationService;

    public Controller() {
        automationService = new Service();
    }

    public void addDevice(String name, String location) {
        Model device = new Model(name, location);
        automationService.addDevice(device);
    }

    public void turnOnDevice(Model device) {
        automationService.turnOnDevice(device);
    }

    public void turnOffDevice(Model device) {
        automationService.turnOffDevice(device);
    }

    public List<Model> getAllDevices() {
        return automationService.getAllDevices();
    }
}

package com.example.womensecurity.controller;

import com.example.womensecurity.model.Model;
import com.example.womensecurity.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Women Security SMS Service App.
 */
public class Controller {

    private Service securityService;

    public Controller() {
        securityService = new Service();
    }

    public void registerAlert(String userName, String phone, String location) {
        Model alert = new Model(userName, phone, location);
        securityService.addAlert(alert);
    }

    public void sendAlert(Model alert) {
        securityService.sendAlert(alert);
    }

    public List<Model> getAllAlerts() {
        return securityService.getAllAlerts();
    }
}

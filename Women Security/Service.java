package com.example.womensecurity.service;

import com.example.womensecurity.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage emergency alerts.
 */
public class Service {

    private List<Model> alerts;

    public Service() {
        alerts = new ArrayList<>();
    }

    public void addAlert(Model alert) {
        alerts.add(alert);
        System.out.println("Alert registered for: " + alert.getUserName());
    }

    public void sendAlert(Model alert) {
        alert.sendAlert();
    }

    public List<Model> getAllAlerts() {
        return alerts;
    }
}

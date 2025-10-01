package com.example.homeautomation.service;

import com.example.homeautomation.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage home automation devices.
 */
public class Service {

    private List<Model> devices;

    public Service() {
        devices = new ArrayList<>();
    }

    public void addDevice(Model device) {
        devices.add(device);
        System.out.println("Device added: " + device.getDeviceName());
    }

    public void turnOnDevice(Model device) {
        device.turnOn();
    }

    public void turnOffDevice(Model device) {
        device.turnOff();
    }

    public List<Model> getAllDevices() {
        return devices;
    }
}

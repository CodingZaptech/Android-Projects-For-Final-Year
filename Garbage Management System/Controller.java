package com.example.garbage.controller;

import com.example.garbage.model.Model;
import com.example.garbage.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Garbage Management System App.
 */
public class Controller {

    private Service garbageService;

    public Controller() {
        garbageService = new Service();
    }

    public void addRequest(String id, String userName, String location, String garbageType) {
        Model request = new Model(id, userName, location, garbageType);
        garbageService.addRequest(request);
    }

    public void collectGarbage(Model request) {
        garbageService.collectGarbage(request);
    }

    public List<Model> getAllRequests() {
        return garbageService.getAllRequests();
    }
}

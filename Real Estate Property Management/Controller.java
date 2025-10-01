package com.example.realestate.controller;

import com.example.realestate.model.Model;
import com.example.realestate.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Real Estate Property Management App.
 */
public class Controller {

    private Service propertyService;

    public Controller() {
        propertyService = new Service();
    }

    public void addProperty(String id, String owner, String type, double price, String location) {
        Model property = new Model(id, owner, type, price, location);
        propertyService.addProperty(property);
    }

    public List<Model> getAllProperties() {
        return propertyService.getAllProperties();
    }

    public Model searchProperty(String propertyId) {
        return propertyService.searchPropertyById(propertyId);
    }
}

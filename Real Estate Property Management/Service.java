package com.example.realestate.service;

import com.example.realestate.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage properties.
 */
public class Service {

    private List<Model> properties;

    public Service() {
        properties = new ArrayList<>();
    }

    public void addProperty(Model property) {
        properties.add(property);
        System.out.println("Property added: " + property.getPropertyId());
    }

    public List<Model> getAllProperties() {
        return properties;
    }

    public Model searchPropertyById(String propertyId) {
        for (Model property : properties) {
            if (property.getPropertyId().equals(propertyId)) {
                return property;
            }
        }
        return null;
    }
}

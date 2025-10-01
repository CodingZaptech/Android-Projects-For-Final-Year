package com.example.restaurant.controller;

import com.example.restaurant.model.Model;
import com.example.restaurant.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Restaurant Management System.
 */
public class Controller {

    private Service restaurantService;

    public Controller() {
        restaurantService = new Service();
    }

    public void addMenuItem(String name, double price, int quantity) {
        Model item = new Model(name, price, quantity);
        restaurantService.addMenuItem(item);
    }

    public void updateQuantity(Model item, int quantity) {
        restaurantService.updateQuantity(item, quantity);
    }

    public List<Model> getMenuItems() {
        return restaurantService.getMenuItems();
    }
}

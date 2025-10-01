package com.example.restaurant.service;

import com.example.restaurant.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage restaurant orders and menu.
 */
public class Service {

    private List<Model> menuItems;

    public Service() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(Model item) {
        menuItems.add(item);
        System.out.println("Added menu item: " + item.getItemName());
    }

    public void updateQuantity(Model item, int quantity) {
        item.setQuantity(quantity);
        System.out.println("Updated quantity for " + item.getItemName() + " to " + quantity);
    }

    public List<Model> getMenuItems() {
        return menuItems;
    }
}

package com.example.grocery.controller;

import com.example.grocery.model.Model;
import com.example.grocery.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Grocery Store Management System.
 */
public class Controller {

    private Service groceryService;

    public Controller() {
        groceryService = new Service();
    }

    public void addProduct(String name, double price, int stock) {
        Model product = new Model(name, price, stock);
        groceryService.addProduct(product);
    }

    public void updateStock(Model product, int stock) {
        groceryService.updateStock(product, stock);
    }

    public List<Model> getAllProducts() {
        return groceryService.getProducts();
    }
}

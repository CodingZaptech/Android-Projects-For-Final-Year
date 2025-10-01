package com.example.grocery.service;

import com.example.grocery.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage grocery store inventory.
 */
public class Service {

    private List<Model> products;

    public Service() {
        products = new ArrayList<>();
    }

    public void addProduct(Model product) {
        products.add(product);
        System.out.println("Product added: " + product.getProductName());
    }

    public void updateStock(Model product, int stock) {
        product.setStock(stock);
        System.out.println("Updated stock for: " + product.getProductName());
    }

    public List<Model> getProducts() {
        return products;
    }
}

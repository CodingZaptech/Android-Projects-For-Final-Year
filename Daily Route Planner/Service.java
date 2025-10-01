package com.example.dailyroutes.service;

import com.example.dailyroutes.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage daily routes.
 */
public class Service {

    private List<Model> routeList;

    public Service() {
        this.routeList = new ArrayList<>();
    }

    /**
     * Adds a new route.
     * @param route Route model
     */
    public void addRoute(Model route) {
        routeList.add(route);
    }

    /**
     * Returns all planned routes.
     * @return List of routes
     */
    public List<Model> getAllRoutes() {
        return routeList;
    }

    /**
     * Clears all planned routes.
     */
    public void clearRoutes() {
        routeList.clear();
    }
}

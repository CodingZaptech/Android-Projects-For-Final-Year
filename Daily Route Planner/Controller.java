package com.example.dailyroutes.controller;

import com.example.dailyroutes.model.Model;
import com.example.dailyroutes.service.Service;
import java.util.List;

/**
 * Controller class to handle user interactions for Daily Route Planner.
 */
public class Controller {

    private Service routeService;

    public Controller() {
        this.routeService = new Service();
    }

    /**
     * Adds a new daily route.
     * @param start Start location
     * @param end End location
     * @param date Date of the route
     * @param notes Additional notes
     */
    public void addRoute(String start, String end, String date, String notes) {
        Model route = new Model(start, end, date, notes);
        routeService.addRoute(route);
        System.out.println("Route added from " + start + " to " + end);
    }

    /**
     * Retrieves all routes.
     * @return List of routes
     */
    public List<Model> getRoutes() {
        return routeService.getAllRoutes();
    }

    /**
     * Clears all routes.
     */
    public void clearRoutes() {
        routeService.clearRoutes();
        System.out.println("All routes cleared.");
    }
}

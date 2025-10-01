package com.example.partymanagement.controller;

import com.example.partymanagement.model.Model;
import com.example.partymanagement.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Party Management System.
 */
public class Controller {

    private Service eventService;

    public Controller() {
        this.eventService = new Service();
    }

    /**
     * Adds a new party event.
     * @param name Event name
     * @param date Event date
     * @param location Event location
     * @param attendees Number of attendees
     */
    public void addEvent(String name, String date, String location, int attendees) {
        Model event = new Model(name, date, location, attendees);
        eventService.addEvent(event);
        System.out.println("Event added: " + name);
    }

    /**
     * Retrieves all party events.
     * @return List of events
     */
    public List<Model> getEvents() {
        return eventService.getAllEvents();
    }

    /**
     * Clears all events.
     */
    public void clearEvents() {
        eventService.clearEvents();
        System.out.println("All events cleared.");
    }
}

package com.example.partymanagement.service;

import com.example.partymanagement.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage party events.
 */
public class Service {

    private List<Model> events;

    public Service() {
        this.events = new ArrayList<>();
    }

    /**
     * Adds a new party event.
     * @param event Event model
     */
    public void addEvent(Model event) {
        events.add(event);
    }

    /**
     * Returns all party events.
     * @return List of events
     */
    public List<Model> getAllEvents() {
        return events;
    }

    /**
     * Clears all events.
     */
    public void clearEvents() {
        events.clear();
    }
}

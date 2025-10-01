package com.example.garbage.service;

import com.example.garbage.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage garbage collection requests.
 */
public class Service {

    private List<Model> requests;

    public Service() {
        requests = new ArrayList<>();
    }

    public void addRequest(Model request) {
        requests.add(request);
        System.out.println("Garbage request added: " + request.getRequestId());
    }

    public void collectGarbage(Model request) {
        request.markCollected();
        System.out.println("Garbage collected for request: " + request.getRequestId());
    }

    public List<Model> getAllRequests() {
        return requests;
    }
}

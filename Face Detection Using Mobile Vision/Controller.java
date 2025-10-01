package com.example.facedetection.controller;

import com.example.facedetection.model.Model;
import com.example.facedetection.service.Service;
import java.util.List;

/**
 * Controller class to handle face detection operations.
 */
public class Controller {

    private Service faceService;

    public Controller() {
        this.faceService = new Service();
    }

    /**
     * Adds a detected face to the service.
     * @param id Face ID
     * @param x X-coordinate
     * @param y Y-coordinate
     * @param width Width of the face
     * @param height Height of the face
     */
    public void addFace(int id, float x, float y, float width, float height) {
        Model face = new Model(id, x, y, width, height);
        faceService.addFace(face);
        System.out.println("Face detected with ID: " + id);
    }

    /**
     * Retrieves all detected faces.
     * @return List of faces
     */
    public List<Model> getDetectedFaces() {
        return faceService.getAllFaces();
    }

    /**
     * Clears all detected faces.
     */
    public void clearFaces() {
        faceService.clearFaces();
        System.out.println("All detected faces cleared.");
    }
}

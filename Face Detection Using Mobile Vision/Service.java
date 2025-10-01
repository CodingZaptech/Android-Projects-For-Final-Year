package com.example.facedetection.service;

import com.example.facedetection.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage detected faces.
 */
public class Service {

    private List<Model> detectedFaces;

    public Service() {
        this.detectedFaces = new ArrayList<>();
    }

    /**
     * Adds a detected face.
     * @param face Face model
     */
    public void addFace(Model face) {
        detectedFaces.add(face);
    }

    /**
     * Returns all detected faces.
     * @return List of faces
     */
    public List<Model> getAllFaces() {
        return detectedFaces;
    }

    /**
     * Clears all detected faces.
     */
    public void clearFaces() {
        detectedFaces.clear();
    }
}

package com.example.filesharing.service;

import com.example.filesharing.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to handle file sharing logic.
 */
public class Service {

    private List<Model> sharedFiles;

    public Service() {
        this.sharedFiles = new ArrayList<>();
    }

    /**
     * Adds a new shared file.
     * @param file File model
     */
    public void addFile(Model file) {
        sharedFiles.add(file);
    }

    /**
     * Returns all shared files.
     * @return List of files
     */
    public List<Model> getAllFiles() {
        return sharedFiles;
    }

    /**
     * Clears all shared files.
     */
    public void clearFiles() {
        sharedFiles.clear();
    }
}

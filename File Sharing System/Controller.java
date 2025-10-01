package com.example.filesharing.controller;

import com.example.filesharing.model.Model;
import com.example.filesharing.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for File Sharing Android App.
 */
public class Controller {

    private Service fileService;

    public Controller() {
        this.fileService = new Service();
    }

    /**
     * Shares a file.
     * @param fileName Name of the file
     * @param fileType File type
     * @param fileSize File size in bytes
     * @param sharedBy User sharing the file
     */
    public void shareFile(String fileName, String fileType, long fileSize, String sharedBy) {
        Model file = new Model(fileName, fileType, fileSize, sharedBy);
        fileService.addFile(file);
        System.out.println("File shared: " + fileName);
    }

    /**
     * Retrieves all shared files.
     * @return List of files
     */
    public List<Model> getFiles() {
        return fileService.getAllFiles();
    }

    /**
     * Clears all shared files.
     */
    public void clearFiles() {
        fileService.clearFiles();
        System.out.println("All shared files cleared.");
    }
}

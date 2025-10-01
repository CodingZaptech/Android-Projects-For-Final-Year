package com.example.filesharing.model;

/**
 * Model class representing a file to be shared.
 */
public class Model {
    private String fileName;
    private String fileType;
    private long fileSize;
    private String sharedBy;

    // Constructor
    public Model(String fileName, String fileType, long fileSize, String sharedBy) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.sharedBy = sharedBy;
    }

    // Getters and Setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getSharedBy() {
        return sharedBy;
    }

    public void setSharedBy(String sharedBy) {
        this.sharedBy = sharedBy;
    }
}

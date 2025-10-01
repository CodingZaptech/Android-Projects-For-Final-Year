package com.example.socialnetworking.model;

/**
 * Model class representing a social post.
 */
public class Model {
    private String userName;
    private String content;
    private long timestamp;

    // Constructor
    public Model(String userName, String content, long timestamp) {
        this.userName = userName;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

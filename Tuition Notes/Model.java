package com.example.tuitionnotes.model;

/**
 * Model class representing a tuition note.
 */
public class Model {
    private String title;
    private String subject;
    private String content;

    // Constructor
    public Model(String title, String subject, String content) {
        this.title = title;
        this.subject = subject;
        this.content = content;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package com.example.tuitionnotes.controller;

import com.example.tuitionnotes.model.Model;
import com.example.tuitionnotes.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions in the Tuition Notes App.
 */
public class Controller {

    private Service noteService;

    public Controller() {
        this.noteService = new Service();
    }

    /**
     * Adds a new note.
     * @param title Note title
     * @param subject Subject name
     * @param content Note content
     */
    public void addNote(String title, String subject, String content) {
        Model note = new Model(title, subject, content);
        noteService.addNote(note);
        System.out.println("Note added: " + title);
    }

    /**
     * Retrieves all notes.
     * @return List of notes
     */
    public List<Model> getNotes() {
        return noteService.getAllNotes();
    }

    /**
     * Clears all notes.
     */
    public void clearNotes() {
        noteService.clearNotes();
        System.out.println("All notes cleared.");
    }
}

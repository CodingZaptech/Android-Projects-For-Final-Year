package com.example.tuitionnotes.service;

import com.example.tuitionnotes.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage tuition notes.
 */
public class Service {

    private List<Model> notes;

    public Service() {
        this.notes = new ArrayList<>();
    }

    /**
     * Adds a new note.
     * @param note Note model
     */
    public void addNote(Model note) {
        notes.add(note);
    }

    /**
     * Returns all notes.
     * @return List of notes
     */
    public List<Model> getAllNotes() {
        return notes;
    }

    /**
     * Clears all notes.
     */
    public void clearNotes() {
        notes.clear();
    }
}

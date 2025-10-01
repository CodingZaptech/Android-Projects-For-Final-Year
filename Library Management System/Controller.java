package com.example.library.controller;

import com.example.library.model.Model;
import com.example.library.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Library Management System.
 */
public class Controller {

    private Service libraryService;

    public Controller() {
        libraryService = new Service();
    }

    public void addBook(String title, String author, String isbn) {
        Model book = new Model(title, author, isbn);
        libraryService.addBook(book);
    }

    public void borrowBook(Model book) {
        libraryService.borrowBook(book);
    }

    public void returnBook(Model book) {
        libraryService.returnBook(book);
    }

    public List<Model> getAllBooks() {
        return libraryService.getAllBooks();
    }
}

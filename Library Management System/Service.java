package com.example.library.service;

import com.example.library.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage library books.
 */
public class Service {

    private List<Model> books;

    public Service() {
        books = new ArrayList<>();
    }

    public void addBook(Model book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void borrowBook(Model book) {
        book.borrowBook();
        System.out.println("Book borrowed: " + book.getTitle());
    }

    public void returnBook(Model book) {
        book.returnBook();
        System.out.println("Book returned: " + book.getTitle());
    }

    public List<Model> getAllBooks() {
        return books;
    }
}

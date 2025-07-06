package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String serviceId;

    // Constructor for constructor injection
    public BookService(String serviceId) {
        this.serviceId = serviceId;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService → ID: " + serviceId);
        System.out.println("BookService → Displaying books:");
        bookRepository.fetchBooks();
    }
}

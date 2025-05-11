package com.rt3.LibraryProject.services;

import com.rt3.LibraryProject.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private List<Book> books = List.of(
            new Book("Book 1", "Author A", 10.0),
            new Book("Book 2", "Author B", 15.5)
    );

    public List<Book> getBooks() {
        return books;
    }
}


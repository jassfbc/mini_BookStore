package com.rt3.LibraryProject.services;

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


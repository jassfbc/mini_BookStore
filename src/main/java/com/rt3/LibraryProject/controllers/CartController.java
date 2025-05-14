package com.rt3.LibraryProject.controllers;

import com.rt3.LibraryProject.models.Book;
import com.rt3.LibraryProject.models.Cart;
import com.rt3.LibraryProject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private BookService bookService;

    @Autowired
    private Cart cart;

    @PostMapping("/add")
    public ResponseEntity<?> addToCart(@RequestParam int index) {
        Book book = bookService.getBooks().get(index);
        cart.add(book);
        return ResponseEntity.ok("Book added");
    }

    @GetMapping
    public Cart viewCart() {
        return cart;
    }
}

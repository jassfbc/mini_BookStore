package com.rt3.LibraryProject.models;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private List<Book> items = new ArrayList<>();

    public void add(Book book) {
        items.add(book);
    }

    public List<Book> getItems() {
        return items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(Book::getPrice).sum();
    }

    public void clear() {
        items.clear();
    }
}

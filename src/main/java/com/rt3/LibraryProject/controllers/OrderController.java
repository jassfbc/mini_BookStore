package com.rt3.LibraryProject.controllers;

import com.rt3.LibraryProject.models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private Cart cart;

    @PostMapping
    public String placeOrder() {
        double total = cart.getTotal();
        cart.clear();
        return "Order placed! Total: $" + total;
    }
}

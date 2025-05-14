package com.rt3.LibraryProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Renders login.html
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // Renders signup.html
    }

    @PostMapping("/signup")
    public String handleSignup() {
        // For now, just redirect to login after "signup"
        // You can implement real logic here later
        return "redirect:/login";
    }
}

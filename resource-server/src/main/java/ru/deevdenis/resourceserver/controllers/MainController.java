package ru.deevdenis.resourceserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/messages")
    public String getMessages() {
        return "Hello there!";
    }
}

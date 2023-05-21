package com.app.rental.shop.dvd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DvdRentalController {

    @GetMapping
    public String showGreeting() {
        return "Welcome to DVD rental shop !!!";
    }
}

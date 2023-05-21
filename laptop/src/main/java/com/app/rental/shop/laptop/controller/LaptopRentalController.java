package com.app.rental.shop.laptop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class LaptopRentalController {

    @GetMapping
    public String showGreeting() {
        return "Welcome to LAPTOP rental shop !!!";
    }

}

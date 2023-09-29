package com.pollProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController{
    @GetMapping(value = "/testcontroler")
    public String testcontroler(){
        return "hey i am working";
    }

    // Define API endpoints for user CRUD operations
}
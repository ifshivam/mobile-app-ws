package com.learning.mobileappws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{userId}")
    public String getUser(@PathVariable String userId){
        return "x";
    }
    @PostMapping("/")
    public String createUser(){
        return "x";
    }
    @PutMapping()
    public String updateUser(){
        return "x";
    }
    @DeleteMapping
    public String deleteUser(){
        return "x";
    }
}

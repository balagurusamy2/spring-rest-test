package com.example.springresttest.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SimpleController {

    @GetMapping("/")
    public ResponseEntity<String> sayHello()
    {
       return ResponseEntity.ok().body("Hello world");
    }
}

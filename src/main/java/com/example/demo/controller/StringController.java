package com.example.demo.controller;

import com.example.demo.model.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class StringController {
    @GetMapping
    public ResponseEntity<Model> getString(){
        return ResponseEntity.ok(new Model("Hello"));
    }
}

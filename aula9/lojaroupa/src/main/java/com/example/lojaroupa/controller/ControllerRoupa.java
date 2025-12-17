package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roupas")
@CrossOrigin(origins = "*")
public class ControllerRoupa {
    @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa){
        System.out.println(roupa);

    }
}

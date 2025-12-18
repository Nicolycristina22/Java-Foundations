package com.example.lojaroupa.controller;

import com.example.lojaroupa.model.DadosRoupa;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/roupas")
@CrossOrigin(origins = "*")
public class ControllerRoupa {
    @Autowired

    private RoupaRepository roupaRepository;

    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosRoupa dadosRoupa){
        roupaRepository.save(new Roupa(dadosRoupa));
    }
}

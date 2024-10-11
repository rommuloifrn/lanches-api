package com.romm.comidas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.comidas.entities.Lanche;
import com.romm.comidas.services.LancheService;

@RestController
@RequestMapping(value = "/lanche")
public class LancheController {
    
    @Autowired LancheService ls;

    @GetMapping
    public List<Lanche> findAll() {
        return ls.findAll();
    }

    @PostMapping
    public Lanche create(@RequestBody Lanche l) {
        return ls.create(l);
    }

}

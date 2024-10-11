package com.romm.comidas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.comidas.DTOs.CadastroDeClienteDTO;
import com.romm.comidas.services.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
    
    @Autowired ClienteService cs;

    @PostMapping("/cadastro")
    public ResponseEntity<?> cadastro(@RequestBody CadastroDeClienteDTO data) {
        cs.cadastrar(data);

        return ResponseEntity.ok("Sucesso");
    }
    

}

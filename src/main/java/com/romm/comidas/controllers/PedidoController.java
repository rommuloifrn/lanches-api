package com.romm.comidas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.comidas.entities.Pedido;
import com.romm.comidas.enums.StatusDoPedido;
import com.romm.comidas.services.PedidoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/")
public class PedidoController {

    @Autowired PedidoService ps;

    @GetMapping()
    public List<Pedido> getMethodName() {
        return ps.findAll();
    }

    @PostMapping(consumes = "application/json")
    public Pedido create(@RequestBody Pedido pedido) {
        return ps.create(pedido);
    }

    @PostMapping("/mudar-status/{idDoPedido}")
    public ResponseEntity<?> postMethodName(@PathVariable Long idDoPedido, @RequestBody String status) {
        ps.mudarStatus(StatusDoPedido.valueOf(status), idDoPedido);
        
        return ResponseEntity.ok().build();
    }
    
    
    
}

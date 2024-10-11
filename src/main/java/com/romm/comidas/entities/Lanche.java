package com.romm.comidas.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity @Data
public class Lanche {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nome;
    private Float valor;

    @ManyToMany(mappedBy = "lanches")
    private List<Pedido> pedidos;
}

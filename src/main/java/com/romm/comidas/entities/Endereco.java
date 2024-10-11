package com.romm.comidas.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity @Data
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String lugar;
    private String complemento;

    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}

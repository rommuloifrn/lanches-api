package com.romm.comidas.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity @Data
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nome;
    private String numeroDeCelular;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cliente(String nome, String numeroDeCelular) {
        this.nome = nome;
        this.numeroDeCelular = numeroDeCelular;
    }
}

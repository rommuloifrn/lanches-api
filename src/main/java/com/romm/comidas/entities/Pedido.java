package com.romm.comidas.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CurrentTimestamp;

import com.romm.comidas.enums.StatusDoPedido;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity @Data
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private Integer numero;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    @ManyToMany @JoinTable(name = "composicao", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "lanche_id"))
    private List<Lanche> lanches;

    @CurrentTimestamp
    private LocalDateTime horario;

    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    private StatusDoPedido status;

}

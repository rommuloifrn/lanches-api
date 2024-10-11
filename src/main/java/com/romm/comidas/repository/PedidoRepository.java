package com.romm.comidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romm.comidas.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}

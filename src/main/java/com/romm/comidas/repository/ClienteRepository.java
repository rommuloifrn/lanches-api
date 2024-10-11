package com.romm.comidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romm.comidas.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}

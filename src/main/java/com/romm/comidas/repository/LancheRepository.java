package com.romm.comidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romm.comidas.entities.Lanche;

@Repository
public interface LancheRepository extends JpaRepository<Lanche, Long> {
    
}

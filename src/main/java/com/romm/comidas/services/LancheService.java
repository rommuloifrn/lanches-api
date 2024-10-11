package com.romm.comidas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romm.comidas.entities.Lanche;
import com.romm.comidas.repository.LancheRepository;

@Service
public class LancheService {

    @Autowired LancheRepository lr;

    public Lanche create(Lanche l) {
        return lr.save(l);
    }
    
    public List<Lanche> findAll() {
        return lr.findAll();
    }
}

package com.romm.comidas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romm.comidas.DTOs.CadastroDeClienteDTO;
import com.romm.comidas.entities.Cliente;
import com.romm.comidas.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired ClienteRepository cr;

    public void cadastrar(CadastroDeClienteDTO data) {
        Cliente c = new Cliente(data.nome(), data.numeroDeCelular());
        cr.save(c);
    }
}

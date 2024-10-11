package com.romm.comidas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romm.comidas.entities.Pedido;
import com.romm.comidas.enums.StatusDoPedido;
import com.romm.comidas.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired PedidoRepository pr;

    public List<Pedido> findAll() {
        return pr.findAll();
    }

    public Pedido create(Pedido pedido) {
        pedido.setStatus(StatusDoPedido.AGUARDANDO);
        return pr.save(pedido);
    }
}

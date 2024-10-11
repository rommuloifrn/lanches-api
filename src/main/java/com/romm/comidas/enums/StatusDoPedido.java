package com.romm.comidas.enums;

import lombok.Getter;

@Getter
public enum StatusDoPedido {
    AGUARDANDO("Aguardando"),
    EM_PREPARO("Em preparo"),
    ENTREGUE("Entregue");

    private String valor;

    StatusDoPedido(String valor) {
        this.valor = valor;
    }
}

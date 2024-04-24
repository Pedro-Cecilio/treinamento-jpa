package com.dbserver.treinamentoJpa.chavePrimariaComposta1.domain.itemPedido;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItemPedidoId {
    private Long pedidoId;
    private Long produtoId;
    
    // construtor, getters e setters
}

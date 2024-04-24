package com.dbserver.treinamentoJpa.chavePrimariaComposta2.domain.itemPedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItemPedidoId {
    private Long pedidoId;
    private Long produtoId;
    
}

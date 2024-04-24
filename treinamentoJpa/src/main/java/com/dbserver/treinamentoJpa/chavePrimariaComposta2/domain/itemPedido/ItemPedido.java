package com.dbserver.treinamentoJpa.chavePrimariaComposta2.domain.itemPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@IdClass(ItemPedidoId.class)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ItemPedido {
    @Id
    private Long pedidoId;

    @Id
    private Long produtoId;

    private int quantidade;
    
    public ItemPedido(Long pedidoId, Long produtoId, int quantidade) {
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }
}

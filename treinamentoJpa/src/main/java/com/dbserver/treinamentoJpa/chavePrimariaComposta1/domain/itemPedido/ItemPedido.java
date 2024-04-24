package com.dbserver.treinamentoJpa.chavePrimariaComposta1.domain.itemPedido;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ItemPedido {
    @EmbeddedId
    private ItemPedidoId id;
    
    private int quantidade;
    
    public ItemPedido(ItemPedidoId id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }
}

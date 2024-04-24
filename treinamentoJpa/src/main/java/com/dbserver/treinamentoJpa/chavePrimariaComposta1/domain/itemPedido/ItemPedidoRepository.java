package com.dbserver.treinamentoJpa.chavePrimariaComposta1.domain.itemPedido;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends CrudRepository<ItemPedido, ItemPedidoId>{
    
}

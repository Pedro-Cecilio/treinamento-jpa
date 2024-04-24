package com.dbserver.treinamentoJpa.chavePrimariaComposta1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.chavePrimariaComposta1.domain.itemPedido.ItemPedido;
import com.dbserver.treinamentoJpa.chavePrimariaComposta1.domain.itemPedido.ItemPedidoId;
import com.dbserver.treinamentoJpa.chavePrimariaComposta1.domain.itemPedido.ItemPedidoRepository;


@Component
public class ChavePrimariaComposta1CommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ChavePrimariaComposta1CommandLineRunner.class);
    private ItemPedidoRepository itemPedidoRepository;

    public ChavePrimariaComposta1CommandLineRunner(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ItemPedidoId id = new ItemPedidoId(1L, 13L);
        ItemPedido itemPedido = new ItemPedido(id, 3);
        this.itemPedidoRepository.save(itemPedido);
        logger.info("ItemPedido utilizando EmbeddedId foi salvo");
    }

}

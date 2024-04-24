package com.dbserver.treinamentoJpa.chavePrimariaComposta2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.chavePrimariaComposta2.domain.itemPedido.ItemPedido;
import com.dbserver.treinamentoJpa.chavePrimariaComposta2.domain.itemPedido.ItemPedidoRepository;




@Component
public class ChavePrimariaCompostaCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ChavePrimariaCompostaCommandLineRunner.class);
    private ItemPedidoRepository itemPedidoRepository;

    public ChavePrimariaCompostaCommandLineRunner(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ItemPedido itemPedido = new ItemPedido(1L, 15L, 3);
        this.itemPedidoRepository.save(itemPedido);
        logger.info("ItemPedido utilizando idClass foi salvo");
    }

}

package com.dbserver.treinamentoJpa.oneToManyManyToOne;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.endereco.Endereco;
import com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.pessoa.Pessoa;
import com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;


@Component
public class OneToManyManyToOneCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(OneToManyManyToOneCommandLineRunner.class);
    private PessoaRepository pessoaRepository;
    public OneToManyManyToOneCommandLineRunner(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Eduarda", null);
        Endereco endereco = new Endereco("Rua 1", "Bairro 1", pessoa);
        Endereco endereco2 = new Endereco("Rua 2", "Bairro 2", pessoa);
        pessoa.setEnderecos(List.of(endereco, endereco2));
        this.pessoaRepository.save(pessoa);
        logger.info("Eduarda foi salva");
    }

}

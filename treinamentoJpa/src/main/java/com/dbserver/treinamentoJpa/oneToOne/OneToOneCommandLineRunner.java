package com.dbserver.treinamentoJpa.oneToOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.oneToOne.domain.endereco.Endereco;
import com.dbserver.treinamentoJpa.oneToOne.domain.pessoa.Pessoa;
import com.dbserver.treinamentoJpa.oneToOne.domain.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;


@Component
public class OneToOneCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(OneToOneCommandLineRunner.class);
    private PessoaRepository pessoaRepository;
    public OneToOneCommandLineRunner(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Endereco endereco = new Endereco("Rua dos bobos", "São Paulo");
        Pessoa pessoa = new Pessoa("Sandro", endereco);
        this.pessoaRepository.save(pessoa);
        logger.info("Sandro foi salvo.");
    }

}

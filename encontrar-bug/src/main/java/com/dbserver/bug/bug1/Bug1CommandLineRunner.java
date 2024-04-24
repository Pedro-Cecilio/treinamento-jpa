package com.dbserver.bug.bug1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.bug.bug1.domain.endereco.Endereco;
import com.dbserver.bug.bug1.domain.pessoa.Pessoa;
import com.dbserver.bug.bug1.domain.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;


@Component
public class Bug1CommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Bug1CommandLineRunner.class);
    private PessoaRepository pessoaRepository;
    public Bug1CommandLineRunner(PessoaRepository pessoaRepository) {
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

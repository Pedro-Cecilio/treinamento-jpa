package com.dbserver.bug.bug3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.bug.bug3.domain.pessoa.Pessoa;
import com.dbserver.bug.bug3.domain.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;


@Component
public class Bug2CommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Bug2CommandLineRunner.class);
    private PessoaRepository pessoaRepository;
    public Bug2CommandLineRunner(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Sandro");
        this.pessoaRepository.save(pessoa);
        logger.info("Sandro foi salvo.");
    }

}

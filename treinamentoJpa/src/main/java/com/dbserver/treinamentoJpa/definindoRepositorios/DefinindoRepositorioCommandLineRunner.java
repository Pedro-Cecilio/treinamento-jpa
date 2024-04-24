package com.dbserver.treinamentoJpa.definindoRepositorios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.definindoRepositorios.domain.pessoa.Pessoa;
import com.dbserver.treinamentoJpa.definindoRepositorios.domain.pessoa.PessoaRepository;


@Component
public class DefinindoRepositorioCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DefinindoRepositorioCommandLineRunner.class);
    private PessoaRepository pessoaRepository;

    public DefinindoRepositorioCommandLineRunner(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Eduarda", "Maria");
        pessoaRepository.save(pessoa);
        logger.info("Eduarda Maria foi salva.");
    }        


}

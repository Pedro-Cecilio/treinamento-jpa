package com.dbserver.treinamentoJpa.chavePrimariaSimples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.chavePrimariaSimples.domain.pessoa.Pessoa;
import com.dbserver.treinamentoJpa.chavePrimariaSimples.domain.pessoa.PessoaRepository;

@Component
public class ChavePrimariaSimplesCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ChavePrimariaSimplesCommandLineRunner.class);
    private PessoaRepository pessoaRepository;

    public ChavePrimariaSimplesCommandLineRunner(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Eduarda", "Maria");
        pessoaRepository.save(pessoa);
        logger.info("Eduarda Maria foi salva.");
    }

}

package com.dbserver.treinamentoJpa.definindoRepositoriosBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.definindoRepositoriosBase.domain.pessoa.Pessoa;
import com.dbserver.treinamentoJpa.definindoRepositoriosBase.domain.pessoa.PessoaRepository;




@Component
public class DefinindoRepositorioBaseCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DefinindoRepositorioBaseCommandLineRunner.class);
    private PessoaRepository pessoaRepository;

    public DefinindoRepositorioBaseCommandLineRunner(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Dara", "Silva");
        pessoaRepository.save(pessoa);
        logger.info("Dara Silva foi salva.");
    }        


}

package com.dbserver.treinamentoJpa.metodosDeConsulta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Optional;
import com.dbserver.treinamentoJpa.metodosDeConsulta.domain.empregado.Empregado;
import com.dbserver.treinamentoJpa.metodosDeConsulta.domain.empregado.EmpregadoRepository;

@Component
public class MetodosDeConsultaCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MetodosDeConsultaCommandLineRunner.class);
    private EmpregadoRepository empregadoRepository;

    public MetodosDeConsultaCommandLineRunner(EmpregadoRepository empregadoRepository) {
        this.empregadoRepository = empregadoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // ** Utilizando metodo do repository construido a partir do nome do método

        // Salvando
        Empregado empregado = new Empregado("João", "Andrade", "joao@email.com");
        this.empregadoRepository.save(empregado);
        logger.info("João Andrade foi salvo com sucesso!");

        // Buscando o primeiro pelo nome
        Optional<Empregado> empregadoPeloNome = this.empregadoRepository.findFirstByNome("João");
        if (empregadoPeloNome.isPresent())
            logger.info("Encontramos o empregado de nome: {}", empregadoPeloNome.get().getNome());


        // ** Utilizando metodo do repository construido a partir de uma consulta declarada
        Optional<Empregado> empregadoPeloEmail = this.empregadoRepository.buscarEmpregadoPeloEmail("joao@email.com");
        if (empregadoPeloEmail.isPresent())
            logger.info("Encontramos o empregado de nome: {} e email: {}", empregadoPeloEmail.get().getNome(), empregadoPeloEmail.get().getEmail());
    }

}

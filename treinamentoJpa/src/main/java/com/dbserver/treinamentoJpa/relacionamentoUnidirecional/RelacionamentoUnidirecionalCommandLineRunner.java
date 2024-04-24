package com.dbserver.treinamentoJpa.relacionamentoUnidirecional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.relacionamentoUnidirecional.domain.email.Email;
import com.dbserver.treinamentoJpa.relacionamentoUnidirecional.domain.email.EmailRepository;
import com.dbserver.treinamentoJpa.relacionamentoUnidirecional.domain.empregado.Empregado;
import com.dbserver.treinamentoJpa.relacionamentoUnidirecional.domain.empregado.EmpregadoRepository;

import jakarta.transaction.Transactional;


@Component
public class RelacionamentoUnidirecionalCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(RelacionamentoUnidirecionalCommandLineRunner.class);
    private EmpregadoRepository empregadoRepository;
    private EmailRepository emailRepository;
    public RelacionamentoUnidirecionalCommandLineRunner(EmpregadoRepository empregadoRepository, EmailRepository emailRepository) {
        this.empregadoRepository = empregadoRepository;
        this.emailRepository = emailRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Empregado empregado = new Empregado("João");
        this.empregadoRepository.save(empregado);
        logger.info("Empregado João foi salvo com sucesso!");

        Email email = new Email("joao@email.com", empregado);
        this.emailRepository.save(email);
        //O email sabe quem é o empregado a quem ele pertence
        logger.info("O email joao@email.com pertence ao empregado com id: {}", email.getEmpregado().getId());
    }

}

package com.dbserver.treinamentoJpa.relacionamentoBidirecional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.email.Email;
import com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.empregado.Empregado;
import com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.empregado.EmpregadoRepository;

import java.util.List;

@Component
public class RelacionamentoBidirecionalCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(RelacionamentoBidirecionalCommandLineRunner.class);
    private EmpregadoRepository empregadoRepository;

    public RelacionamentoBidirecionalCommandLineRunner(EmpregadoRepository empregadoRepository) {
        this.empregadoRepository = empregadoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Empregado empregado = new Empregado("João", List.of());
        Email email = new Email("joao@email.com", empregado);
        empregado.setEmail(List.of(email));
        this.empregadoRepository.save(empregado);
        logger.info("Empregado João foi salvo com sucesso!");

        //Empregado sabe o email que possui
        logger.info("O email do empregado João possui id: {}", empregado.getEmail().get(0).getId());

        //O email sabe quem é o empregado a quem ele pertence
        logger.info("O email joao@email.com pertence ao empregado com id: {}", email.getEmpregado().getId());
    }

}

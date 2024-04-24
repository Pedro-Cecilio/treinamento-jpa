package com.dbserver.treinamentoJpa.interfaceRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.interfaceRepository.domain.aluno.Aluno;
import com.dbserver.treinamentoJpa.interfaceRepository.domain.aluno.AlunoRepository;
import com.dbserver.treinamentoJpa.interfaceRepository.domain.professor.Professor;
import com.dbserver.treinamentoJpa.interfaceRepository.domain.professor.ProfessorRepository;

@Component
public class RepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(RepositoryCommandLineRunner.class);
    private AlunoRepository alunoRepository;
    private ProfessorRepository professorRepository;

    public RepositoryCommandLineRunner(AlunoRepository alunoRepository, ProfessorRepository professorRepository) {
        this.alunoRepository = alunoRepository;
        this.professorRepository = professorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Utilizando repository que extende Repository

        Aluno aluno = new Aluno("Lucas", "3B");
        this.alunoRepository.save(aluno);
        logger.info("Lucas foi salvo.");
        Aluno alunoEncontrado = this.alunoRepository.findById(aluno.getId());
        logger.info("Encontramos o aluno de nome: {}", alunoEncontrado.getNome());

        //Utilizando repository que está anotado com @RepositoryDefinition
        
        Professor professor = new Professor("Otávio", "Matemática");
        this.professorRepository.save(professor);
        logger.info("Otávio foi salvo.");
        Professor professorEncontrado = this.professorRepository.findById(professor.getId());
        logger.info("Encontramos o professor de nome: {}", professorEncontrado.getNome());
    }        


}

package com.dbserver.treinamentoJpa.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.treinamentoJpa.ManyToMany.domain.aluno.Aluno;
import com.dbserver.treinamentoJpa.ManyToMany.domain.aluno.AlunoRepository;
import com.dbserver.treinamentoJpa.ManyToMany.domain.curso.Curso;
import com.dbserver.treinamentoJpa.ManyToMany.domain.curso.CursoRepository;

import jakarta.transaction.Transactional;

@Component
public class ManyToManyCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ManyToManyCommandLineRunner.class);
    private AlunoRepository alunoRepository;
    private CursoRepository cursoRepository;

    public ManyToManyCommandLineRunner(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }

    @Transactional
    public void run(String... args) throws Exception {
        // Criar e salvar o curso
        Curso curso = new Curso("Programação Orientada a Objeto");
        this.cursoRepository.save(curso);
        logger.info("Curso Programação Orientada a Objeto foi salvo.");

        // Criar e salvar o aluno
        Aluno aluno = new Aluno("Matheus");
        this.alunoRepository.save(aluno);
        logger.info("Aluno Matheus foi salvo.");

        // Associar o aluno ao curso
        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso);
        aluno.setCursos(cursos);

        // Associar o curso ao aluno
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        curso.setAlunos(alunos);

        // Salvar novamente o curso para persistir as associações
        this.cursoRepository.save(curso);
        logger.info("Criando relação entre aluno e curso");
    }

}

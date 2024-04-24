package com.dbserver.treinamentoJpa.ManyToMany.domain.curso;

import java.util.ArrayList;
import java.util.List;

import com.dbserver.treinamentoJpa.ManyToMany.domain.aluno.Aluno;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    @ManyToMany(mappedBy = "cursos", cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome){
        this.nome = nome;
    }
}
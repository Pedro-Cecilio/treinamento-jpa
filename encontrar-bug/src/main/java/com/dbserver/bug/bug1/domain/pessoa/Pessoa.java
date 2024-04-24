package com.dbserver.bug.bug1.domain.pessoa;


import com.dbserver.bug.bug1.domain.endereco.Endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    private Endereco endereco;

    // Getters e Setters
    public Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
}
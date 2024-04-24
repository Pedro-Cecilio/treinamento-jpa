package com.dbserver.bug.bug3.domain.pessoa;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String nome;

    // Getters e Setters
    public Pessoa(String nome){
        this.nome = nome;
    }
}
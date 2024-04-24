package com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.pessoa;

import java.util.List;

import com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.endereco.Endereco;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Pessoa(String nome, List<Endereco> enderecos) {
        this.nome = nome;
        this.enderecos = enderecos;
    }
}
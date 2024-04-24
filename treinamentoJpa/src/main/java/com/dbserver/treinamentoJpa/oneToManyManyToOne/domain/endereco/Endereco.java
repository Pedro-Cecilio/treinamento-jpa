package com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.endereco;

import com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.pessoa.Pessoa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String rua;
    private String cidade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Endereco(String rua, String cidade, Pessoa pessoa){
        this.rua = rua;
        this.cidade = cidade;
        this.pessoa = pessoa;
    }
}

package com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.email;


import com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.empregado.Empregado;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String conteudo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empregado_id")
    private Empregado empregado;

    public Email(String conteudo, Empregado empregado){
        this.conteudo = conteudo;
        this.empregado = empregado;
    }
}

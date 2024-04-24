package com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.empregado;

import java.util.List;
import com.dbserver.treinamentoJpa.relacionamentoBidirecional.domain.email.Email;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empregado", cascade = CascadeType.ALL)
    private List<Email> email;

    public Empregado(String nome, List<Email> email){
        this.nome = nome;
        this.email = email;
    }
}

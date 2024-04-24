package com.dbserver.treinamentoJpa.oneToOne.domain.endereco;

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
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String rua;
    private String cidade;
    
    // Getters e Setters
    public Endereco(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
    }
}

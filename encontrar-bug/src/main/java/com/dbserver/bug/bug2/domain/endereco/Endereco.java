package com.dbserver.bug.bug2.domain.endereco;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Endereco {
    private String rua;
    private String cidade;
    
    // Getters e Setters
    public Endereco(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
    }
}

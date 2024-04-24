package com.dbserver.bug.bug2.domain.pessoa;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
    
    @Query("SELECT p FROM Pessoa p WHERE p.Nome = :nome")
    Optional<Pessoa> buscarPessoaPeloNome(String nome);
}

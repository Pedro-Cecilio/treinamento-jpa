package com.dbserver.treinamentoJpa.oneToManyManyToOne.domain.pessoa;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
    
}

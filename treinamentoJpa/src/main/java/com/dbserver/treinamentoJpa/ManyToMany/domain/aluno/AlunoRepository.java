package com.dbserver.treinamentoJpa.ManyToMany.domain.aluno;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long>{
    
}

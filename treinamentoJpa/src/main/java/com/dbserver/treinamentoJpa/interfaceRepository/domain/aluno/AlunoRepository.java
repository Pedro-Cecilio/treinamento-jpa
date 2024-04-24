package com.dbserver.treinamentoJpa.interfaceRepository.domain.aluno;
import org.springframework.data.repository.Repository;


public interface AlunoRepository extends Repository<Aluno, Long>{
    Aluno findById(Long id);
    Aluno save(Aluno aluno);

}

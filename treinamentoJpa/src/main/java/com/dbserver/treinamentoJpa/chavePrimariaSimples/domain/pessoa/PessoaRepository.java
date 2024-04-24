package com.dbserver.treinamentoJpa.chavePrimariaSimples.domain.pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}

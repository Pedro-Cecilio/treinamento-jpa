package com.dbserver.treinamentoJpa.definindoRepositorios.domain.pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}

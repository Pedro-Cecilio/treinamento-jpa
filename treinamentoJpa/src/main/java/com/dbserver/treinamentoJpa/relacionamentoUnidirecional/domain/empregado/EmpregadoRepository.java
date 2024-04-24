package com.dbserver.treinamentoJpa.relacionamentoUnidirecional.domain.empregado;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoRepository extends CrudRepository<Empregado, Long> {
    
}

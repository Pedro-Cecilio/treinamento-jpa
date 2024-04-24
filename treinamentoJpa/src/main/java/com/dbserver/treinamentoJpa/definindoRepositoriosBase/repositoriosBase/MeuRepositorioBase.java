package com.dbserver.treinamentoJpa.definindoRepositoriosBase.repositoriosBase;

import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface MeuRepositorioBase<T, ID> extends Repository<T, ID> {
    Optional<T> findById(ID id);

    <S extends T> S save(S entity);
}

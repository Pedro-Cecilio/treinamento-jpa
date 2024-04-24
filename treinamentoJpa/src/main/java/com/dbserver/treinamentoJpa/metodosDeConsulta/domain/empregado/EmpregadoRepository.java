package com.dbserver.treinamentoJpa.metodosDeConsulta.domain.empregado;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


public interface EmpregadoRepository extends Repository<Empregado, Long>{


    Empregado save(Empregado empregado);
    Optional<Empregado> findById(Long id);
    Optional<Empregado> findFirstByNome(String nome);
    List<Empregado> findAllBySobrenome(String sobrenome);
    List<Empregado> findAllByNomeAndSobrenome(String nome, String sobrenome);

    Optional<Empregado> findFirstByEmail(String email);

    @Query("SELECT e from Empregado e WHERE e.email = ?1")
    Optional<Empregado> buscarEmpregadoPeloEmail(String email);
    @Query("SELECT e from Empregado e WHERE e.nome = :nome AND e.email = :email")
    Optional<Empregado> buscarEmpregadoPeloNomeEEmail(@Param("nome") String nome, @Param("email") String email);
}

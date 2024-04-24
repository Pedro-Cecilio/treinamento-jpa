package com.dbserver.treinamentoJpa.interfaceRepository.domain.professor;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Professor.class, idClass = Long.class)
public interface ProfessorRepository {
    Professor findById(Long id);
    Professor save(Professor professor);
}

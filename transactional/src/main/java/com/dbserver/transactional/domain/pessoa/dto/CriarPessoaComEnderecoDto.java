package com.dbserver.transactional.domain.pessoa.dto;

import com.dbserver.transactional.domain.dto.CriarEnderecoDto;

public record CriarPessoaComEnderecoDto(
    CriarEnderecoDto enderecoDto,
    String nome
) {
    
}

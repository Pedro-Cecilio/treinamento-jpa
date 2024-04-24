package com.dbserver.transactional.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dbserver.transactional.domain.endereco.Endereco;
import com.dbserver.transactional.domain.pessoa.Pessoa;
import com.dbserver.transactional.domain.pessoa.PessoaService;
import com.dbserver.transactional.domain.pessoa.dto.CriarPessoaComEnderecoDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PessoaController {
    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @PostMapping("/pessoaComEndereco")
    public Pessoa criarPessoaComEndereco(@RequestBody CriarPessoaComEnderecoDto dto) {
        Endereco endereco = new Endereco(dto.enderecoDto().rua(), dto.enderecoDto().bairro(), dto.enderecoDto().cidade());
        Pessoa pessoa = new Pessoa(dto.nome());
        this.pessoaService.criarPessoaComEndereco(pessoa, endereco, true);
        return pessoa;
    }
    
}

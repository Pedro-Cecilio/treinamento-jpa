package com.dbserver.transactional.domain.pessoa;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbserver.transactional.domain.endereco.Endereco;
import com.dbserver.transactional.domain.endereco.EnderecoService;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;
    private EnderecoService enderecoService;
    public PessoaService(PessoaRepository pessoaRepository, EnderecoService enderecoService){
        this.pessoaRepository = pessoaRepository;
        this.enderecoService = enderecoService;
    }

    @Transactional
    public void criarPessoaComEndereco(Pessoa pessoa, Endereco endereco, boolean soltarErro) {
        Pessoa pessoaSalva = pessoaRepository.save(pessoa);
        endereco.setPessoa(pessoaSalva);
        if(soltarErro) throw new IllegalArgumentException("Erro simulado");
        this.enderecoService.salvarEndereco(endereco);
    }

}

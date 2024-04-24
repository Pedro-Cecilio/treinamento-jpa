package com.dbserver.transactional.domain.endereco;



import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    private EnderecoRepository enderecoRepository;
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }
    public Endereco salvarEndereco(Endereco endereco) {
        return this.enderecoRepository.save(endereco);
    }
}

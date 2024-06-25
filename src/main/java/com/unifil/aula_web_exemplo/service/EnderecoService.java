package com.unifil.aula_web_exemplo.service;

import com.unifil.aula_web_exemplo.model.Endereco;
import com.unifil.aula_web_exemplo.repository.EnderecoRepository;
import com.unifil.aula_web_exemplo.service.inter.IEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService implements IEnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;


    @Override
    public void cadastrarEndereco(Endereco endereco) {
        if(endereco == null){
            return;
        }

        enderecoRepository.save(endereco);
    }

    @Override
    public void alterarEndereco(Endereco endereco) {
        if(endereco == null){
            return;
        }

        enderecoRepository.save(endereco);
    }

    @Override
    public void excluirEndereco(Endereco endereco) {
        if(endereco == null){
            return;
        }

        enderecoRepository.delete(endereco);
    }

    @Override
    public List<Endereco> listarEndereco() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco buscarEnderecoPorId(Integer id) {
        if(id == null){
            return null;
        }
        return enderecoRepository.findById(id).get();
    }

    @Override
    public Endereco findByCidade(String cidade) {
        if(cidade == null || cidade.isEmpty()){
            return null;
        }
        return enderecoRepository.findByCidade(cidade);
    }
}

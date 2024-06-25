package com.unifil.aula_web_exemplo.service;

import com.unifil.aula_web_exemplo.model.Pessoa;
import com.unifil.aula_web_exemplo.repository.PessoaRepository;
import com.unifil.aula_web_exemplo.service.inter.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        if(pessoa.getNomePessoa() == null || pessoa.getNomePessoa().isEmpty()){
            return null;
        }

        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa buscarPessoaPorId(int id) {
        if(id <= 0){
            return null;
        }

        return pessoaRepository.getReferenceById(id);
    }

    @Override
    public void excluirPessoa(int id) {
        if(id <= 0){
            return;
        }

        pessoaRepository.deleteById(id);
    }

    @Override
    public void alterarPessoa(Pessoa pessoa) {
        if(pessoa.getIdPessoa() == null){
            return;
        }
        pessoaRepository.save(pessoa);
    }
}

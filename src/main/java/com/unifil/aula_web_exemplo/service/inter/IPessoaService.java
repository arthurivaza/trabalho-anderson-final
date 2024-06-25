package com.unifil.aula_web_exemplo.service.inter;

import com.unifil.aula_web_exemplo.model.Pessoa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPessoaService {

    public Pessoa cadastrarPessoa(Pessoa pessoa);

    public List<Pessoa> listarPessoas();

    public Pessoa buscarPessoaPorId(int id);

    public void excluirPessoa(int id);

    public void alterarPessoa(Pessoa pessoa);

}

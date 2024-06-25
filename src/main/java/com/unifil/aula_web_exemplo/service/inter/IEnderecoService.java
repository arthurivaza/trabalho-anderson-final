package com.unifil.aula_web_exemplo.service.inter;

import com.unifil.aula_web_exemplo.model.Endereco;

import java.util.List;

public interface IEnderecoService {

    public void cadastrarEndereco(Endereco endereco);

    public void alterarEndereco(Endereco endereco);

    public void excluirEndereco(Endereco endereco);

    public List<Endereco> listarEndereco();

    public Endereco buscarEnderecoPorId(Integer id);

    public Endereco findByCidade(String cidade);

}

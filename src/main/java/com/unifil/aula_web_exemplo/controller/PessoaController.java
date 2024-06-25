package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.model.Pessoa;
import com.unifil.aula_web_exemplo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        super();
        this.pessoaService = pessoaService;
    }

    @GetMapping(path = "/listarPessoas")
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    @PostMapping(path = "/cadastrarPessoa")
    public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa) {
        System.out.println(pessoa.getNomePessoa());
        return new ResponseEntity<Pessoa>(pessoaService.cadastrarPessoa(pessoa), HttpStatus.OK);
    }
}

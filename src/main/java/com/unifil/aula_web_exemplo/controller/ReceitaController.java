package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.ReceitaService;
import com.unifil.aula_web_exemplo.model.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaController {
    @Autowired
    private ReceitaService receitaService;

    @PostMapping
    public Receita criarReceita(@RequestBody Receita receita) {
        return receitaService.saveReceita(receita);
    }

    @GetMapping
    public List<Receita> listarReceitas() {
        return receitaService.getAllReceitas();
    }
}


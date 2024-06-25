package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Receita;
import com.unifil.aula_web_exemplo.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    @Autowired
    private ReceitaRepository receitaRepository;

    public Receita saveReceita(Receita receita) {
        return receitaRepository.save(receita);
    }

    public List<Receita> getAllReceitas() {
        return receitaRepository.findAll();
    }
}

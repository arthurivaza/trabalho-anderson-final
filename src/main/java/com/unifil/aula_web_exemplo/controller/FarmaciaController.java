package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.FarmaciaService;
import com.unifil.aula_web_exemplo.model.Farmacia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciaController {
    @Autowired
    private FarmaciaService farmaciaService;

    @PostMapping("/login")
    public Farmacia login(@RequestBody Farmacia farmacia) {
        return farmaciaService.authenticate(farmacia.getCnpj(), farmacia.getSenha());
    }
}


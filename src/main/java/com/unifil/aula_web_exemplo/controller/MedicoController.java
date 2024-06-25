package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.MedicoService;
import com.unifil.aula_web_exemplo.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @PostMapping("/login")
    public Medico login(@RequestBody Medico medico) {
        return medicoService.authenticate(medico.getUsuario(), medico.getSenha());
    }
}

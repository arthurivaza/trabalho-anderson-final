package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Medico;
import com.unifil.aula_web_exemplo.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public Medico authenticate(String usuario, String senha) {
        Medico medico = medicoRepository.findByUsuario(usuario);
        if (medico != null && medico.getSenha().equals(senha)) {
            return medico;
        }
        return null;
    }
}

package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Farmacia;
import com.unifil.aula_web_exemplo.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmaciaService {
    @Autowired
    private FarmaciaRepository farmaciaRepository;

    public Farmacia authenticate(String cnpj, String senha) {
        Farmacia farmacia = farmaciaRepository.findByCnpj(cnpj);
        if (farmacia != null && farmacia.getSenha().equals(senha)) {
            return farmacia;
        }
        return null;
    }
}

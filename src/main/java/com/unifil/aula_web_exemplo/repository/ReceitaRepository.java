package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}

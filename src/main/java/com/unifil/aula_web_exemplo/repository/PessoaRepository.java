package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    @Query("SELECT p FROM Pessoa p " +
            "WHERE p.endereco.idEndereco = :idEndereco")
    public List<Pessoa> findByEndereco(@Param("idEndereco") Integer idEndereco);

}

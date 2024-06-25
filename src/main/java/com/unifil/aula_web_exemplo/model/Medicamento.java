package com.unifil.aula_web_exemplo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    public Receita receita;

    private String nome;
    private String dosagem;
    private int quantidade;
    private String viaAdministracao;
    private String observacoes;
}


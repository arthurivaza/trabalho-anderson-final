package com.unifil.aula_web_exemplo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    private String assinaturaDigital;

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private List<Medicamento> medicamentos;

    private Date dataEnvio;
}

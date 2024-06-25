package com.unifil.aula_web_exemplo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "PESSOA")
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;

    @Column(name = "NOME_PESSOA")
    private String nomePessoa;

    @Column(name = "IDADE_PESSOA")
    private int idadePessoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_endereco", nullable = true)
    private Endereco endereco;

    /**
     * @ManyToMany
     * @JoinTable(
     *     name = "pessoa_endereco"
     *     joinColumns = @JoinColumn(name = "id_endereco")
     *     inverseJoinColumns = @JoinColumn(name = "id_pessoa")
     * )
     * List<Endereco> enderecos;
     */

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idadePessoa == pessoa.idadePessoa && Objects.equals(idPessoa, pessoa.idPessoa) && Objects.equals(nomePessoa, pessoa.nomePessoa) && Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPessoa, nomePessoa, idadePessoa, endereco);
    }
}

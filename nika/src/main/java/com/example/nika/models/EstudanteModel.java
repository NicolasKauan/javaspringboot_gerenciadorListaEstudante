package com.example.nika.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {

    @Id //Criar a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "E-mail")
    private String email;
    @Column(name = "Idade")
    private Integer idade;

    public EstudanteModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

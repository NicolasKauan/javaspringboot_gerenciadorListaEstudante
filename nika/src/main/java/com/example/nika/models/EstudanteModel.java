package com.example.nika.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {

    @Id //Criar a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
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

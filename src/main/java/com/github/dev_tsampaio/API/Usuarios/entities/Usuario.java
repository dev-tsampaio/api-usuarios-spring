package com.github.dev_tsampaio.API.Usuarios.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor // Construtor CHEIO
@NoArgsConstructor // Construtor vazio
@Data // Getters e Setters
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco de dados vai gerar automaticamente o ID;
    private Long id;

    private String name;
    private String email;

}

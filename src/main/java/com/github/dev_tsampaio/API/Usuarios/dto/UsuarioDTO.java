package com.github.dev_tsampaio.API.Usuarios.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor // Construtor CHEIO
@NoArgsConstructor // Construtor vazio
@Data // Getters e Setters
public class UsuarioDTO {


    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 50)
    private String name;


    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

}

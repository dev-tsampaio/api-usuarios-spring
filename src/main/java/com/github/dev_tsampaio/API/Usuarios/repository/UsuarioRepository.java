package com.github.dev_tsampaio.API.Usuarios.repository;

import com.github.dev_tsampaio.API.Usuarios.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario,Long> {
}

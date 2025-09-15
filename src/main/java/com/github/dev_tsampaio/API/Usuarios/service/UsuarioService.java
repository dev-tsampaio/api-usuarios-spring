package com.github.dev_tsampaio.API.Usuarios.service;

import com.github.dev_tsampaio.API.Usuarios.dto.UsuarioDTO;
import com.github.dev_tsampaio.API.Usuarios.entities.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private ModelMapper modelMapper;

    public UsuarioDTO convertToDto(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioDTO.class);
    }
    public Usuario convertToEntity(UsuarioDTO usuarioDTO) {
        return modelMapper.map(usuarioDTO, Usuario.class);
    }
}

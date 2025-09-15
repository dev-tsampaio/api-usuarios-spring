package com.github.dev_tsampaio.API.Usuarios.controller;


import com.github.dev_tsampaio.API.Usuarios.entities.Usuario;
import com.github.dev_tsampaio.API.Usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> list() {
        return repository.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        return repository.findById(id).map(usuario -> {
                    usuario.setName(usuarioAtualizado.getName());
                    usuario.setEmail(usuarioAtualizado.getEmail());
                    repository.save(usuario);
                    return ResponseEntity.ok(usuario);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public Usuario getForId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteForId(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

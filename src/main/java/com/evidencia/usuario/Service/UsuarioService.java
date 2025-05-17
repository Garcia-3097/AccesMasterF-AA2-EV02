package com.evidencia.usuario.Service;

import com.evidencia.usuario.Model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> login(String correo, String contrasena);

    List<Usuario> obtenerTodos();
}

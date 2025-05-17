package com.evidencia.usuario.Service;

import com.evidencia.usuario.Model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    // Definición del servicio para manejar usuarios

    Optional<Usuario> login(String correo, String contrasena); // Lógica para login

    List<Usuario> obtenerTodos(); // Obtener todos los usuarios
}

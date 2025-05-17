package com.evidencia.usuario.Service;

import com.evidencia.usuario.Model.Usuario;
import com.evidencia.usuario.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements  UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> login(String correo, String contrasena){
        Optional<Usuario> user = usuarioRepository.findByCorreo(correo);
        return user.filter(u ->u.getContrasena().equals(contrasena));
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }
}

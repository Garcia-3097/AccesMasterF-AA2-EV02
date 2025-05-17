package com.evidencia.usuario.Service;

import com.evidencia.usuario.Model.Usuario;
import com.evidencia.usuario.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marca esta clase como un componente de servicio para inyección automática
public class UsuarioServiceImpl implements  UsuarioService{

    private final UsuarioRepository usuarioRepository;

    // Inyección de dependencia vía constructor, que es la mejor práctica
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> login(String correo, String contrasena){
        // Busca usuario por correo
        Optional<Usuario> user = usuarioRepository.findByCorreo(correo);
        // Si existe el usuario, verifica que la contraseña coincida (sin hashing, cuidado)
        return user.filter(u ->u.getContrasena().equals(contrasena));
    }

    @Override
    public List<Usuario> obtenerTodos() {
        // Devuelve todos los usuarios en la BD
        return usuarioRepository.findAll();
    }
}

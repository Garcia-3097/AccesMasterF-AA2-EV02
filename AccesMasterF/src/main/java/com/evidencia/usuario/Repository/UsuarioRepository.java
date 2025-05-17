package com.evidencia.usuario.Repository;

import com.evidencia.usuario.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // JpaRepository ya tiene métodos CRUD básicos (save, findAll, delete, etc.)

    Optional<Usuario> findByCorreo(String correo);
    /* Método personalizado que JPA genera automáticamente para buscar por correo*/
}

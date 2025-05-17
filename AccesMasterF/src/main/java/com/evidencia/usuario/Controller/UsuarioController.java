package com.evidencia.usuario.Controller;

import com.evidencia.usuario.Dto.LoginRequest;
import com.evidencia.usuario.Model.Usuario;
import com.evidencia.usuario.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //Indica que esta clase es un controlador REST, maneja peticiones HTTP y responde con JSON u otros formatos
@RequestMapping("/api/usuarios") //Todas las rutas dentro de este controlador empiezan con /api/usuarios
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired //Inyección automática del servicio de usuario (inyección de dependencia)
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login") // Ruta POST para el login, recibe datos en el cuerpo (body)
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){

        // Se busca usuario por correo y se verifica contraseña (lógica en el service)
        Optional<Usuario> user = usuarioService.login(loginRequest.getCorreo(), loginRequest.getContrasena());
        if (user.isPresent()) {

            // Respuesta 200 OK con mensaje si login correcto
            return ResponseEntity.ok("Inicio de sesión exitoso");
        } else {

            // Respuesta 401 Unauthorized si falla el login
            return ResponseEntity.status(401).body("Credenciales incorrectas");
        }
    }

    @GetMapping // Ruta GET para obtener la lista de todos los usuarios
    public ResponseEntity<List<Usuario>> obtenerTodosLosUsuarios() {
        List<Usuario> usuarios = usuarioService.obtenerTodos();

        // Respuesta 200 OK con lista de usuarios en JSON
        return ResponseEntity.ok(usuarios);
    }
}

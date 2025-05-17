package com.evidencia.usuario.Model;

import jakarta.persistence.*;
import lombok.Data;


@Data // Lombok genera automáticamente getters, setters, toString, equals, hashCode
@Entity // Marca esta clase como entidad que se mapeará a una tabla de la base de datos
@Table(name = "usuarios") // Indica que la tabla en la BD se llama 'usuarios'
public class Usuario {
    @Id // Esta propiedad es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera automáticamente en la BD (auto-incremental)
    private  Long id; // Nota: por convención, mejor 'id' con minúscula para evitar problemas

    // Esta columna no puede ser null y debe ser única (correo)
    @Column(nullable = false, unique = true)
    private String correo;

    // No puede ser null
    @Column(nullable = false)
    private String contrasena;
}

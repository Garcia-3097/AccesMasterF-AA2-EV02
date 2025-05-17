package com.evidencia.usuario.Dto;

public class LoginRequest {

    // DTO para recibir datos del login, con getters y setters para serialización/deserialización JSON
    private String correo;
    private String contrasena;

    public LoginRequest() {} // // Constructor vacío obligatorio para que Spring pueda crear la instancia

    // Getters y setters necesarios para acceso a los campos en la serialización JSON
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}


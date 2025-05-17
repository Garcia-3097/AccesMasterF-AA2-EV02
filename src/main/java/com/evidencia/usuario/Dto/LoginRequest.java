package com.evidencia.usuario.Dto;

public class LoginRequest {
    private String correo;
    private String contrasena;

    public LoginRequest() {} // Constructor vacío obligatorio

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


package com.mycompany.miguru;

public class Usuario {

    private int id_usuario;
    private String nombre;
    private String apellido;
    private int rol;
    private int departamento;
    private String email;
    private String contrasena;

    public Usuario() {

    }

    private void crearUsuario(int id_usuario, String nombre, String apellido, int rol, int departamento, String email, String contrasena) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.departamento = departamento;
        this.email = email;
        this.contrasena = contrasena;
    }

    private void eliminarUsuario() {

    }

    private int getId_usuario() {
        return id_usuario;
    }

    private void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private int getRol() {
        return rol;
    }

    private void setRol(int rol) {
        this.rol = rol;
    }

    private int getDepartamento() {
        return departamento;
    }

    private void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getContrasena() {
        return contrasena;
    }

    private void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}

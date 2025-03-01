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
        int id_usuario=0;
        String nombre=""; 
        String apellido=""; 
        int rol=0;
        int departamento=0; 
        String email=""; 
        String contrasena="0";
    }
    
    

    public  void crearUsuario() {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.departamento = departamento;
        this.email = email;
        this.contrasena = contrasena;
    }

    public void eliminarUsuario() {

    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}

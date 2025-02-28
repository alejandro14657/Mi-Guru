package com.mycompany.miguru;

public class Curso {

    private int id_Curso;
    private String nombre;
    private String descripcion;
    private String duracion;
    private String fecha_inicio;
    private String fecha_fin;

    public Curso() {

    }

    private void crearCurso(int id_Curso, String nombre, String descripcion, String duracion, String fecha_inicio, String fecha_fin) {
        this.id_Curso = id_Curso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    private void eliminarCurso() {

    }

    private int getId_Curso() {
        return id_Curso;
    }

    private void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private String getDuracion() {
        return duracion;
    }

    private void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    private String getFecha_inicio() {
        return fecha_inicio;
    }

    private void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    private String getFecha_fin() {
        return fecha_fin;
    }

    private void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

}

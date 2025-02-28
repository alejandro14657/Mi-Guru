package com.mycompany.miguru;

public class Tarea {
    private int numeroTarea;
    private String nombre;
    private String descripion;
    private int id_usuarioAsignado;
    private boolean finalizada;

    public Tarea(){
        
    }

    private void crearTarea(int numeroTarea, String nombre, String descripion, int id_usuarioAsignado, boolean finalizada) {
        this.numeroTarea = numeroTarea;
        this.nombre = nombre;
        this.descripion = descripion;
        this.id_usuarioAsignado = id_usuarioAsignado;
        this.finalizada = finalizada;
    }
    
    private void eliminarTarea(){
        
    }
    
    private int getNumeroTarea() {
        return numeroTarea;
    }

    private void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDescripion() {
        return descripion;
    }

    private void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    private int getId_usuarioAsignado() {
        return id_usuarioAsignado;
    }

    private void setId_usuarioAsignado(int id_usuarioAsignado) {
        this.id_usuarioAsignado = id_usuarioAsignado;
    }

    private boolean isFinalizada() {
        return finalizada;
    }

    private void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    
            
}

package com.mycompany.miguru;

public class Tarea {
    private int numeroTarea;
    private String nombre;
    private String descripion;
    private int id_usuarioAsignado;
    private boolean finalizada;

    public Tarea(){
        
    }

    public void crearTarea(int numeroTarea, String nombre, String descripion, int id_usuarioAsignado, boolean finalizada) {
        this.numeroTarea = numeroTarea;
        this.nombre = nombre;
        this.descripion = descripion;
        this.id_usuarioAsignado = id_usuarioAsignado;
        this.finalizada = finalizada;
    }
    
    public void eliminarTarea(){
        
    }
    
    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public int getId_usuarioAsignado() {
        return id_usuarioAsignado;
    }

    public void setId_usuarioAsignado(int id_usuarioAsignado) {
        this.id_usuarioAsignado = id_usuarioAsignado;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    
            
}

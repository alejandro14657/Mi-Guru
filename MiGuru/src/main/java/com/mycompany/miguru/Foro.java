package com.mycompany.miguru;

public class Foro {

    private String nombreUsuario;
    private int id_del_curso;

    public Foro() {
    }

    
    private void chat() {
        System.out.println("Curso 2:" + id_del_curso);
        System.out.println(nombreUsuario + "platicas");
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getId_del_curso() {
        return id_del_curso;
    }

    public void setId_del_curso(int id_del_curso) {
        this.id_del_curso = id_del_curso;
    }

}

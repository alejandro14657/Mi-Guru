package com.mycompany.miguru;

public class Reporte {

    private int id_Reporte;
    private int id_Usuario;
    private int id_Curso;
    private float progreso;
    private String fecha_Reporte;

    public Reporte(int id_Reporte, int id_Usuario, int id_Curso, float progreso, String fecha_Reporte) {
        this.id_Reporte = id_Reporte;
        this.id_Usuario = id_Usuario;
        this.id_Curso = id_Curso;
        this.progreso = progreso;
        this.fecha_Reporte = fecha_Reporte;
    }
    
    private int getId_Reporte() {
        return id_Reporte;
    }

    private void setId_Reporte(int id_Reporte) {
        this.id_Reporte = id_Reporte;
    }

    private int getId_Usuario() {
        return id_Usuario;
    }

    private void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    private int getId_Curso() {
        return id_Curso;
    }

    private void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    private float getProgreso() {
        return progreso;
    }

    private void setProgreso(float progreso) {
        this.progreso = progreso;
    }

    private String getFecha_Reporte() {
        return fecha_Reporte;
    }

    private void setFecha_Reporte(String fecha_Reporte) {
        this.fecha_Reporte = fecha_Reporte;
    }

    
    
}

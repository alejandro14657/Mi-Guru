package com.mycompany.miguru;

public class Reporte {

    private int id_Reporte;
    private int id_Usuario;
    private int id_Curso;
    private float progreso;
    private String fecha_Reporte;

    public Reporte(){
        
    }
    
    public void crearReporte(int id_Reporte, int id_Usuario, int id_Curso, float progreso, String fecha_Reporte) {
        this.id_Reporte = id_Reporte;
        this.id_Usuario = id_Usuario;
        this.id_Curso = id_Curso;
        this.progreso = progreso;
        this.fecha_Reporte = fecha_Reporte;
    
    }
    
    public int getId_Reporte() {
        return id_Reporte;
    }

    public void setId_Reporte(int id_Reporte) {
        this.id_Reporte = id_Reporte;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getId_Curso() {
        return id_Curso;
    }

    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public float getProgreso() {
        return progreso;
    }

    public void setProgreso(float progreso) {
        this.progreso = progreso;
    }

    public String getFecha_Reporte() {
        return fecha_Reporte;
    }

    public void setFecha_Reporte(String fecha_Reporte) {
        this.fecha_Reporte = fecha_Reporte;
    }

    
    
}

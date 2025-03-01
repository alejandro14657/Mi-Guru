package com.mycompany.miguru;

import java.util.Scanner;

public class Sistema {

    private Usuario usuario;
    private Reporte reporte;
    private Curso curso;
    private Autentificacion autentificacion;
    private BaseDeDatos baseDeDatos;
    private Tarea tarea;

    public Sistema() {
        this.usuario = new Usuario();
        this.reporte = new Reporte();
        this.curso = curso;
        this.autentificacion = autentificacion;
        this.baseDeDatos = baseDeDatos;
        this.tarea = tarea;
    }

    public void inicioDelSistema() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistema de capacitacion Mi Guru ");
        System.out.println(""
                + "1-Ingresar cuenta"
                + "2-Crear cuenta");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                int id_usuario;
                usuario.crearUsuario();
                break;
            case 2:

                break;
            default:
                throw new AssertionError();
        }

         Autentificacion ();
    }

    public void Usuario() {

    }

    public void Autentificacion() {

    }

    public void Cursos() {

    }

    public void Tareas() {

    }

    public void Reportes() {

    }

    public void BaseDeDatos() {

    }

}

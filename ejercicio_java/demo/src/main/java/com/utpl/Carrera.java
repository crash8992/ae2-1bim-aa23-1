package com.utpl;

/**
 * Hello world!
 *
 */
public class Carrera {

private String facultad;
private String nombreCarrera;
private int numProfesor;
private int numAlumnos;

    public Carrera() {
}


    public Carrera(String facultad, String nombreCarrera, int numProfesor, int numAlumnos) {
        this.facultad = facultad;
        this.nombreCarrera = nombreCarrera;
        this.numProfesor = numProfesor;
        this.numAlumnos = numAlumnos;
    }


    public String getFacultad() {
        return facultad;
    }


    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }


    public String getNombreCarrera() {
        return nombreCarrera;
    }


    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }


    public int getNumProfesor() {
        return numProfesor;
    }


    public void setNumProfesor(int numProfesor) {
        this.numProfesor = numProfesor;
    }


    public int getNumAlumnos() {
        return numAlumnos;
    }


    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public void parametrosCarrera(){
        System.out.println("datos Carrera: " + " + Nombre Facultad" + this.getFacultad() + "+ Nombre Carrea" + this.getNombreCarrera() + " + número profesores" + this.getNumProfesor() + "+ número alumnos" + this.getNumAlumnos());
    }

    

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

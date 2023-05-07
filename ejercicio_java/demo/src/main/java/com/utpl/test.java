package com.utpl;

import java.util.ArrayList;
import java.util.Scanner;

public class test extends Carrera {

    public static void main( String[] args )
    {
        
        ArrayList<Carrera> coleccionCarrera = new ArrayList<>();
        Carrera Carrera = new Carrera("Artes", "Artes plasticas", 25, 150);
        Carrera Carrera2 = new Carrera("Ciencias Administrativas", "Administración Pública", 27, 215);
        Carrera Carrera3 = new Carrera("Ciencias exáctas", "Lienciatura en Física aplicada", 16, 73);
        Carrera Carrera4 = new Carrera("Tecnológico UTPL", "Transformación Dígital de empresas", 19, 47);

        coleccionCarrera.add(1, Carrera);
        coleccionCarrera.add(2, Carrera2);
        coleccionCarrera.add(3, Carrera3);
        coleccionCarrera.add(4, Carrera4);

        for (int i = 0; i < coleccionCarrera.size(); i++) {

            Carrera carrera = coleccionCarrera.get(i);
            Carrera.parametrosCarrera();

            
        }

        int opciones = 0;
        while (opciones != 5) {
            System.out.println("1: MENU");
            System.out.println("2: MOSTRAR TODAS LAS CARRERAS");
            System.out.println("3: MOSTRAR TODAS LAS FACULTADES");
            System.out.println("4: MOSTRAR TODOS LOS DATOS");
            System.out.println("5: SALIDA");

            Scanner scan = new Scanner(System.in);
            opciones = scan.nextInt();

            if (opciones == 1) {
                System.out.println("Menu");
                
            }

            if (opciones == 2) {
                System.out.println("Mostrar Carreras");
                for (int i = 0; i < coleccionCarrera.size(); i++) {
                Carrera carrea = coleccionCarrera.get(i);
                carrea.getNombreCarrera();
                    
                }
            }
            
            if (opciones == 3) {
                System.out.println("Mostrar Facultades");
                for (int i = 0; i < coleccionCarrera.size(); i++) {
                Carrera facultades = coleccionCarrera.get(i);
                facultades.getFacultad();

                }
                
            }

            if (opciones == 4) {
                System.out.println("mostrar info");
                for (int i = 0; i < coleccionCarrera.size(); i++) {
                Carrera informacion = coleccionCarrera.get(i);
                informacion.parametrosCarrera();
                

                }
                
            }

            if (opciones ==5) {
                System.out.println("SALIDA");
                
            }
              
        }



    }
    
}

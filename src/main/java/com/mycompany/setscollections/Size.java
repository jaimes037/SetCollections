/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.setscollections;

import java.util.HashSet;

/**
 *
 * @author jaime
 */
public class Size {

    public static void main(String[] args) {
        //Creando estudiantes de programación 2 de la UPB
        Estudiante persona1 = new Estudiante("Kevin");
        Estudiante persona2 = new Estudiante("Angie");
        Estudiante persona3 = new Estudiante("Andrés");
        Estudiante persona4 = new Estudiante("Juan Pablo");
        Estudiante persona5 = new Estudiante("Natalia");
        Estudiante persona6 = new Estudiante("Julian");
        Estudiante persona7 = new Estudiante("Daniel");
        Estudiante persona8 = new Estudiante("Gleysson");

        //Creando un listado de curso (HashSet)
        HashSet listadodecurso = new HashSet();
        //Añadiendo elementos(Estudiantes) al listado de curso(HashSet)
        listadodecurso.add(persona1);
        listadodecurso.add(persona2);
        listadodecurso.add(persona3);
        listadodecurso.add(persona4);
        listadodecurso.add(persona5);
        listadodecurso.add(persona6);
        listadodecurso.add(persona7);
        listadodecurso.add(persona8);

        //Obteniendo la cantidad de elementos almacenados
        int totalpersonas = listadodecurso.size();
        //Print
        System.out.printf("Hay %s personas en el curso \n", totalpersonas);

    }
}

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
public class isEmpty {

    public static void main(String[] args) {

        //Creando un listado de curso (HashSet)
        HashSet listadodecurso = new HashSet();
        //Comprobando si está vacío
        if (listadodecurso.isEmpty()) {
            System.out.println("No hay estudiantes registrados en el listado de curso");
        } else {
            System.out.printf("Hay %s estudiantes registrados en el listado de curso", listadodecurso.size());
        }

    }
}

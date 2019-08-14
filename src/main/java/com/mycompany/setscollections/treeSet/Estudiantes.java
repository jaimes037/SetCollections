/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.setscollections.treeSet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author NCBC
 */
public class Estudiantes implements Comparable<Estudiantes>{
    public String nombre;
    public int edad;


    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    @Override
    public String toString() {
        return ("Nombre: "+nombre+"  Edad: "+edad);
    }


    @Override
    public int compareTo(Estudiantes o) {
        return nombre.compareTo(o.nombre);
    }
     
}

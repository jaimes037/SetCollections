/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.setscollections.treeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author NCBC
 */
public class Duplicability_and_Size {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {

        Estudiantes estudiante1 = new Estudiantes("Andres    ", 19);
        Estudiantes estudiante2 = new Estudiantes("Angie     ", 18);
        Estudiantes estudiante3 = new Estudiantes("Daniel    ", 22);
        Estudiantes estudiante4 = new Estudiantes("Gleysson  ", 20);
        Estudiantes estudiante5 = new Estudiantes("Juan      ", 19);
        Estudiantes estudiante6 = new Estudiantes("Julian    ", 19);
        Estudiantes estudiante7 = new Estudiantes("Kevin     ", 21);
        Estudiantes estudiante8 = new Estudiantes("Natalia   ", 18);
        
                


        //Creando un listado de curso (TreeSet)
        Set<Estudiantes> listadodeestecurso = new TreeSet<>();
        //Añadiendo elementos(Estudiantes, edad) al listado de curso(TreeSet)
        listadodeestecurso.add(estudiante1);
        listadodeestecurso.add(estudiante2);
        listadodeestecurso.add(estudiante3);
        listadodeestecurso.add(estudiante4);
        listadodeestecurso.add(estudiante5);
        listadodeestecurso.add(estudiante6);
        listadodeestecurso.add(estudiante7);
        listadodeestecurso.add(estudiante8);
        
        
        //Creando un iterador e imprimiendo elementos del treeSet
        Iterator iteradora = listadodeestecurso.iterator();
        System.out.println("Las personas registradas en el listado  de curso, con su respectiva edad son: ");
        while(iteradora.hasNext()) {
            System.out.println(iteradora.next().toString());         
        }
        
        //Imprimiendo tamaño del curso (por medio del metodo .size())
        int tamanodecurso = listadodeestecurso.size(); 
        System.out.printf("Total de personas en el curso:  %s \n", tamanodecurso);
        
        //Añadiendo duplicado 
        listadodeestecurso.add(estudiante1);
        listadodeestecurso.add(estudiante2);

        
        //Obteniendo la cantidad de elementos almacenados despues del borrado
        System.out.printf("Después de intentar añadir duplicados, hay %s personas en el curso \n", listadodeestecurso.size());
    }
        
        
}

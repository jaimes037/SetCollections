/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author informatica
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
        return (nombre+" "+edad);
    }


    @Override
    public int compareTo(Estudiantes o) {
        return nombre.compareTo(o.nombre);
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author informatica
 */
public class Ceiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando un listado de edades (TreeSet)   
        TreeSet<Integer> listado = new TreeSet<Integer>();
        listado.add(22);
        listado.add(15);
        listado.add(23);
        listado.add(25);
        listado.add(19);
        listado.add(17);
        listado.add(26);
        listado.add(18);
    
        System.out.println("Listado :"+ listado);
        Integer Revision = listado.ceiling(18);
        System.out.println("La edad del último estudiante del listado es: "+ Revision);
        Revision = listado.ceiling(26);
        System.out.println("La edad del estudiante mayor del curso es: "+ Revision);
    }
    
}

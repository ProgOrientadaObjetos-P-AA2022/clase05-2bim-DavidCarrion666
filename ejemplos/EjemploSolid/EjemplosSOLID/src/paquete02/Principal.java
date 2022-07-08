/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("David Carrion", 19);
        Persona p2 = new Persona("Jose Ruiz", 20);
        Persona p3 = new Persona("Pablo Costa", 29);
            
        ArrayList<Persona> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
                        
        OperacionesEstudiantes oe = new OperacionesEstudiantes();
        oe.establecerEstudiante(lista);
        oe.establecerPromedioEdades();
        
        System.out.println(oe);
    }
}

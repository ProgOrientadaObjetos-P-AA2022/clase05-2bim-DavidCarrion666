/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    
    public String toString(){
        String cadena = 
                "---------------------------------------------------------\n"
                + "Listado De Estudiantes:";
        
       for(Persona e: obtenerEstudiante()){
            cadena = String.format("%s\n\tNombre Del Estudiante: %s",
                    cadena,
                    e.obtenerNombre());
        }
        
        cadena = String.format("%s\n"
                + "---------------------------------------------------------\n"
        + "Promedio De Estudiantes: %.2f",
                cadena,
                promedioEdades);
        
    
        return cadena;
    
    
    }
    
}

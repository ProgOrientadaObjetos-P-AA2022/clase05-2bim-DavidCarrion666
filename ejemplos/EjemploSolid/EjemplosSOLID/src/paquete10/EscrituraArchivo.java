/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class EscrituraArchivo {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registroPeliculas;
    private ArrayList<GeneradorPeliculas> listaPeliculas;

    public EscrituraArchivo(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCasas();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaCasas().size() > 0) {
                for (int i = 0; i < obtenerListaCasas().size(); i++) {
                    establecerRegistroCasa(obtenerListaCasas().get(i));
                    establecerSalidaCasa();
                }
            }
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroCasa(GeneradorPeliculas c) {
        registroPeliculas = c;
    }

    public void establecerSalidaCasa() {
        
        try {
            salida.writeObject(registroPeliculas);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaCasas() {
        LecturaArchivo l = new LecturaArchivo(obtenerNombreArchivo());
        l.establecerListaPeliculas();
        listaPeliculas = l.obtenerListaPeliculas();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerListaCasas() {
        return listaPeliculas;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia {
     private String lineaMetros;
    private double tarifa;
    
    public void establecerLineaMetros(String n){
        lineaMetros = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.70 + 1.50;
    }
    
    public String obtenerLineaMetros(){
        return lineaMetros;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}

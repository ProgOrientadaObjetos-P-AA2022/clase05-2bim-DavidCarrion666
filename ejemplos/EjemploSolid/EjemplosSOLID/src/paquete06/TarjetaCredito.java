/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class TarjetaCredito {

    private String nombre;
    private String codigo;
    private double cupoMaximo;

    public TarjetaCredito(String n, String x, double c) {
        nombre = n;
        codigo = x;
        cupoMaximo = c;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(String c) {
        codigo = c;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

    public void establecerCupoMaximo(double c) {
        cupoMaximo = c;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - Codigo: %s - Cupo Maximo: %.2f", 
                nombre, 
                codigo,
                cupoMaximo);
        return cadena;

    }
}

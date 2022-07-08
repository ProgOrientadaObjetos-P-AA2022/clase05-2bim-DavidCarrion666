/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
class TransporteTransvia extends Transporte{

    private String lineaMetros;

    public void establecerLineaMetros(String n) {
        lineaMetros = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.70 + 1.50;
    }

    public String obtenerLineaMetros() {
        return lineaMetros;
    }

}

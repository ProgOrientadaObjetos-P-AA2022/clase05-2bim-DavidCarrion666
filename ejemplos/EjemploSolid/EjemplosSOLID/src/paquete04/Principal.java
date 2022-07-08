/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

// cambios - 8 - Julio - 2022

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();

        TiposTransporte tipos = new TiposTransporte();
        
        
        TransporteTransvia via = new TransporteTransvia();
        via.establecerLineaMetros("Maipu");
        via.establecerTarifa();
             
        
        ArrayList<Transporte> transportes = new ArrayList();
        transportes.add(bus);
        transportes.add(taxi);
        transportes.add(via);
        
        tipos.establecerTransportes(transportes);      
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n",
                tipos.obtenerPromedioTarifas());

        
    }
}

/*
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete09;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        // --------------------------------------------------------------------
        
        APINetflix api2 = new APINetflix();
        api2.establecerApiKey("Pelicula De Terror/");
        
        gp.establecerLlave(api2);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
    }
}

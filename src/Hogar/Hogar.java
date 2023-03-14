/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda v = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        imprimirVivienda(v);
    }

    private static void imprimirVivienda(Vivienda v) {
        System.out.println("Precio: " + v.getPrecio());
        System.out.println("Número de habitaciones: "+ v.getNumHabitaciones());
        System.out.println("Superficie en m2: " + v.getSuperficie());
        System.out.println("¿Dispone de parking?: " + v.isParking());
        System.out.println("Estado: "+ v.getEstado());
        System.out.println("Propietario: "+ v.getPropietario());
    }
    
}

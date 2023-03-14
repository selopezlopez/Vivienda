/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author selopez 
 */
public class Vivienda {

   /**Clase principal vivienda con los parametros:
   @param precio de tipo double
   @param numHabitaciones de tipo int
   @param superficie de tipo double
   @param parking de tipo boolena
   @param estado de tipo String
   @param propietario de tipo String
   */
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
  /**Constructor principal de vivienda Crea vivienda con los siguientes parametros:
   @param precio
   @param numHabitaciones
   @param superficie
   @param parking
   @param estado
   @param propietario*/
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /** Constructor vivienda con parametro de entrada: precio
     * @param precio*/
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
      /**Metodo de clase que actualiza precio por un parametro de entrada: descuento
        @param descuento*/
    
    public void actualizarPrecio(int descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
     /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }
    
     /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
}


package actividadT09.seguros;

import actividadT09.vehiculos.IAlquilable;

/**
 *
 * @author Alejandro Padulles Gonzalez
 */
public class Seguro implements IAlquilable{

    
    private String nombre_seguro;
    private String descripcion;
    private double precio_alquiler_dia;
    private int numero_dias_alquilado;
    private final double precio_seguro_dia;
    
   
    public Seguro (String nombre_seguro, String descripcion,
            double precio_alquiler_dia, int numero_dias_alquilado){
        
       
    this.nombre_seguro = nombre_seguro;
    this.descripcion = descripcion ;
    this.numero_dias_alquilado = setNumeroDias(numero_dias_alquilado);
    this.precio_seguro_dia = 10.50;
    
        
    }

   
    
    
    
    @Override
  public int setNumeroDias(int numero_dias_alquilado){
      
    this.numero_dias_alquilado = numero_dias_alquilado;
      
      return this.numero_dias_alquilado;
  }  
  
    /**
     *
     * @param precio
     *
     *
     * @return Nos retorna el precio total al dia.
     */
    @Override
  public double getPrecioTotalAlquilerPorDias(){
       double total =  this.precio_seguro_dia * this.numero_dias_alquilado ;
      return total;
      
  }
  
  
   @Override
  public String toString(){
      
      
      return "Nombre de seguro: "+ this.nombre_seguro + " Descripcion: "+
              this.descripcion+ " Precio alquiler por día: "+ this.precio_seguro_dia +" Numero de dias alquilado es: "+
              this.numero_dias_alquilado +" Total de todo es: "
              + getPrecioTotalAlquilerPorDias();
      
  }
    
    
    
}

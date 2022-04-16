
package actividadT09.vehiculos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alejandro Padulles
 */
  public abstract class Vehiculo implements IAlquilable {
    
    
    private int matricula, numero_plazas, numero_dias_alquilado;
    private String modelo;
    private final double precio_por_dia = 50;
    public Vehiculo(int matricula,int numero_plazas,int numero_dias_alquilado, String modelo){
      
        this.matricula = matricula;  
        this.numero_dias_alquilado = setNumeroDias(numero_dias_alquilado);
        this.numero_plazas = numero_plazas;
        this.modelo = modelo;
       
    
    }
    public Vehiculo(){
        
    }
    
    public void pideDatos() throws IOException{
       int w = 0; 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ); 
        System.out.println("Matricula:\n");
        this.matricula = Integer.parseInt(br.readLine());
        System.out.println("Modelo:\n");
        this.modelo = br.readLine();
        System.out.println("Numero de plazas:\n");
        this.numero_plazas = Integer.parseInt(br.readLine());
        System.out.println("Numero de dias que vas a alquilar:\n");
        w = Integer.parseInt(br.readLine());
        this.numero_dias_alquilado = setNumeroDias(w);
        
    }
   
    @Override
    public String toString(){
        return "la matricula: "+this.matricula+" del modelo "+ this.modelo+" , numero de plazas: "+this.numero_plazas
                +" El alquiler por dias es: "+this.precio_por_dia+" un total de dias alquilado: "+this.numero_dias_alquilado
             
                ;
    }

    public int getMatricula() {
       
        return this.matricula;
    }
    public int getNumero_plazas() {
       
        return this.numero_plazas;
    }
    public int getNumero_dias_alquilado() {
        
        return this.numero_dias_alquilado;
    }
    public String getModelo() {
       
        return this.modelo;
    }
    public double getPrecio_por_dia() {
        return this.precio_por_dia;
    }

 
     
    @Override
    public int setNumeroDias(int diasuso) {
        this.numero_dias_alquilado = diasuso;
      return this.numero_dias_alquilado;  
    }

    /**
     *
     * @return
     */
    @Override
    public double getPrecioTotalAlquilerPorDias() {
        
        double total = this.precio_por_dia * this.numero_dias_alquilado;
       
        return total;
    }}


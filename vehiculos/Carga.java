
package actividadT09.vehiculos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Carga extends Vehiculo {
    
    
   
    private final double cantidad_fija = 1.5;
    private int PMA;
 
    
   public Carga(int matricula,int numero_plazas,int numero_dias_alquilado, String modelo, 
           int PMA){
    
     super(matricula,numero_plazas,numero_dias_alquilado, modelo);
     
   
     this.PMA = PMA;
      
   }
   
   public Carga (){
       super();
   }
     @Override
    public  void pideDatos() throws IOException{
         String Ga,Mo;
         int Ma,Nu,Nu_dias;
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
       
        System.out.println("Matricula:\n");
        Ma = Integer.parseInt(br.readLine());
        Ma = getMatricula();
        System.out.println("Modelo:\n");
        Mo = br.readLine();
        Mo = getModelo();
        System.out.println("Numero de plazas:\n");
        Nu = Integer.parseInt(br.readLine());
        Nu = getNumero_plazas();
        System.out.println("Numero de dias que vas a alquilar:\n");
        Nu_dias = Integer.parseInt(br.readLine());
        setNumeroDias(Nu_dias);
        System.out.println("Introduce PMA:\n");
        this.PMA = Integer.parseInt(br.readLine());
        
    }

     
      @Override
    public double getPrecioTotalAlquilerPorDias() {
       
        double total= (super.getPrecio_por_dia() * super.getNumero_dias_alquilado())+(this.cantidad_fija*this.PMA);
       
        return total;}
     
    @Override
     public String toString(){
        return super.toString()+(
                " El PMA del camion es :"+this.PMA +" El precio total del alquiler sumando los dias es: "+getPrecioTotalAlquilerPorDias())
                ;
    }
    
}

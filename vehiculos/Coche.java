
package actividadT09.vehiculos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alejandro Padulles Gonzalez
 */
public class Coche extends Vehiculo{
    
 
    private final double cantidad_fija = 1.5;
    private char gama_coche;
   
              
    public Coche(int matricula,int numero_plazas,int numero_dias_alquilado, String modelo,char gama_coche){
    
        super(matricula,numero_plazas,numero_dias_alquilado, modelo);
        
       
        this.gama_coche = gama_coche;
        
}
  public Coche(){
   super();
        
  }
   
    /**
     *
     * @throws IOException
     */
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
        System.out.println("Gama de coche:\n");
         Ga = br.readLine();
         gama_coche = Ga.charAt(0);
        
    }
     
    
      @Override
    public double getPrecioTotalAlquilerPorDias() {
      
      
        double q,r,p;
       
        q = getNumero_dias_alquilado() * getPrecio_por_dia() ;
        p = getNumero_dias_alquilado() * cantidad_fija;
        r = getNumero_plazas() * cantidad_fija ;
         double total = q+r+p;
        
        return total;}
    
      @Override
    public String toString(){
        return super.toString()+(" La gama del coche es: "+this.gama_coche +
                " El precio total del alquiler sumando los dias es: "+getPrecioTotalAlquilerPorDias())
                ;
    }
    
    
}

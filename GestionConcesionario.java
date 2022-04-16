
package actividadT09;


import actividadT09.vehiculos.Carga;
import actividadT09.vehiculos.Coche;
import actividadT09.seguros.Seguro;
import actividadT09.vehiculos.Vehiculo;
import actividadT09.vehiculos.IAlquilable;
import java.io.IOException;


/**
 *
 * @author Alejandro Padulles Gonzalez
 */
public class GestionConcesionario {
/**
 *
 * 
     * @param args
     * @throws java.io.IOException
 */
     private static IAlquilable [] alquilados;
       
    public static void main(String[] args) throws IOException {
        
        int opcion_apg;
        
        
        Seguro cases = new Seguro("Catalana Occidente.","Seguro con muchas coverturas.",40,1);
        Seguro cases1 = new Seguro("Caser.","Seguro baratillo.",40,1);
        
        Coche audi = new Coche(2376,5,1,"Q3",'A');
        Coche seat = new Coche(3478,3,1,"Leon",'C');
        Carga camion1 = new Carga(5678,3,1,"Tata",3000);
        Carga camion2 = new Carga(8901,2,1,"Pegaso",1200);
        
        
        Seguro [] N_seguro = new Seguro[2];
        N_seguro [0] = cases;
        N_seguro [1] = cases1;
        
        Vehiculo [] flota = new Vehiculo[4];
        flota [0] = audi;
        flota [1] = seat;
        flota [2] = camion1;
        flota [3] = camion2;
        
       do{
        System.out.println("Elige una opcion: \n"  );   
        System.out.println("1. Mostrar informacion de flota: "  );  
        System.out.println("2. Mostrar informacion de seguros: "  );
        System.out.println("3. Reinicia el alquiler indicando el numero de vehiculos y seguros que se quieran alquilar: "  );
        System.out.println("4. Establece el numero de dias por alquiler: "  ); 
        System.out.println("5. muestra el alquiler: "  );
        System.out.println("0. Finalizar el programa\n "  ); 
        
       
        
         try {
                opcion_apg = Pregunta.pideEntero("Opción elegida:");
                if(opcion_apg <0 || opcion_apg >8){
                    
                    System.out.println("El valor debe ser entre 0 y 8 \n"); 
                }
            }catch (Exception e) {
                opcion_apg = -1;
              System.out.println("El valor debe ser numerico \n");
            }
        
        
       switch (opcion_apg){
     
       
           case 0:
               
                System.out.println("\nFin del programa\n");
               
           break;
           
           
           case 1:
               
                
              muestraFlota(flota);
                
           break;    
            
          
           case 2:
  
             
              muestraSeguros(N_seguro);
                
           break;
           
           case 3:
               
             
                 menu3(flota,N_seguro);
               
           break; 
           
           case 4:
               
             
               establecerAlquiler();
          
              
           break; 
           
           case 5:
               
           
                muestraAlquilables();
              
               
           break; 
           
       
                
           }      
                
        }while (opcion_apg !=0);      
        
    }

    /**
     *
     * @param flota
     * @param N_seguro
     * @throws IOException
     */
    public static void menu3(Vehiculo []flota, Seguro [] N_seguro) throws IOException{
         
        
          int opcion = 0;
         System.out.println("Cuantos vehiculos o seguros quieres alquilar (max 5): ");
        
              int  cantidad_alquiler = Pregunta.pidevalor(1, 5,"");
              alquilados = new IAlquilable[cantidad_alquiler];
              int total_alquiler = 0;
        do{
            System.out.println("Proceso de alquiler. Alquilando el seguro o coche de un total de: "
                    + cantidad_alquiler + " productos "+"\n1.Opcion vehiculo:\n2.Opcion Seguro:");
          opcion = Pregunta.pidevalor(1, 2, "");
        
            
            switch (opcion){
                case 1:
                  
                   muestraFlota(flota);
                   int cant_vehiculos = Pregunta.pidevalor(0, flota.length,"Indica el numero de vehiculo que quieres escoger: ");
                   alquilados[total_alquiler] = flota[ cant_vehiculos];
                   
                break;

                case 2:
                    
                    muestraSeguros(N_seguro);
                    int cant_seguros = Pregunta.pidevalor(0, N_seguro.length,"Indica el numero de seguro que quieres escoger: ");
                    alquilados[total_alquiler] = N_seguro [cant_seguros];
                    
                break;
                    
        
            }
          total_alquiler++;
     
    
        }while(total_alquiler != cantidad_alquiler);
}
     public static void muestraFlota(Vehiculo [] flota){
         
         int u = 0;
         System.out.println("Flota:\n");
                for(int i=0;i<flota.length;i++) {
                System.out.println(u++ +". "+ flota[i]);
                   }
                System.out.println("\n");
         
         
     }
     
        public static void muestraSeguros(Seguro [] N_seguro){
            int u = 0;
          System.out.println("Seguros:\n");
               for(int i=0;i<N_seguro.length;i++) {
               System.out.println(u++ +". "+ N_seguro[i]);
                   }
                System.out.println("\n");
        
         
         
     }
        public static void establecerAlquiler(){
            
             int estableDias = Pregunta.pidevalor(1, 359,"Dinos cuantos dias quieres alquilar el servicio:\n");
            for (int i=0 ;i< alquilados.length ;i++){
                alquilados[i].setNumeroDias(estableDias);                }
            System.out.println("Compra realizada, que tenga un buen dia.");
           
            
        }
        
        public static void muestraAlquilables(){
           
            
            int u = 0;
            System.out.println("\nVehiculos y seguros actualmente alquilados:\n"
                    );
            
            for (int i= 0 ;i< alquilados.length; i++){
                System.out.println(u++ +". "+alquilados[i]);
            
        }
     
     
     
     
     
        } 
     
     
}
        
        
        
        
        
        
        
        
        
        
       
    
    


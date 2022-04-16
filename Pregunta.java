
package actividadT09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pregunta {

   
    
    
    public static int pideEntero(String preguntaenteroAPG) throws IOException { // Esta funcion es la que utilizaremos para pedir los valores enteros.
       
      int pideentero = 0;
      
      do{ 
          System.out.println(preguntaenteroAPG);
       try{   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );  
       pideentero = Integer.parseInt(br.readLine());
       
       break;
       
       }catch (Exception e){
            System.out.println("Solo caracteres numericos");
       }
       
       
       
      } while(true);
      return pideentero; 
    }
    
     public static double pideDouble(String preguntaDoubleAPG) throws IOException { //Esta funcion es la que utilizaremos para pedir los valores con decimales.
       
       double pidenumeroDoubleAPG = 0;
     
      do{ 
          
          System.out.println(preguntaDoubleAPG); 
       try{   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );  
       pidenumeroDoubleAPG = Double.parseDouble(br.readLine());
       
       
       break;
       
       }catch (Exception e){
            System.out.println("Solo caracteres numericos");
       }
       
  
       
      } while(true);
      return pidenumeroDoubleAPG; 
    }
    
    public static int pidevalor(int valorminimo, int valormaximo, String comentario)  {
     int valorAPG = 0;
     
      do{
          try{
          valorAPG = pideEntero(comentario);
           }catch (IOException e){
                   System.out.println("\nSolo caracteres numericos\n"); } 
         
          
            if((valorAPG < valorminimo  || valorAPG > valormaximo )){
              System.out.println("\nEl valor introducido es: "+ valorAPG +"\nLa opcion de menu no es correcta!!!\n");               
          }
      
      }while  ((valorAPG < valorminimo  || valorAPG > valormaximo ));
      
    
    
    return valorAPG;
    }
    
    
    
}

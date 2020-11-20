package unidad_2;

import javax.swing.JOptionPane;

public class Triangulo {

    public static void main(String[] args) {
        String base ;char a;
      
            base = JOptionPane.showInputDialog("introduce la base del triangulo: ");
            
            triangulo(soloEntero(base),"*","*");  
         
    
    }
    
   public static void triangulo(int Caracteres, String cadenaDePartida, String cadenaActual){ 
   try{
       
        if (cadenaActual.length() == Caracteres) {
            Thread.sleep(600);
            System.out.println("" + cadenaActual);
            
        }
        else {
             Thread.sleep(600);
            System.out.println("" + cadenaActual);
            cadenaActual = cadenaActual.concat(cadenaDePartida);
            triangulo(Caracteres, cadenaDePartida, cadenaActual);
            
        }
        }catch(Exception e){
            System.out.println("error");
        }
    }
    
    //MENSAJE DE VALOR POSITIVO
    public static int soloEntero(String numero) {
        int error; 
        String b;
        
        try {
            
            error = Integer.parseInt(numero);
            
            if(error<=-1){
                
                JOptionPane.showMessageDialog(null,"Datos Introducidos de manera incorrecta");
                b = JOptionPane.showInputDialog("introduce la base del triangulo: ");
                return soloEntero(b);
                
            }else{
                
                return error;
                
            }
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,"Datos Introducidos de manera incorrecta");
            b = JOptionPane.showInputDialog("introduce la base del triangulo: ");
            return soloEntero(b);
            
        }
 
    }
 
}
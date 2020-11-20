package unidad_5;
import java.util.Scanner;
/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class Ordena_Ordena_Ordena {
    public static Scanner ler = new Scanner (System.in);
    
    int vector[];
    int Burbuja,Insercion, Seleccion;
    
    public void CrearVector( int t ){ 
        vector = new int [ t ];
    }
    
    public void inicializarVector( int t){
        int i;
        for ( i=0; i < t; i++) {
            vector [ i ] = 0;
            
        }
    }
    
    public void llenaVector ( int t){
    int i;
        for ( i = 0; i < t; i++) {
            System.out.println(" Escribe el numero: ");
            vector [i] = ler.nextInt();
        }
    }
    
    public void imprimeVector ( int t ){
        int i;
        for ( i = 0; i < t; i++) {
            System.out.println( vector[i] + " ");
        }
    }
    
    public void OrdenBurbuja ( int t ){
        int i, j, Aux;
        
        for ( i = 0; i < t-1; i++) {
            for ( j = 0; j < t-1; j++) {
                if(vector[j]> vector[j+1]){
                    Aux = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = Aux;
                    
                    Burbuja ++;
                }
                
            }
            
        }
        System.out.println(" EL NUMERO DE ITERACIONES FUE DE: " + Burbuja);
    }
    
    public void OrdenacionInsercion(int t){
     int i, aux, j;
    
     for (i = 1; i < t; i++) {
         aux = vector[i];
         for ( j = i-1; j >= 0 && vector[j] > aux; j--) {
             vector [j+1] = vector [j];
             Insercion ++;
         }
         vector [j+1] = aux;
     }
     System.out.println(" EL NUMERO DE ITERACIONES FUE DE: " + Insercion);
    }
    
    public void OrdenacionSeleccion(int t){
     int i, aux, j, menor, pos;
     
     for (i = 0; i < t-1; i++) {
         menor = vector [i];
         pos = i;
         for (j = i+1; j < t; j++) {
             if( vector  [j] < menor){
                 menor = vector [j];
                 pos = j;
                 Seleccion ++;
             }
         }
         if(pos!= i){
             aux = vector [i];
             vector [i] = vector [pos];
             vector [pos] = aux;
         }
     }
     System.out.println(" EL NUMERO DE ITERACIONES FUE DE: " + Seleccion);
    }
    
}

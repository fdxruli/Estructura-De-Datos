package unidad_5;
import java.util.Scanner;

/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class Main_Ordenacion {
    public static Scanner ler = new Scanner (System.in);
    
    public static void main(String[] args) {
        int t = 0, Opcion = 0;
        
        Ordena_Ordena_Ordena Ordenar = new Ordena_Ordena_Ordena();
        
        do{
        System.out.println(" METODOS DE ORDENACION ");
        System.out.println(" 1.- BURBUJA ");
        System.out.println(" 2.- INSERCION ");
        System.out.println(" 3.- SELECCION ");
        System.out.println(" 4 .- salir ");
        System.out.println(" ELIGE UNA OPCION ");
        Opcion = ler.nextInt();
        
        System.out.println(" ELIGE EL TAMAÑO DEL VECTOR ");
        t = ler.nextInt();
             
        switch ( Opcion ){
            
            case 1:
                Ordenar.CrearVector(t);
                Ordenar.inicializarVector(t);
                Ordenar.llenaVector(t);
                System.out.println(" VISTA DEL VECTOR HASTA AHORA: ");
                Ordenar.imprimeVector(t);
                Ordenar.OrdenBurbuja(t);
                System.out.println(" VECTOR ORDENADO: ");
                Ordenar.imprimeVector(t);
                break;
                
            case 2:
                Ordenar.CrearVector(t);
                Ordenar.inicializarVector(t);
                Ordenar.llenaVector(t);
                System.out.println(" VISTA DEL VECTOR HASTA AHORA: ");
                Ordenar.imprimeVector(t);
                Ordenar.OrdenacionInsercion(t);
                System.out.println(" VECTOR ORDENADO: ");
                Ordenar.imprimeVector(t);
                break;
                
            case 3:
                Ordenar.CrearVector(t);
                Ordenar.inicializarVector(t);
                Ordenar.llenaVector(t);
                System.out.println(" VISTA DEL VECTOR HASTA AHORA: ");
                Ordenar.imprimeVector(t);
                Ordenar.OrdenacionSeleccion(t);
                System.out.println(" VECTOR ORDENADO: ");
                Ordenar.imprimeVector(t);
                break;
                
        }
        
        }while( Opcion < 1 || Opcion > 4);
        

        

    }
    
}

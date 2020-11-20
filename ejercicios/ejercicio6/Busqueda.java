/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_6;

import java.util.Scanner;

/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class Busqueda {
    
    Scanner ler = new Scanner(System.in);
    
    int arreglo[];
    
    public void CrearArreglo( int t ){ 
        arreglo = new int [ t ];
    }
    
    public void inicializarArreglo( int t){
        int i;
        for ( i=0; i < t; i++) {
            arreglo [ i ] = 0;
            
        }
    }
    
    public void llenaArreglo ( int t){
    int i;
        for ( i = 0; i < t; i++) {
            System.out.println(" ingresa un numero para la posicion " + i + " del arreglo:");
            arreglo [i] = ler.nextInt();
        }
    }
    
    public void imprimeArreglo ( int t ){
        int i;
        for ( i = 0; i < t; i++) {
            System.out.println("Arreglo[" + i + "] = " + arreglo[i]);
        }
    }
    
    public void OrdenarArregloBurbuja ( int t ){
        int i, j, Aux;
        
        for ( i = 0; i < t-1; i++) {
            for ( j = 0; j < t-1; j++) {
                if(arreglo[j]> arreglo[j+1]){
                    Aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = Aux;
                }
                
            }
            
        }
        //System.out.println(" EL NUMERO DE ITERACIONES FUE DE: " + Burbuja);
    }
    
    public void BusquedaBinaria(int t){
        
        System.out.println("ingrese el valor a buscar");
        int num_busqueda = ler.nextInt();
        
        int inicio = 0;
        int medio ;
        int ultimo = t-1;
        
        while(inicio <= ultimo){
             
            medio = ( inicio + ultimo)/2;
            
            if (arreglo[medio] == num_busqueda) {
                System.out.println("el numero solicidato esta en la posicion: " + medio);
                break;
            }else if (num_busqueda<= arreglo[medio]) {
                ultimo = medio -1;
            }else{
                inicio = medio + 1;
            }
        }
    }
    
}

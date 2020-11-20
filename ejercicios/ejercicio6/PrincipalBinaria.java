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
public class PrincipalBinaria {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int t = 0;
        
        System.out.println("ingrese el tamaño del vector: ");
        t = ler.nextInt();
        
        Busqueda Buscar = new Busqueda();
        
        Buscar.CrearArreglo(t);
        Buscar.inicializarArreglo(t);
        Buscar.llenaArreglo(t);
        Buscar.OrdenarArregloBurbuja(t);
        System.out.println("VISTA DEL VECTOR ORDENADO:");
        Buscar.imprimeArreglo(t);
        Buscar.BusquedaBinaria(t);
    }
    
}

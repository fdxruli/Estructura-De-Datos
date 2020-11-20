/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3;

/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila pila1 = new Pila(3);
        pila1.pop();
        pila1.push();
        pila1.MostrarPila();
        pila1.push();
        pila1.push();
        pila1.MostrarPila();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_1;

import javax.swing.JOptionPane;

/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Atributos
        int aux;
        String cad="";
        long TInicio,tiempo,TInicio1,tiempo1;//variable para definir el tiempo de ejecucion 
        
        //Pedir # del vector
        int cont=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos numeros quieres ingresar?"));
        int num []=new int [cont];
        for(int x=0;x<cont;x++){
        num[x]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero al vector"));
        }
        
        //Ver # - a +
        TInicio=System.currentTimeMillis();
        for(int x=0;x<cont;x++){
            for(int y=x+1;y<cont;y++){
                if(num[x]>num[y]){
                    aux=num[x];
                    num[x]=num[y];
                    num[y]=aux;
            }
            }
            cad=cad+num[x]+"\n";
        }
        JOptionPane.showMessageDialog(null,"Los numeros de menor a mayor son:\n"+cad);
        tiempo=System.currentTimeMillis()-TInicio;
        Double conver;
        conver=tiempo/1000.00;
        JOptionPane.showMessageDialog(null,"El tiempo de ejecucion fue:\n"+conver);
        
        //Ver # + a -
        String cad2="";
        TInicio=System.currentTimeMillis();
        for(int x=0;x<cont;x++){
            for(int y=x+1;y<cont;y++){
                if(num[x]<num[y]){
                    aux=num[x];
                    num[x]=num[y];
                    num[y]=aux;
            }
            }
            cad2=cad2+num[x]+"\n";
        }
        JOptionPane.showMessageDialog(null,"Los numeros de mayor amenos son:\n"+cad2);
        tiempo=System.currentTimeMillis()-TInicio;
        Double conver2;
        conver2=tiempo/1000.00;
        JOptionPane.showMessageDialog(null,"El tiempo de ejecucion fue:\n"+conver2);
    }
    

    }
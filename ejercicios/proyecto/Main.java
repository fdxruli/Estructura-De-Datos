/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class Main {
    
    public static void main(String[] args) {

        Stack<Ficha> o = new Stack<Ficha>();
        Stack<Ficha> n = new Stack<Ficha>();
        Stack<Ficha> p = new Stack<Ficha>();

        // llenar

        for (int i = 1; i <= 20; i++) {
            o.push(new Ficha(Constantes.ESPECIALIDAD_ODONTOLOGIA, i));
            n.push(new Ficha(Constantes.ESPECIALIDAD_NEUROLOGIA, i));
            p.push(new Ficha(Constantes.ESPECIALIDAD_PEDIATRIA, i));
        }

        System.out.println("ODONTOLOGIA");
        mostrar(o);
        System.out.println("NEUROLOGIA");
        mostrar(n);
        System.out.println("PEDIATRIA");
        mostrar(p);

        Queue<Paciente> pacientes = new LinkedList<Paciente>();

        pacientes.add(new Paciente("Nombre1", Constantes.ESPECIALIDAD_ODONTOLOGIA, Constantes.ESPECIALIDAD_PEDIATRIA));
        pacientes.add(new Paciente("Nombre2", Constantes.ESPECIALIDAD_PEDIATRIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre3", Constantes.ESPECIALIDAD_NEUROLOGIA, Constantes.ESPECIALIDAD_ODONTOLOGIA));
        pacientes.add(new Paciente("Nombre4", Constantes.ESPECIALIDAD_ODONTOLOGIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre5", Constantes.ESPECIALIDAD_ODONTOLOGIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre6", Constantes.ESPECIALIDAD_PEDIATRIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre7", Constantes.ESPECIALIDAD_NEUROLOGIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre8", Constantes.ESPECIALIDAD_NEUROLOGIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre9", Constantes.ESPECIALIDAD_NEUROLOGIA, Constantes.SIN_ESPECIALIDAD));
        pacientes.add(new Paciente("Nombre10", Constantes.ESPECIALIDAD_NEUROLOGIA, Constantes.SIN_ESPECIALIDAD));

        System.out.println("PACIENTES");
        mostrar(pacientes);

        // Solución 1
        asignarFichas(o, n, p, pacientes);


        System.out.println("ODONTOLOGIA");
        mostrar(o);
        System.out.println("NEUROLOGIA");
        mostrar(n);
        System.out.println("PEDIATRIA");
        mostrar(p);

        // Solución 2
        // Calcular cual es la especialidad mas requerida
        calcularEspecidadMasRequerida(o, n, p);

        // Solución 3
        // Realizar el metodo atender para devolver la ficha a su lugar


        Paciente pa = pacientes.remove();
        System.out.println("> paciente: " + pa.getNombre());
        atender(pa, o, p, n);

    }

    private static void atender(Paciente pa, Stack<Ficha> o, Stack<Ficha> p, Stack<Ficha> n) {
        if (pa.getEspecialidad1() == Constantes.ESPECIALIDAD_ODONTOLOGIA) {
            Ficha fi = pa.getFicha1();
            o.push(fi);
            // reseteo
            pa.setFicha1(null);
            pa.setEspecialidad1(Constantes.SIN_ESPECIALIDAD);
        } else if (pa.getEspecialidad1() == Constantes.ESPECIALIDAD_NEUROLOGIA) {
            Ficha fi = pa.getFicha1();
            n.push(fi);
            // reseteo
            pa.setFicha1(null);
            pa.setEspecialidad1(Constantes.SIN_ESPECIALIDAD);
        } else if (pa.getEspecialidad1() == Constantes.ESPECIALIDAD_NEUROLOGIA) {
            Ficha fi = pa.getFicha1();
            n.push(fi);
            // reseteo
            pa.setFicha1(null);
            pa.setEspecialidad1(Constantes.SIN_ESPECIALIDAD);
        }
        if (pa.getEspecialidad2() != Constantes.SIN_ESPECIALIDAD) {
            if (pa.getEspecialidad2() == Constantes.ESPECIALIDAD_ODONTOLOGIA) {
                Ficha fi = pa.getFicha2();
                o.push(fi);
                // reseteo
                pa.setFicha2(null);
                pa.setEspecialidad2(Constantes.SIN_ESPECIALIDAD);
            } else if (pa.getEspecialidad2() == Constantes.ESPECIALIDAD_PEDIATRIA) {
                Ficha fi = pa.getFicha2();
                p.push(fi);
                // reseteo
                pa.setFicha2(null);
                pa.setEspecialidad2(Constantes.SIN_ESPECIALIDAD);
            } else if (pa.getEspecialidad2() == Constantes.ESPECIALIDAD_NEUROLOGIA) {
                Ficha fi = pa.getFicha2();
                n.push(fi);
                // reseteo
                pa.setFicha2(null);
                pa.setEspecialidad2(Constantes.SIN_ESPECIALIDAD);
            }
        }
    }

    private static void calcularEspecidadMasRequerida(Stack<Ficha> o, Stack<Ficha> n, Stack<Ficha> p) {

        int no = o.size();
        int np = p.size();
        int nn = n.size();

        if (no < np && no < nn) {
            System.out.println("Odontologia es más requerido");
        }
        if (np < no && np < nn) {
            System.out.println("Pediatria es más requerido");
        }
        if (nn < no && nn < np) {
            System.out.println("Neurologia es más requerido");
        }


    }

    private static void asignarFichas(Stack<Ficha> o, Stack<Ficha> n, Stack<Ficha> p, Queue<Paciente> pacientes) {

        int m = pacientes.size();
        for (int i = 0; i < m; i++) {
            Paciente pa = pacientes.remove();

            if (pa.getEspecialidad1() == Constantes.ESPECIALIDAD_NEUROLOGIA) {
                Ficha fi = n.pop();
                pa.setFicha1(fi);
            } else if (pa.getEspecialidad1() == Constantes.ESPECIALIDAD_ODONTOLOGIA) {
                Ficha fi = o.pop();
                pa.setFicha1(fi);
            } else if (pa.getEspecialidad1() == Constantes.ESPECIALIDAD_PEDIATRIA) {
                Ficha fi = p.pop();
                pa.setFicha1(fi);
            }


            if (pa.getEspecialidad2() != Constantes.SIN_ESPECIALIDAD) {
                if (pa.getEspecialidad2() == Constantes.ESPECIALIDAD_NEUROLOGIA) {
                    Ficha fi = n.pop();
                    pa.setFicha2(fi);
                } else if (pa.getEspecialidad2() == Constantes.ESPECIALIDAD_ODONTOLOGIA) {
                    Ficha fi = o.pop();
                    pa.setFicha2(fi);
                } else if (pa.getEspecialidad2() == Constantes.ESPECIALIDAD_PEDIATRIA) {
                    Ficha fi = p.pop();
                    pa.setFicha2(fi);
                }
            }

            pacientes.add(pa);
        }

    }

    private static void mostrar(Stack<Ficha> o) {

        Stack<Ficha> temp = new Stack<Ficha>();

        while (!o.isEmpty()) {
            Ficha fi = o.pop();
            System.out.println(" Ficha: " + fi.getEspecialidad() + " " + fi.getCodigo());
            temp.push(fi);
        }
        while (!temp.isEmpty()) {
            Ficha fi = temp.pop();
            o.push(fi);
        }
    }

    public static void mostrar(Queue<Paciente> cola) {
        int n = cola.size();
        for (int i = 0; i < n; i++) {
            Paciente pa = cola.remove();
            System.out.println(" Paciente: " + pa.getNombre() + " Especialidades: " + pa.getEspecialidad1() + ", " + pa.getEspecialidad2());
            cola.add(pa);
        }
    }
    
}

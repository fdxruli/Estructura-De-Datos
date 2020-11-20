/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author RULI SEBASTIAN MONTE
 */
public class Ficha {
    
    private int especialidad;
    private int codigo;

    public Ficha(int especialidad, int codigo) {
        this.especialidad = especialidad;
        this.codigo = codigo;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}

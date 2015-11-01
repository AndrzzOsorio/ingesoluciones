/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author 4NDR35
 */
public class Montaje {
    private String nombre;
    private String corteinicial;

    public Montaje() {
    }

    public Montaje(String nombre, String corteinicial) {
        this.nombre = nombre;
        this.corteinicial = corteinicial;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the corteinicial
     */
    public String getCorteinicial() {
        return corteinicial;
    }

    /**
     * @param corteinicial the corteinicial to set
     */
    public void setCorteinicial(String corteinicial) {
        this.corteinicial = corteinicial;
    }
    
    
}

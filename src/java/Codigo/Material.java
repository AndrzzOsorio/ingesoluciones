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
public class Material {
    private String nombre;
    private int numerodepliegos;

    public Material() {
    }

    public Material(String nombre, int numerodepliegos) {
        this.nombre = nombre;
        this.numerodepliegos = numerodepliegos;
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
     * @return the numerodepliegos
     */
    public int getNumerodepliegos() {
        return numerodepliegos;
    }

    /**
     * @param numerodepliegos the numerodepliegos to set
     */
    public void setNumerodepliegos(int numerodepliegos) {
        this.numerodepliegos = numerodepliegos;
    }
    
    
}

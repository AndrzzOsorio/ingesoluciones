/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.LinkedList;

/**
 *
 * @author 4NDR35
 */
public class Produccion {
    private String referencia;
    private int muestraimpresa;
    private int cantidad;
    private String maquina;
    private LinkedList<Material> material;
    private LinkedList<Montaje> montaje;
    private LinkedList<Tinta> tinta;
    private int numerodeplanchas;
    private int electros;
    private int metalicas;
    private OrdenTalonario talonario;
    
    public Produccion() {
    }
    
    public Produccion(String referencia, int muestraimpresa, int cantidad, String maquina, LinkedList<Material> material, LinkedList<Montaje> montaje, LinkedList<Tinta> tinta, int numerodeplanchas, int electros, int metalicas, OrdenTalonario talonario) {
        this.referencia = referencia;
        this.muestraimpresa = muestraimpresa;
        this.cantidad = cantidad;
        this.maquina = maquina;
        this.material = material;
        this.montaje = montaje;
        this.tinta = tinta;
        this.numerodeplanchas = numerodeplanchas;
        this.electros = electros;
        this.metalicas = metalicas;
        this.talonario = talonario;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the muestraimpresa
     */
    public int getMuestraimpresa() {
        return muestraimpresa;
    }

    /**
     * @param muestraimpresa the muestraimpresa to set
     */
    public void setMuestraimpresa(int muestraimpresa) {
        this.muestraimpresa = muestraimpresa;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the maquina
     */
    public String getMaquina() {
        return maquina;
    }

    /**
     * @param maquina the maquina to set
     */
    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    /**
     * @return the material
     */
    public LinkedList<Material> getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(LinkedList<Material> material) {
        this.material = material;
    }

    /**
     * @return the montaje
     */
    public LinkedList<Montaje> getMontaje() {
        return montaje;
    }

    /**
     * @param montaje the montaje to set
     */
    public void setMontaje(LinkedList<Montaje> montaje) {
        this.montaje = montaje;
    }

    /**
     * @return the tinta
     */
    public LinkedList<Tinta> getTinta() {
        return tinta;
    }

    /**
     * @param tinta the tinta to set
     */
    public void setTinta(LinkedList<Tinta> tinta) {
        this.tinta = tinta;
    }

    /**
     * @return the numerodeplanchas
     */
    public int getNumerodeplanchas() {
        return numerodeplanchas;
    }

    /**
     * @param numerodeplanchas the numerodeplanchas to set
     */
    public void setNumerodeplanchas(int numerodeplanchas) {
        this.numerodeplanchas = numerodeplanchas;
    }

    /**
     * @return the electros
     */
    public int getElectros() {
        return electros;
    }

    /**
     * @param electros the electros to set
     */
    public void setElectros(int electros) {
        this.electros = electros;
    }

    /**
     * @return the metalicas
     */
    public int getMetalicas() {
        return metalicas;
    }

    /**
     * @param metalicas the metalicas to set
     */
    public void setMetalicas(int metalicas) {
        this.metalicas = metalicas;
    }

    /**
     * @return the talonario
     */
    public OrdenTalonario getTalonario() {
        return talonario;
    }

    /**
     * @param talonario the talonario to set
     */
    public void setTalonario(OrdenTalonario talonario) {
        this.talonario = talonario;
    }
    
    
    

   
    
    
    
    
}
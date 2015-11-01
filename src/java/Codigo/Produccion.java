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
    private int cantidad;
    private boolean muestraimpresa;
    private String maquina;
    private int numerodeplanchas;
    private boolean metalicas;
    private boolean electros;
    private OrdenTalonario talonario;
    private LinkedList<Material> material;
    private LinkedList<Montaje> montaje;
    private LinkedList<Tinta> tinta;

    public Produccion() {
    }

    public Produccion(String referencia, int cantidad, boolean muestraimpresa, String maquina, int numerodeplanchas, boolean metalicas, boolean electros, OrdenTalonario talonario, LinkedList<Material> material, LinkedList<Montaje> montaje, LinkedList<Tinta> tinta) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.muestraimpresa = muestraimpresa;
        this.maquina = maquina;
        this.numerodeplanchas = numerodeplanchas;
        this.metalicas = metalicas;
        this.electros = electros;
        this.talonario = talonario;
        this.material = material;
        this.montaje = montaje;
        this.tinta = tinta;
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
     * @return the muestraimpresa
     */
    public boolean isMuestraimpresa() {
        return muestraimpresa;
    }

    /**
     * @param muestraimpresa the muestraimpresa to set
     */
    public void setMuestraimpresa(boolean muestraimpresa) {
        this.muestraimpresa = muestraimpresa;
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
     * @return the metalicas
     */
    public boolean isMetalicas() {
        return metalicas;
    }

    /**
     * @param metalicas the metalicas to set
     */
    public void setMetalicas(boolean metalicas) {
        this.metalicas = metalicas;
    }

    /**
     * @return the electros
     */
    public boolean isElectros() {
        return electros;
    }

    /**
     * @param electros the electros to set
     */
    public void setElectros(boolean electros) {
        this.electros = electros;
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
    
    
}
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
public class Tiraje {
    private String referencia;
    private int cantidad;
    private String maquina;
    private String macula;
    private int numeroplanchas;
    private String observaciones;
    private LinkedList<Tinta> tinta;
    private Material material;
    private Cliente cliente;
    
    public Tiraje() {
    }

    public Tiraje(String referencia, int cantidad, String maquina, String macula, int numeroplanchas, String observaciones, LinkedList<Tinta> tinta, Material material, Cliente cliente) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.maquina = maquina;
        this.macula = macula;
        this.numeroplanchas = numeroplanchas;
        this.observaciones = observaciones;
        this.tinta = tinta;
        this.material = material;
        this.cliente = cliente;
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
     * @return the macula
     */
    public String getMacula() {
        return macula;
    }

    /**
     * @param macula the macula to set
     */
    public void setMacula(String macula) {
        this.macula = macula;
    }

    /**
     * @return the numeroplanchas
     */
    public int getNumeroplanchas() {
        return numeroplanchas;
    }

    /**
     * @param numeroplanchas the numeroplanchas to set
     */
    public void setNumeroplanchas(int numeroplanchas) {
        this.numeroplanchas = numeroplanchas;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
    
    
    
}

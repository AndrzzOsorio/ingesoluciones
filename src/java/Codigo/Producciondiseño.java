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
public class Producciondiseño {
    private String referencia;
    private int cantidad;
    private String material;
    private String macula;
    private LinkedList<Tinta> tintas;
    private int numplanchas;
    private String observaciones;
    private String fechaentrega;
    private String elaboro;
    private String recibiconforme;
    private int cedula;

    public Producciondiseño() {
    }

    public Producciondiseño(String referencia, int cantidad, String material, String macula, LinkedList<Tinta> tintas, int numplanchas, String observaciones, String fechaentrega, String elaboro, String recibiconforme, int cedula) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.material = material;
        this.macula = macula;
        this.tintas = tintas;
        this.numplanchas = numplanchas;
        this.observaciones = observaciones;
        this.fechaentrega = fechaentrega;
        this.elaboro = elaboro;
        this.recibiconforme = recibiconforme;
        this.cedula = cedula;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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
     * @return the tintas
     */
    public LinkedList<Tinta> getTintas() {
        return tintas;
    }

    /**
     * @param tintas the tintas to set
     */
    public void setTintas(LinkedList<Tinta> tintas) {
        this.tintas = tintas;
    }

    /**
     * @return the numplanchas
     */
    public int getNumplanchas() {
        return numplanchas;
    }

    /**
     * @param numplanchas the numplanchas to set
     */
    public void setNumplanchas(int numplanchas) {
        this.numplanchas = numplanchas;
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
     * @return the fechaentrega
     */
    public String getFechaentrega() {
        return fechaentrega;
    }

    /**
     * @param fechaentrega the fechaentrega to set
     */
    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    /**
     * @return the elaboro
     */
    public String getElaboro() {
        return elaboro;
    }

    /**
     * @param elaboro the elaboro to set
     */
    public void setElaboro(String elaboro) {
        this.elaboro = elaboro;
    }

    /**
     * @return the recibiconforme
     */
    public String getRecibiconforme() {
        return recibiconforme;
    }

    /**
     * @param recibiconforme the recibiconforme to set
     */
    public void setRecibiconforme(String recibiconforme) {
        this.recibiconforme = recibiconforme;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}

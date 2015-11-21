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
public class Ordendiseño {
    
    private String referencia;
    private int muestraimpresa;
    private int cantidad;
    private String montaje;
    private String tamaño;
    private LinkedList<Tinta> tintas;
    private int DD;
    private int correo;
    private int CDDVD;
    private int otro;
    private String descripcion;
    private Clientediseño cliente;
    private Preproduccion preproduccion;

    public Ordendiseño() {
    }

    public Ordendiseño(String referencia, int muestraimpresa, int cantidad, String montaje, String tamaño, LinkedList<Tinta> tintas, int DD, int correo, int CDDVD, int otro, String descripcion, Clientediseño cliente, Preproduccion preproduccion) {
        this.referencia = referencia;
        this.muestraimpresa = muestraimpresa;
        this.cantidad = cantidad;
        this.montaje = montaje;
        this.tamaño = tamaño;
        this.tintas = tintas;
        this.DD = DD;
        this.correo = correo;
        this.CDDVD = CDDVD;
        this.otro = otro;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.preproduccion = preproduccion;
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
     * @return the montaje
     */
    public String getMontaje() {
        return montaje;
    }

    /**
     * @param montaje the montaje to set
     */
    public void setMontaje(String montaje) {
        this.montaje = montaje;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
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
     * @return the DD
     */
    public int getDD() {
        return DD;
    }

    /**
     * @param DD the DD to set
     */
    public void setDD(int DD) {
        this.DD = DD;
    }

    /**
     * @return the correo
     */
    public int getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(int correo) {
        this.correo = correo;
    }

    /**
     * @return the CDDVD
     */
    public int getCDDVD() {
        return CDDVD;
    }

    /**
     * @param CDDVD the CDDVD to set
     */
    public void setCDDVD(int CDDVD) {
        this.CDDVD = CDDVD;
    }

    /**
     * @return the otro
     */
    public int getOtro() {
        return otro;
    }

    /**
     * @param otro the otro to set
     */
    public void setOtro(int otro) {
        this.otro = otro;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cliente
     */
    public Clientediseño getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Clientediseño cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the preproduccion
     */
    public Preproduccion getPreproduccion() {
        return preproduccion;
    }

    /**
     * @param preproduccion the preproduccion to set
     */
    public void setPreproduccion(Preproduccion preproduccion) {
        this.preproduccion = preproduccion;
    }
    
    
    
}

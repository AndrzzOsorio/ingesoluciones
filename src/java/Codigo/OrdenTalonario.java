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
public class OrdenTalonario {
    
    private int numerotalonarios;
    private int numeradodeinicio;
    private int numeradofin;
    private int perforado;
    private int troquelado;
    private int grafado;
    private int plastificado;
    private int parcialuv;
    private int barnizado;
    private Tinta tinta;

    public OrdenTalonario() {
    }

    public OrdenTalonario(int numerotalonarios, int numeradodeinicio, int numeradofin,Tinta tinta, int perforado, int troquelado, int grafado, int plastificado, int parcialuv, int barnizado) {
        this.numerotalonarios = numerotalonarios;
        this.numeradodeinicio = numeradodeinicio;
        this.numeradofin = numeradofin;
        this.perforado = perforado;
        this.troquelado = troquelado;
        this.grafado = grafado;
        this.plastificado = plastificado;
        this.parcialuv = parcialuv;
        this.barnizado = barnizado;
        this.tinta = tinta;
    }

    
    /**
     * @return the numerotalonarios
     */
    public int getNumerotalonarios() {
        return numerotalonarios;
    }

    /**
     * @param numerotalonarios the numerotalonarios to set
     */
    public void setNumerotalonarios(int numerotalonarios) {
        this.numerotalonarios = numerotalonarios;
    }

    /**
     * @return the numeradodeinicio
     */
    public int getNumeradodeinicio() {
        return numeradodeinicio;
    }

    /**
     * @param numeradodeinicio the numeradodeinicio to set
     */
    public void setNumeradodeinicio(int numeradodeinicio) {
        this.numeradodeinicio = numeradodeinicio;
    }

    /**
     * @return the numeradofin
     */
    public int getNumeradofin() {
        return numeradofin;
    }

    /**
     * @param numeradofin the numeradofin to set
     */
    public void setNumeradofin(int numeradofin) {
        this.numeradofin = numeradofin;
    }

    /**
     * @return the perforado
     */
    public int getPerforado() {
        return perforado;
    }

    /**
     * @param perforado the perforado to set
     */
    public void setPerforado(int perforado) {
        this.perforado = perforado;
    }

    /**
     * @return the troquelado
     */
    public int getTroquelado() {
        return troquelado;
    }

    /**
     * @param troquelado the troquelado to set
     */
    public void setTroquelado(int troquelado) {
        this.troquelado = troquelado;
    }

    /**
     * @return the grafado
     */
    public int getGrafado() {
        return grafado;
    }

    /**
     * @param grafado the grafado to set
     */
    public void setGrafado(int grafado) {
        this.grafado = grafado;
    }

    /**
     * @return the plastificado
     */
    public int getPlastificado() {
        return plastificado;
    }

    /**
     * @param plastificado the plastificado to set
     */
    public void setPlastificado(int plastificado) {
        this.plastificado = plastificado;
    }

    /**
     * @return the parcialuv
     */
    public int getParcialuv() {
        return parcialuv;
    }

    /**
     * @param parcialuv the parcialuv to set
     */
    public void setParcialuv(int parcialuv) {
        this.parcialuv = parcialuv;
    }

    /**
     * @return the barnizado
     */
    public int getBarnizado() {
        return barnizado;
    }

    /**
     * @param barnizado the barnizado to set
     */
    public void setBarnizado(int barnizado) {
        this.barnizado = barnizado;
    }

    /**
     * @return the tinta
     */
    public Tinta getTinta() {
        return tinta;
    }

    /**
     * @param tinta the tinta to set
     */
    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }
    

}

 

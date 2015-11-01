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
    private boolean perforado;
    private boolean troquelado;
    private boolean grafado;
    private boolean plastificado;
    private boolean parcialuv;
    private boolean barnizado;

    public OrdenTalonario() {
    }

    public OrdenTalonario(int numerotalonarios, int numeradodeinicio, int numeradofin, boolean perforado, boolean troquelado, boolean grafado, boolean plastificado, boolean parcialuv, boolean barnizado) {
        this.numerotalonarios = numerotalonarios;
        this.numeradodeinicio = numeradodeinicio;
        this.numeradofin = numeradofin;
        this.perforado = perforado;
        this.troquelado = troquelado;
        this.grafado = grafado;
        this.plastificado = plastificado;
        this.parcialuv = parcialuv;
        this.barnizado = barnizado;
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
    public boolean isPerforado() {
        return perforado;
    }

    /**
     * @param perforado the perforado to set
     */
    public void setPerforado(boolean perforado) {
        this.perforado = perforado;
    }

    /**
     * @return the troquelado
     */
    public boolean isTroquelado() {
        return troquelado;
    }

    /**
     * @param troquelado the troquelado to set
     */
    public void setTroquelado(boolean troquelado) {
        this.troquelado = troquelado;
    }

    /**
     * @return the grafado
     */
    public boolean isGrafado() {
        return grafado;
    }

    /**
     * @param grafado the grafado to set
     */
    public void setGrafado(boolean grafado) {
        this.grafado = grafado;
    }

    /**
     * @return the plastificado
     */
    public boolean isPlastificado() {
        return plastificado;
    }

    /**
     * @param plastificado the plastificado to set
     */
    public void setPlastificado(boolean plastificado) {
        this.plastificado = plastificado;
    }

    /**
     * @return the parcialuv
     */
    public boolean isParcialuv() {
        return parcialuv;
    }

    /**
     * @param parcialuv the parcialuv to set
     */
    public void setParcialuv(boolean parcialuv) {
        this.parcialuv = parcialuv;
    }

    /**
     * @return the barnizado
     */
    public boolean isBarnizado() {
        return barnizado;
    }

    /**
     * @param barnizado the barnizado to set
     */
    public void setBarnizado(boolean barnizado) {
        this.barnizado = barnizado;
    }
    
    
}

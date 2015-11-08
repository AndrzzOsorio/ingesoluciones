
package Codigo;

import java.util.Date;




public class Ordendetrabajo {
    
     private int id;
     private Cliente cliente;
     private String total;
     private String ajustes;
     private String observaciones;
     private String fechadeorden;
     private String fechadeentrega;
     private Produccion produccion;
     private Tiraje tiraje;
     private String elaboro;
     private String recibi;
     private int cc;

    public Ordendetrabajo() {
    }

    public Ordendetrabajo(Cliente cliente, String total, String ajustes, String observaciones, String fechadeorden, String fechadeentrega, Produccion produccion, Tiraje tiraje, String elaboro,String recibi,int cc) {
        
        this.cliente = cliente;
        this.total = total;
        this.ajustes = ajustes;
        this.observaciones = observaciones;
        this.fechadeorden = fechadeorden;
        this.fechadeentrega = fechadeentrega;
        this.produccion = produccion;
        this.tiraje = tiraje;
        this.elaboro = elaboro;
        this.recibi = recibi;
        this.cc = cc;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the ajustes
     */
    public String getAjustes() {
        return ajustes;
    }

    /**
     * @param ajustes the ajustes to set
     */
    public void setAjustes(String ajustes) {
        this.ajustes = ajustes;
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
     * @return the fechadeorden
     */
    public String getFechadeorden() {
        return fechadeorden;
    }

    /**
     * @param fechadeorden the fechadeorden to set
     */
    public void setFechadeorden(String fechadeorden) {
        this.fechadeorden = fechadeorden;
    }

    /**
     * @return the fechadeentrega
     */
    public String getFechadeentrega() {
        return fechadeentrega;
    }

    /**
     * @param fechadeentrega the fechadeentrega to set
     */
    public void setFechadeentrega(String fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    /**
     * @return the produccion
     */
    public Produccion getProduccion() {
        return produccion;
    }

    /**
     * @param produccion the produccion to set
     */
    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }

    /**
     * @return the tiraje
     */
    public Tiraje getTiraje() {
        return tiraje;
    }

    /**
     * @param tiraje the tiraje to set
     */
    public void setTiraje(Tiraje tiraje) {
        this.tiraje = tiraje;
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
     * @return the recibi
     */
    public String getRecibi() {
        return recibi;
    }

    /**
     * @param recibi the recibi to set
     */
    public void setRecibi(String recibi) {
        this.recibi = recibi;
    }

    /**
     * @return the cc
     */
    public int getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(int cc) {
        this.cc = cc;
    }
    

}
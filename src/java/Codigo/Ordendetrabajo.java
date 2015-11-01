
package Codigo;

import java.util.Date;




public class Ordendetrabajo {
    
     private int id;
     private String observaciones;
     private Date fechadeorden;
     private Date fechadeentrega;
     private Produccion produccion;
     private Cliente cliente;
     private Tiraje tiraje;

    public Ordendetrabajo() {
    }

    public Ordendetrabajo(int id, String observaciones, Date fechadeorden, Date fechadeentrega, Produccion produccion, Cliente cliente, Tiraje tiraje) {
        this.id = id;
        this.observaciones = observaciones;
        this.fechadeorden = fechadeorden;
        this.fechadeentrega = fechadeentrega;
        this.produccion = produccion;
        this.cliente = cliente;
        this.tiraje = tiraje;
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
    public Date getFechadeorden() {
        return fechadeorden;
    }

    /**
     * @param fechadeorden the fechadeorden to set
     */
    public void setFechadeorden(Date fechadeorden) {
        this.fechadeorden = fechadeorden;
    }

    /**
     * @return the fechadeentrega
     */
    public Date getFechadeentrega() {
        return fechadeentrega;
    }

    /**
     * @param fechadeentrega the fechadeentrega to set
     */
    public void setFechadeentrega(Date fechadeentrega) {
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
     
     
     
     
   
}

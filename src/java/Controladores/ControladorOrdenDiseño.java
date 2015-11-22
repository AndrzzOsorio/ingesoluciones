/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Codigo.Material;
import Codigo.Montaje;
import Codigo.Ordendiseño;
import Codigo.Tinta;
import DB.OracleConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author 4NDR35
 */
public class ControladorOrdenDiseño {
    OracleConnection obj;

    public ControladorOrdenDiseño() {
    }
    
    public boolean registrar(Ordendiseño od){
        
        obj = new OracleConnection();
        obj.connect();
        boolean ingreso = false;
        String sql;

        try {
 //-----------------------------------------CLIENTE DISEÑO--------------------------------------------------------------

            //primero de la orden de trabajo se ingresa la orden de talonario         
            sql = "INSERT INTO CLIENTEDISENO VALUES(?,?,?,?)";
            PreparedStatement stmt = obj.getCon().prepareStatement(sql);
             
            stmt.setInt(1, od.getCliente().getNit());
            stmt.setString(2,od.getCliente().getNombre() );
            stmt.setString(3,od.getCliente().getTelefono());
            stmt.setString(4,od.getCliente().getEmail() );
            stmt.executeUpdate();

    //-------------------------------PRODUCCION DISEÑO-------------------------------------------------------------        
            sql = "INSERT INTO PRODUCCIONDISENO VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            stmt = obj.getCon().prepareStatement(sql);
            stmt.setNull(1, OracleTypes.NUMBER);
            stmt.setString(2, od.getPreproduccion().getReferencia());
            stmt.setInt(3, od.getPreproduccion().getCantidad());
            stmt.setString(4, od.getPreproduccion().getMaterial());
            stmt.setString(5, od.getPreproduccion().getMacula());
            stmt.setInt(6, od.getPreproduccion().getNumplanchas());
            stmt.setString(7, od.getPreproduccion().getObservaciones());
            stmt.setString(8, od.getPreproduccion().getElaboro());
            stmt.setString(9, od.getPreproduccion().getRecibiconforme());
            stmt.setInt(10, od.getPreproduccion().getCedula());
            stmt.setString(11, od.getPreproduccion().getFechaentrega());
            
           
             stmt.executeUpdate();

    //-------------------------------TINTA----------------------------------------------------------------        
            
             
             
             for (Tinta tin : od.getPreproduccion().getTintas()) {
                sql = "INSERT INTO TINTA VALUES(?)";
                stmt = obj.getCon().prepareStatement(sql);
                stmt.setString(1, tin.getNombre());
                stmt.executeUpdate();
            }
             
            for (Tinta tin : od.getTintas()) {
                sql = "INSERT INTO TINTA VALUES(?)";
                stmt = obj.getCon().prepareStatement(sql);
                stmt.setString(1, tin.getNombre());
                stmt.executeUpdate();
            }

    //------------------------------------ORDEN DISENO---------------------------------------------------------------        
            Statement consulta = obj.getCon().createStatement();
            ResultSet rs = consulta.executeQuery("SELECT MAX(ID) FROM PRODUCCIONDISENO");
            int Idproduccion = 0;
            while (rs.next()) {
                Idproduccion= rs.getInt(1);
            }
            rs.close();
            
            
            sql = "INSERT INTO ORDENDISENO VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = obj.getCon().prepareStatement(sql);
            
            stmt.setNull(1, OracleTypes.NUMBER);
            stmt.setString(2, od.getFechacreacion());
            stmt.setString(3, od.getReferencia());
            stmt.setInt(4, od.getCantidad());
            stmt.setString(5, od.getMontaje());
            stmt.setString(6, od.getDescripcion());
            stmt.setInt(7, od.getMuestraimpresa());
            stmt.setInt(8, od.getDD());
            stmt.setInt(9, od.getCorreo());
            stmt.setInt(10, od.getCDDVD());
            stmt.setInt(11, od.getOtro());
            stmt.setString(12, od.getTamaño());
            stmt.setInt(13, od.getCliente().getNit());
            stmt.setInt(14, Idproduccion);
           
            stmt.executeUpdate();        
            

    //---------------------------------ORDEN DISENO TINTA-----------------------------------------------------------------------           
       
            consulta = obj.getCon().createStatement();
            rs = consulta.executeQuery("SELECT MAX(ID) FROM ORDENDISENO");
            int Idod = 0;
            while (rs.next()) {
                Idod= rs.getInt(1);
            }
            rs.close();
            
             for (Tinta tin : od.getTintas()) {
                sql = "INSERT INTO TINTA_ORDENDISENO VALUES(?,?)";
                stmt = obj.getCon().prepareStatement(sql);
                
                stmt.setInt(1, Idod);
                stmt.setString(2, tin.getNombre());
                
                stmt.executeUpdate();
            }
             
             
        //---------------------------------PRODUCCIONDISENO TINTA-----------------------------------------------------------------------           
       
         
            
             for (Tinta tin :od.getPreproduccion().getTintas()) {
                sql = "INSERT INTO TINTA_PREPRODUCCION VALUES(?,?)";
                stmt = obj.getCon().prepareStatement(sql);
                
                stmt.setInt(1, Idproduccion);
                stmt.setString(2, tin.getNombre());
                
                stmt.executeUpdate();
            }
            
            
        
            
            obj.cerrar();
            
    //-------------------------------------------------------------------------------------------------------------        
            ingreso = true;

        } catch (java.sql.SQLException e) {
            System.err.println(e);
            
            System.exit(-1);
        }
        return ingreso;
        
        
        
    }
}

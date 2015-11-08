/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Codigo.*;
import DB.OracleConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

/**
 *
 * @author Dell N4050
 */
public class ControladorOrdenTrabajo {

    OracleConnection obj;

    public ControladorOrdenTrabajo() {
    }
// este metodo  es el que se encarga de controlar todas las operaciones relacionadas con el registro
// de una orden de trabajo en la base de datos, el resgistro se hace por partes y primero se recibe la
// orden de trabajo como un objeto completo.

    public boolean registrar(Ordendetrabajo or) {
        obj = new OracleConnection();
        obj.connect();
        boolean ingreso = false;
        String sql;

        try {
 //-----------------------------------------TALONARIO--------------------------------------------------------------

            //primero de la orden de trabajo se ingresa la orden de talonario         
            sql = "INSERT INTO ORDENTALONARIO VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = obj.getCon().prepareStatement(sql);
            stmt.setNull(1, OracleTypes.NUMBER);
            stmt.setInt(2, or.getProduccion().getTalonario().getNumerotalonarios());
            stmt.setInt(3, or.getProduccion().getTalonario().getNumeradodeinicio());
            stmt.setInt(4, or.getProduccion().getTalonario().getNumeradofin());
            stmt.setInt(5, or.getProduccion().getTalonario().getPerforado());
            stmt.setInt(6, or.getProduccion().getTalonario().getTroquelado());
            stmt.setInt(7, or.getProduccion().getTalonario().getGrafado());
            stmt.setInt(8, or.getProduccion().getTalonario().getPlastificado());
            stmt.setInt(9, or.getProduccion().getTalonario().getParcialuv());
            stmt.setInt(10, or.getProduccion().getTalonario().getBarnizado());
            stmt.setString(11, or.getProduccion().getTalonario().getTinta().getNombre());
            stmt.executeUpdate();

    //-------------------------------CLIENTE-------------------------------------------------------------        
            sql = "INSERT INTO CLIENTE VALUES(?,?,?)";
            stmt = obj.getCon().prepareStatement(sql);
            stmt.setInt(1, or.getCliente().getNit());
            stmt.setString(2, or.getCliente().getNombre());
            stmt.setString(3, or.getCliente().getTelefono());
            stmt.executeUpdate();

    //-------------------------------TIRAJE----------------------------------------------------------------        
            sql = "INSERT INTO TIRAJE VALUES(?,?,?,?,?,?,?,?,?,?)";
            stmt = obj.getCon().prepareStatement(sql);
            stmt.setNull(1, OracleTypes.NUMBER);
            stmt.setString(2, or.getTiraje().getReferencia());
            stmt.setInt(3, or.getTiraje().getCantidad());
            stmt.setString(4, or.getTiraje().getMaquina());
            stmt.setString(5, or.getTiraje().getMacula());
            stmt.setInt(6, or.getTiraje().getNumeroplanchas());
            stmt.setString(7, or.getTiraje().getObservaciones());
            stmt.setString(8, or.getTiraje().getMaterial().getNombre());
            stmt.setString(9, or.getTiraje().getCliente());
            stmt.setString(10, or.getTiraje().getTelefono());
            stmt.executeUpdate();

    //--------------------------------TINTA-------------------------------------------------------------------        
            for (Tinta tin : or.getProduccion().getTinta()) {
                sql = "INSERT INTO TINTA VALUES(?)";
                stmt = obj.getCon().prepareStatement(sql);
                stmt.setString(1, tin.getNombre());
                stmt.executeUpdate();
            }

    //---------------------------------PRODUCCION-----------------------------------------------------------------------           
            //primero se obtiene el identificador de el ultimo talonario ingresado para ser ingresado en la produccion            
            Statement consulta = obj.getCon().createStatement();
            ResultSet rs = consulta.executeQuery("SELECT MAX(ID) FROM ORDENTALONARIO");
            int Idtalonario = 0;
            while (rs.next()) {
                Idtalonario = rs.getInt(1);
            }
            rs.close();

            sql = "INSERT INTO PRODUCCION VALUES(?,?,?,?,?,?,?,?,?)";
            stmt = obj.getCon().prepareStatement(sql);
            stmt.setNull(1, OracleTypes.NUMBER);
            stmt.setString(2, or.getProduccion().getReferencia());
            stmt.setInt(3, or.getProduccion().getCantidad());
            stmt.setInt(4, or.getProduccion().getMuestraimpresa());
            stmt.setString(5, or.getProduccion().getMaquina());
            stmt.setInt(6, or.getProduccion().getNumerodeplanchas());
            stmt.setInt(7, or.getProduccion().getMetalicas());
            stmt.setInt(8, or.getProduccion().getElectros());
            stmt.setInt(9, Idtalonario);
            stmt.executeUpdate();

    //-----------------------------MONTAJE-MATERIAL-TINTA------------------------------------------------------------------
            //se selecciona el id de la ultima produccion para ingresarla junto con el montaje para ser ingresados
            //en la tabla que representa su cardinalidad en la base de datos y de igual manera con le material Y
            //por ultimos las tintas
            consulta = obj.getCon().createStatement();
            rs = consulta.executeQuery("SELECT MAX(ID) FROM PRODUCCION");
            int Idproduccion = 0;
            while (rs.next()) {
                Idproduccion = rs.getInt(1);
            }
            rs.close();

            for (Montaje mon : or.getProduccion().getMontaje()) {
                String sqlintermedia = "INSERT INTO PRODUCCION_MONTAJE VALUES(?,?,?)";
                String sqlmontaje = "INSERT INTO MONTAJE VALUES(?)";
                PreparedStatement stmtIntermedia = obj.getCon().prepareStatement(sqlintermedia);
                PreparedStatement stmtMontaje = obj.getCon().prepareStatement(sqlmontaje);
                stmtMontaje.setString(1, mon.getNombre());
                stmtMontaje.executeUpdate();
                stmtIntermedia.setInt(1, Idproduccion);
                stmtIntermedia.setString(2, mon.getNombre());
                stmtIntermedia.setString(3, mon.getCorteinicial());
                stmtIntermedia.executeUpdate();
            }

            for (Material mat : or.getProduccion().getMaterial()) {
                String sqlintermedia = "INSERT INTO PRODUCCION_MATERIAL VALUES(?,?,?)";
                String sqlmaterial = "INSERT INTO MATERIAL VALUES(?)";
                PreparedStatement stmtIntermedia = obj.getCon().prepareStatement(sqlintermedia);
                PreparedStatement stmtMaterial = obj.getCon().prepareStatement(sqlmaterial);
                stmtMaterial.setString(1, mat.getNombre());
                stmtMaterial.executeUpdate();
                stmtIntermedia.setInt(1, Idproduccion);
                stmtIntermedia.setString(2, mat.getNombre());
                stmtIntermedia.setInt(3, mat.getNumerodepliegos());
                stmtIntermedia.executeUpdate();
            }

            for (Tinta tin : or.getProduccion().getTinta()) {
                sql = "INSERT INTO PRODUCCION_TINTA VALUES(?,?)";
                stmt = obj.getCon().prepareStatement(sql);
                stmt.setInt(1, Idproduccion);
                stmt.setString(2, tin.getNombre());
                stmt.executeUpdate();
            }
    //--------------------------------ORDEN DE TRABAJO-------------------------------------------------------------
       //se selecciona el ultimo tiraje que fue creado anteriormente para ser ingresado con la orden de trabajo final
            
            consulta = obj.getCon().createStatement();
            rs = consulta.executeQuery("SELECT MAX(ID) FROM TIRAJE");
            int Idtiraje = 0;
            while (rs.next()) {
                Idtiraje = rs.getInt(1);
            }
            rs.close();

            sql = "INSERT INTO ORDENTRABAJO VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            stmt = obj.getCon().prepareStatement(sql);
            stmt.setNull(1, OracleTypes.NUMBER);
            stmt.setString(2, or.getFechadeorden());
            stmt.setString(3, or.getFechadeentrega());
            stmt.setString(4, or.getObservaciones());
            stmt.setInt(5, Idproduccion);
            stmt.setInt(6, or.getCliente().getNit());
            stmt.setInt(7, Idtiraje);
            stmt.setString(8, or.getAjustes());
            stmt.setString(9, or.getElaboro());
            stmt.setString(10, or.getRecibi());
            stmt.setInt(11, or.getCc());
            stmt.executeUpdate();
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

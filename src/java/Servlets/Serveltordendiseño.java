/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


import Codigo.*;
import Controladores.ControladorOrdenDiseño;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 4NDR35
 */
public class Serveltordendiseño extends HttpServlet {
 
    private LinkedList<Tinta> tintasdiseño = new LinkedList<>();
    private LinkedList<Tinta> tintasproduccion = new LinkedList<>();
    private ControladorOrdenDiseño control;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        control = new ControladorOrdenDiseño();


//----------------------------------------------------------CLIENTE-----------------------------------------------------------------------------------------------------------------------------------        
//   se crea el cliente en base a los datos obtenido en la interfaz       
         Clientediseño cli = new Clientediseño(request.getParameter("cliente"),request.getParameter("email"),Integer.parseInt(request.getParameter("telefono")),
                                               Integer.parseInt(request.getParameter("nit")));

//-----------------------------------------------------------PRODUCCION-DISEÑO---------------------------------------------------------------------------------------------------------------------------------------------------------
         
//con los parametros establecidos anteriormente se construye la prduccion
//primero se contruye el listado de tintas que tendrá la produccion       
        int a  = Integer.parseInt(request.getParameter("contadortin00"));
        for (int i = 0; i <= a; i++) {
              if (!(request.getParameter("tintas0" + i).equals(""))) {
            tintasproduccion.add(new Tinta(request.getParameter("tintas0"+i)));
        }} 
         Producciondiseño pro = new Producciondiseño(request.getParameter("referenciaproduccion"), Integer.parseInt(request.getParameter("cantidad")), request.getParameter("material"),
                                   request.getParameter("macula"), tintasproduccion, Integer.parseInt(request.getParameter("planchas")), request.getParameter("observaciones"),
                                   request.getParameter("fechaentrega"), request.getParameter("elaboro"), request.getParameter("conforme"), Integer.parseInt(request.getParameter("cc")));
       
////-----------------------------------------------------------ORDEN DE DISEÑO-----------------------------------------------------------------------------------------------------------------        
//
//// ahora con todos los datos recolectados anteriormente se contruye la orden de diseño completa
         int b  = Integer.parseInt(request.getParameter("contadortin0"));
        for (int i = 0; i <= b; i++) {
              if (!(request.getParameter("tintas" + i).equals(""))) {
            tintasdiseño.add(new Tinta(request.getParameter("tintas"+i)));
        }}
           Ordendiseño or  = new Ordendiseño(request.getParameter("referenciadiseño"), muestra(request.getParameter("muestraimpresa")), Integer.parseInt(request.getParameter("cantidad")), 
                               request.getParameter("montaje"), request.getParameter("tamaño"), tintasdiseño,conversion(request.getParameter("DD")),conversion(request.getParameter("correo")),
                               conversion(request.getParameter("CDDVD")),conversion(request.getParameter("otro")),request.getParameter("descripcion"),cli,pro);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
        String confirmacion = "Ha ocurrido un problema y su orden de trabajo no ha podido ser registrada";

        if(control.registrar(or)){
            confirmacion = "La orden de trabajo con referencia "+or.getPreproduccion().getReferencia()+" ha sido registrada exitosamente en la base de datos";
        }
        
        
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +confirmacion+ "</h1>");
            out.println("<input type=\"button\" value=\"Regresar\" onclick=\"location.href='index.html'\">");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    //este metodo se usa para convertir el valor de cadena que envian los checkbox
    public int conversion(String s) {
        int x = 0;
        if (s == null) {
            return x = 0;
        } else {
            return x = 1;
        }
    }
    //este metodo se usa para la seccion de muestra impresa retorna la desicion en forma de entero con respecto a la seleccion de los checkbox

    public int muestra(String s) {
        int x = 0;
        if (s.equals("Si")) {
            return x = 1;
        } else {
            return x = 0;
        }
    }
}

package Servlets;

import Codigo.*;
import Controladores.ControladorOrdenTrabajo;
import DB.OracleConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @author 4NDR35
 */
public class Servlet extends HttpServlet {

    private LinkedList<Montaje> mont = new LinkedList<>();
    private LinkedList<Tinta> tintastiraje = new LinkedList<>();
    private LinkedList<Material> mat = new LinkedList<>();
    private LinkedList<Tinta> tintasproduccion = new LinkedList<>();
    private ControladorOrdenTrabajo control;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        control = new ControladorOrdenTrabajo();

////----------------------------------------------------------TALONARIO----------------------------------------------------------------------------------------------------------------------------------        
//
//   se crea el objeto talonario con los parametros que se ingresan 
//   en el formulario con respecto a la seccion de talonario.
    OrdenTalonario ot = new OrdenTalonario(Integer.parseInt(request.getParameter("talonario")), Integer.parseInt(request.getParameter("del")), Integer.parseInt(request.getParameter("al")),
                new Tinta(request.getParameter("tinta")), conversion(request.getParameter("perforado")), conversion(request.getParameter("troquelado")), conversion(request.getParameter("grafado")),
                conversion(request.getParameter("plastificado")), conversion(request.getParameter("parcialuv")), conversion(request.getParameter("barnizado")));

//----------------------------------------------------------CLIENTE-----------------------------------------------------------------------------------------------------------------------------------        
//   se crea el cliente en base a los datos obtenido en la interfaz       
         Cliente cli = new Cliente(request.getParameter("cliente"),request.getParameter("telefono"), Integer.parseInt(request.getParameter("nit")));

////----------------------------------------------------------TIRAJE------------------------------------------------------------------------------------------------------------      
//
//// se crea la seccion de tiraje con los datos que llegan del formulario
        
        int a = Integer.parseInt(request.getParameter("contadortin2"));

        for (int i = 0; i <= a; i++) {
            if (!(request.getParameter("tin2" + i).equals(""))) {
                tintastiraje.add(new Tinta(request.getParameter("tin2" + i)));
            }
        }
        Tiraje ti = new Tiraje(request.getParameter("cliente1"), request.getParameter("telefono1"), request.getParameter("referencia1"),
                Integer.parseInt(request.getParameter("cantidad1")), request.getParameter("maquina1"),
                new Material(request.getParameter("material")), tintastiraje, request.getParameter("macula"),
                Integer.parseInt(request.getParameter("numplancha1")), request.getParameter("observaciones"));

////-----------------------------------------------------------MONTAJE-----------------------------------------------------------------
//
////se crea la lista de montajes designados que seran añadidos al momento de crear la produccion
          int b = Integer.parseInt(request.getParameter("contadormontaje"));
          for (int i = 0; i <= b; i++) {
              if (!(request.getParameter("montaje" + i).equals(""))) {
            mont.add(new Montaje(request.getParameter("montaje"+i), request.getParameter("cinicial"+i)));
        }}

////-----------------------------------------------------------MATERIAL----------------------------------------------------------------------        
//
////se crea la lista de materiales designados que seran añadidos al momento de crear la produccion            
           int c = Integer.parseInt(request.getParameter("contadormaterial"));
           for (int i = 0; i <= c; i++) {
                  if (!(request.getParameter("material" + i).equals(""))) {
               mat.add(new Material(request.getParameter("material"+i), Integer.parseInt(request.getParameter("numpliegos"+i))));
           }}
//
////-----------------------------------------------------------PRODUCCION-----------------------------------------------------------------------------------        
//
//con los parametros establecidos anteriormente se construye la prduccion
//primero se contruye el listado de tintas que tendrá la produccion        
        int d  = Integer.parseInt(request.getParameter("contadortin1"));
        for (int i = 0; i <= d; i++) {
              if (!(request.getParameter("tin" + i).equals(""))) {
            tintasproduccion.add(new Tinta(request.getParameter("tin"+i)));
        }}
           Produccion pr = new Produccion(request.getParameter("referencia"), muestra(request.getParameter("muestraimpresa")), Integer.parseInt(request.getParameter("cantidad")), 
                               request.getParameter("maquina"), mat, mont, tintasproduccion,Integer.parseInt(request.getParameter("planchas")), 
                               conversion(request.getParameter("electros")), conversion(request.getParameter("metalicos")), ot);
////-----------------------------------------------------------ORDEN DE TRABAJO------------------------------------------------------------------------------------------------------------------        
//
//// ahora con todos los datos recolectados anteriormente se contruye la orden de trabajo completa
        Ordendetrabajo or = new Ordendetrabajo(cli,request.getParameter("total"), request.getParameter("ajustes"),
                                 request.getParameter("observaciones"),request.getParameter("fechae") , 
                                 request.getParameter("fechaentrega"), pr, ti,request.getParameter("elaboro"),request.getParameter("conforme"),
                                 Integer.parseInt(request.getParameter("cc")));
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
        String confirmacion = "Ha ocurrido un problema y su orden de trabajo no ha podido ser registrada";

        if(control.registrar(or)){
            confirmacion = "La orden de trabajo con referencia "+or.getProduccion().getReferencia()+" ha sido registrada exitosamente en la base de datos";
        }
        
        
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +confirmacion+ "</h1>");
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

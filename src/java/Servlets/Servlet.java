package Servlets;

import Codigo.*;
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
public class Servlet extends HttpServlet {

    private LinkedList<Montaje> mont = new LinkedList<>();
    private LinkedList<Tinta> tintastiraje = new LinkedList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

//----------------------------------------------------------TALONARIO----------------------------------------------------------------------------------------------------------------------------------        
//   se crea el objeto talonario con lo aprametros que se ingresan 
//   en el formulario con respecto a la seccion de talonario.
//    OrdenTalonario ot = new OrdenTalonario(Integer.parseInt(request.getParameter("talonario")), Integer.parseInt(request.getParameter("del")), Integer.parseInt(request.getParameter("al")),
//                new Tinta(request.getParameter("tinta")), conversion(request.getParameter("perforado")), conversion(request.getParameter("troquelado")), conversion(request.getParameter("grafado")),
//                conversion(request.getParameter("plastificado")), conversion(request.getParameter("parcialuv")), conversion(request.getParameter("barnizado")));
//----------------------------------------------------------CLIENTE-----------------------------------------------------------------------------------------------------------------------------------        
//   se crea el cliente en base a los datos obtenido en la interfaz       
        //  Cliente cli = new Cliente(request.getParameter("cliente"), Integer.parseInt(request.getParameter("telefono")), Integer.parseInt(request.getParameter("nit")));
//----------------------------------------------------------TIRAJE------------------------------------------------------------------------------------------------------------      
// se crea la seccion de tiraje con los datos que llegan del formulario
//        int a = Integer.parseInt(request.getParameter("contadortin2"));
//        for (int i = 0; i <= a; i++) {
//            tintastiraje.add(new Tinta(request.getParameter("tin2" + i)));
//        }
//        Tiraje ti = new Tiraje(request.getParameter("cliente1"), request.getParameter("telefono1"), request.getParameter("referencia1"),
//                Integer.parseInt(request.getParameter("cantidad1")), request.getParameter("maquina1"),
//                new Material(request.getParameter("material1")), tintastiraje, request.getParameter("macula"),
//                Integer.parseInt(request.getParameter("numplancha1")), request.getParameter("observaciones"));

        
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + "</h1>");
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

    public int conversion(String s) {
        int x = 0;
        if (s == null) {
            return x = 0;
        } else {
            return x = 1;
        }
    }

}

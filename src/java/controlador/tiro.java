/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Tiro;
import modelo.Utilidades;

/**
 *
 * @author DAW202
 */
@WebServlet(name = "tiro", urlPatterns = {"/tiro"})
public class tiro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tiro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tiro at " + request.getContextPath() + "</h1>");
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
        ArrayList<String> angulos = Utilidades.getAngulos();
        request.setAttribute("angulos", angulos);
        request.getRequestDispatcher("tiro.jsp").forward(request, response);
        
        
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
        
        int velocidad, angulo;
        
        if ( request.getParameter("velocidad")!="" ) {
            velocidad = Integer.parseInt(request.getParameter("velocidad"));
        } else {
            velocidad=0;
        }
        if ( request.getParameter("angulo")!=null ) {
            angulo = Integer.parseInt(request.getParameter("angulo"));
        } else {
            angulo = 10;
        }
        
        Tiro tiro = new Tiro(velocidad, angulo);
        
        ArrayList<String> angulos = Utilidades.getAngulos();
        request.setAttribute("angulos", angulos);
        request.setAttribute("tiro", tiro);
        request.setAttribute("velocidad", velocidad);
        request.setAttribute("angulo", angulo);
        request.getRequestDispatcher("tiro.jsp").forward(request, response);
        
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

}

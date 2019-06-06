/*
    Dylan Andres Candela Rodriguez
Paginas de ayuda para la Practica 

https://www.youtube.com/watch?v=kxOXIVhNbvE
http://pdf.coreservlets.com/?fbclid=IwAR12lljKz-FpmtVa3JHpMb8f48eTZXqOUu30rvoqxObWeRI3_oII7ssFJq0
Presentacion 06 y 07  del Profesor :  Romeo A.Sanchez- Practica 5 y 6 //Cookies y Session
http://www.forosdelweb.com/f45/variables-sesion-jsp-primera-vez-235477/
https://javiergarciaescobedo.es/despliegue-de-aplicaciones-web/86-servidores-de-aplicaciones/308-introduccion-a-jsp-a-traves-de-ejemplos

*/
package Controlador;

import Cliente.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Register extends HttpServlet {
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
        String usuario = request.getParameter("usuario");
        String password=request.getParameter("password");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("username", usuario);
        sesion.setAttribute("password", password);
        response.sendRedirect("index.jsp"); 
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

}
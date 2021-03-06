/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import fabricas.FabricaAbstracta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;

/**
 *
 * @author Invitado
 */
public class MiServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
       
        String bntSeleccionado = "", arma, escudo, cuerpo,montura;
        Cliente cliente = new Cliente();
        bntSeleccionado = request.getParameter("boton");// se obtiene info del boton seleccionado en html
        
        cliente.personaje(bntSeleccionado);//se envia informacion al cliente del personaje selecionado
        
        arma = cliente.arma();// se recibe un string con el arma del personaje seleccionado
        cuerpo = cliente.cuerpo();// se recibe un string con el cuerpo del personaje seleccionado
        escudo = cliente.escudo();// se recibe un string con el escudo del personaje seleccionado
        montura = cliente.montura();// se recibe un string con la montura del personaje seleccionado
        
        request.getSession().setAttribute("Arma", arma);
        request.getSession().setAttribute("Cuerpo", cuerpo);
        request.getSession().setAttribute("Escudo", escudo);
        request.getSession().setAttribute("Montura", montura);
        request.getSession().setAttribute("Fabrica", bntSeleccionado);
        response.sendRedirect("personaje.jsp");

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import back.dao.GenericDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Materiel;
import model.Style;
import model.Unites;
import model.Volume;
import model.Volume_materiel;
import utils.Connect;

/**
 *
 * @author Kyle
 */
public class Charge extends HttpServlet {

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
            out.println("<title>Servlet Charge</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Charge at " + request.getContextPath() + "</h1>");
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
        Connect conn = null;
        RequestDispatcher dispatcher=request.getRequestDispatcher("Choix.jsp");
        Materiel materiel = new Materiel();
        Style style = new Style();
        try{
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
            ArrayList<Object> listeMateriel = GenericDAO.selectAll(materiel, conn);
            ArrayList<Object> listeStyle = GenericDAO.selectAll(style, conn);
            request.setAttribute("ListMateriel", listeMateriel);
            request.setAttribute("ListStyle", listeStyle);
        }
        catch(Exception e){
            e.printStackTrace();
            dispatcher = request.getRequestDispatcher("VEUILLEZ INSERER SVP!!!");
            request.setAttribute("erreur", e.getMessage());
        }
        finally{
            try
            {
                conn.forceClose();
            }
            catch(SQLException ex)
            {
                dispatcher=request.getRequestDispatcher("error.jsp");
                request.setAttribute("erreur", ex.getMessage());
            }
            finally{
                dispatcher.forward(request, response);
            }
        }
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
        Volume_materiel vm = new Volume_materiel();
        Connect conn = null;
        vm.setId_mat(request.getParameter("materiel"));
        vm.setId_style(request.getParameter("style"));
    
        try{
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
           GenericDAO.save(vm, conn);
           response.sendRedirect("Charge");
        }
        catch(Exception e){
            e.printStackTrace();
            request.setAttribute("erreur", e.getMessage());
        }finally{
            try{
                conn.forceClose();
         
            }catch(SQLException ex){
            request.setAttribute("erreur", ex.getMessage());
            }
            }
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

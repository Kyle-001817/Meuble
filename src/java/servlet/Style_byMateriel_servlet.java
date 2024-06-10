/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.V_Fabrication;
import model.V_Volume_materiel;
import utils.Connect;

/**
 *
 * @author Kyle
 */
public class Style_byMateriel_servlet extends HttpServlet {

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
            out.println("<title>Servlet Style_byMateriel_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Style_byMateriel_servlet at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        V_Volume_materiel fab = new V_Volume_materiel();
        Connect conn = null;
        String val= request.getParameter("materiel");
        RequestDispatcher dispatcher=request.getRequestDispatcher("ListStyle_byMateriel.jsp");

        
        try{
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
            request.setAttribute("ListMateriel", fab.getById(conn, val));
            List<V_Volume_materiel> listFab = fab.getById(conn, val);
//            fab.getById(conn, val);
            out.print(listFab.get(0).getQuantite());
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
            finally{
                dispatcher.forward(request, response);
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

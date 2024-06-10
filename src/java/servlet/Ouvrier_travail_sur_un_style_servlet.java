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
import model.Ouvrier;
import model.Ouvrier_travail_sur_un_style;
import model.Style;
import model.Style_Ouvrier;
import model.Volume;
import utils.Connect;

/**
 *
 * @author Kyle
 */
public class Ouvrier_travail_sur_un_style_servlet extends HttpServlet {

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
            out.println("<title>Servlet Ouvrier_travail_sur_un_style_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ouvrier_travail_sur_un_style_servlet at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher dispatcher=request.getRequestDispatcher("Ouvrier_travail_sur_un_style.jsp");
        Style materiel = new Style();
        Volume volume = new Volume();
        Ouvrier ouvrier = new Ouvrier();
        try{
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
            ArrayList<Object> listeStyle = GenericDAO.selectAll(materiel, conn);
            ArrayList<Object> listeVolume = GenericDAO.selectAll(volume, conn);
            ArrayList<Object> listeOuvrier = GenericDAO.selectAll(ouvrier, conn);
            request.setAttribute("ListStyle", listeStyle);
            request.setAttribute("ListVolume", listeVolume);
            request.setAttribute("ListOuvrier", listeOuvrier);
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
        Ouvrier_travail_sur_un_style materiel = new Ouvrier_travail_sur_un_style();
        Connect conn = null;
        materiel.setId_style(request.getParameter("style"));
        materiel.setId_volume(request.getParameter("volume"));
        materiel.setId_ouvrier(request.getParameter("ouvrier"));
        materiel.setNombre(Integer.parseInt(request.getParameter("nombre")));
        System.out.println(request.getParameter("style"));
        try{
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
//           GenericDAO.save(materiel, conn);
//           response.sendRedirect("Ouvrier_travail_sur_un_style_servlet");
        }
        catch(Exception e){
            e.getMessage();
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

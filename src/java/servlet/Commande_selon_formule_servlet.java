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
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Commande_a_Fabrique;
import model.Stock;
import model.Style;
import model.V_Volume_materiel;
import model.Volume_materiel;
import utils.Connect;

/**
 *
 * @author Kyle
 */
public class Commande_selon_formule_servlet extends HttpServlet {

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
            out.println("<title>Servlet Commande_selon_formule_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Commande_selon_formule_servlet at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher dispatcher=request.getRequestDispatcher("GenererCommande.jsp");
        try
        {
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
            ArrayList<Object> listeStyle = GenericDAO.selectRequete("nom_style",conn,"select nom_style from v_volume_matiere group by nom_style order by nom_style");
            ArrayList<Object> id_style = GenericDAO.selectRequete("id_style",conn,"select id_style from v_volume_matiere group by id_style order by id_style");
            ArrayList<Object> listeVolume = GenericDAO.selectRequete("type_volume", conn, "select type_volume from v_volume_matiere group by type_volume");
            ArrayList<Object> id_volume = GenericDAO.selectRequete("id_volume", conn, "select id_volume from v_volume_matiere group by id_volume order by id_volume");

            request.setAttribute("ListStyle", listeStyle);
            request.setAttribute("id_style", id_style);
            request.setAttribute("ListVolume", listeVolume);
            request.setAttribute("id_volume", id_volume);
            
            //Test
//            V_Volume_materiel c = new V_Volume_materiel();
//            Stock s = new Stock();
//            s.SelectSommeStock(conn, "MAT1");
//            c.traitement_Fabrication(conn, "STYLE1", "VOL1", 40);
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
        Commande_a_Fabrique vm = new Commande_a_Fabrique();
        V_Volume_materiel v = new V_Volume_materiel();
        Connect conn = null;
        String error = "Tsaaa mety";
        String style = request.getParameter("style");
        String volume = request.getParameter("volume");
        double quantite = Double.parseDouble(request.getParameter("quantite"));
        vm.setId_style(style);
        vm.setType_volume(volume);
        vm.setQuantite(quantite);
        try{
            conn = new Connect();
            conn.getConnection();
            conn.setuses(true);
            if(v.traitement_Fabrication(conn, style, volume, quantite) == true)
            {
                
                GenericDAO.save(vm, conn);
                response.sendRedirect("AffichageCommande_a_fabriquer");
            }
            else{
                response.sendRedirect("Commande_selon_formule_servlet");
            }
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

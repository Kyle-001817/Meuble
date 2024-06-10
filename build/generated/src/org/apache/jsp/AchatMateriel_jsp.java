package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.*;

public final class AchatMateriel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 List<Materiel> list = (List<Materiel>)request.getAttribute("ListMateriel");
      out.write('\n');
 List<Unites> liste = (List<Unites>)request.getAttribute("ListeUnite");
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home/Header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Header Start -->\n");
      out.write("    <div class=\"container-fluid page-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 400px\">\n");
      out.write("                <h3 class=\"display-4 text-white text-uppercase\">ACHAT MATERIEL</h3>\n");
      out.write("                <div class=\"d-inline-flex text-white\">\n");
      out.write("                    <p class=\"m-0 text-uppercase\"><a class=\"text-white\" href=\"\">Insertion Achat materiels</a></p>\n");
      out.write("                    <i class=\"fa fa-angle-double-right pt-1 px-3\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Header End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Booking Start -->\n");
      out.write("    <div class=\"container-fluid booking mt-5 pb-5\">\n");
      out.write("        <div class=\"container pb-5\">\n");
      out.write("            <div class=\"bg-light shadow\" style=\"padding: 30px;\">\n");
      out.write("                <div class=\"row align-items-center\" style=\"min-height: 60px;\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form action=\"Achat_materiel_servlet\" method=\"post\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <div class=\"mb-3 mb-md-0\">\n");
      out.write("                                        <select class=\"custom-select px-4\" name=\"materiel\" style=\"float: left; height: 47px; width: 500px;\">\n");
      out.write("                                            ");
for(int i=0; i<list.size(); i++){
      out.write("\n");
      out.write("                                            <option selected>Materiel</option>\n");
      out.write("                                            <option value=\"");
out.print(((Materiel)list.get(i)).getId_mat());
      out.write('"');
      out.write('>');
out.print(((Materiel)list.get(i)).getNom());
      out.write("</option>\n");
      out.write("                                            ");
 } 
      out.write("\n");
      out.write("                   \n");
      out.write("                                            \n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <div class=\"mb-3 mb-md-0\">\n");
      out.write("                                        <div class=\"date\" style=\"float: left; height: 47px; width: 500px; margin-top: 50px;\" id=\"date1\" data-target-input=\"nearest\">\n");
      out.write("                                            <input type=\"number\" class=\"form-control p-4 datetimepicker-input\" placeholder=\"Quantite\" name=\"quantite\" data-target=\"#date1\" data-toggle=\"datetimepicker\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <div class=\"mb-3 mb-md-0\">\n");
      out.write("                                        <select class=\"custom-select px-4\" name=\"unite\" style=\"float: left; height: 47px; width: 500px; margin-top: 50px;\">\n");
      out.write("                                            ");
for(int i=0; i<liste.size(); i++){
      out.write("\n");
      out.write("                                            <option value=\"");
out.print(((Unites)liste.get(i)).getId_unite());
      out.write('"');
      out.write('>');
out.print(((Unites)liste.get(i)).getNom());
      out.write("</option>\n");
      out.write("                                            ");
 } 
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                        \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"height: 47px; margin-top: -2px;\">Valider</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Booking End -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home/Footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Commande_a_Fabrique;
import model.V_Volume_materiel;
import java.util.List;

public final class Liste_005fcommande_005fa_005ffabriquer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home/Header.jsp", out, false);
      out.write('\n');
      out.write('\n');
 List<Commande_a_Fabrique> listFabrication = (List<Commande_a_Fabrique>)request.getAttribute("Liste_commande_a_fabriquer");
      out.write("\n");
      out.write("        <div style=\"width:500px; text-align: center; margin-top: 100px; margin-left: 350px; border-radius: 15px; border: none; box-shadow: 5px 5px 20px 1px gray; \">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Style</th>\n");
      out.write("                    <th>Quantite</th>\n");
      out.write("                    <th>Volume</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
for(int i=0; i<listFabrication.size(); i++){
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
 out.print(listFabrication.get(i).getId_style()); 
      out.write("</td>\n");
      out.write("                        <td>");
 out.print(listFabrication.get(i).getQuantite()); 
      out.write("</td>\n");
      out.write("                        <td>");
 out.print(listFabrication.get(i).getType_volume()); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home/Footer.jsp", out, false);
      out.write('\n');
      out.write('\n');
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

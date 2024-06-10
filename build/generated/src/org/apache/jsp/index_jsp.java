package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home/Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Carousel Start -->\n");
      out.write("    <div class=\"container-fluid p-0\">\n");
      out.write("        <div id=\"header-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"w-100\" src=\"Assets/img/carousel-1.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-md-3\">DU DESIGNER A  LA FABRICATION:</h4>\n");
      out.write("                            <h1 class=\"display-3 text-white mb-md-4\">VOTRE MEUBLE SUR MESURE</h1>\n");
      out.write("                            <a href=\"\" class=\"btn btn-primary py-md-3 px-md-5 mt-2\">COMMENCER</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"w-100\" src=\"Assets/img/carousel-2.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-md-3\">DU DESIGNER A  LA FABRICATION:</h4>\n");
      out.write("                            <h1 class=\"display-3 text-white mb-md-4\">VOTRE MEUBLE SUR MESURE</h1>\n");
      out.write("                            <a href=\"\" class=\"btn btn-primary py-md-3 px-md-5 mt-2\">COMMENCER</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"w-100\" src=\"Assets/img/meuble_2.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-md-3\">DU DESIGNER A  LA FABRICATION:</h4>\n");
      out.write("                            <h1 class=\"display-3 text-white mb-md-4\">VOTRE MEUBLE SUR MESURE</h1>\n");
      out.write("                            <a href=\"\" class=\"btn btn-primary py-md-3 px-md-5 mt-2\">COMMENCER</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"w-100\" src=\"Assets/img/meuble_3.jpg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 900px;\">\n");
      out.write("                            <h4 class=\"text-white text-uppercase mb-md-3\">DU DESIGNER A  LA FABRICATION:</h4>\n");
      out.write("                            <h1 class=\"display-3 text-white mb-md-4\">VOTRE MEUBLE SUR MESURE</h1>\n");
      out.write("                            <a href=\"\" class=\"btn btn-primary py-md-3 px-md-5 mt-2\">COMMENCER</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#header-carousel\" data-slide=\"prev\">\n");
      out.write("                <div class=\"btn btn-dark\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon mb-n2\"></span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#header-carousel\" data-slide=\"next\">\n");
      out.write("                <div class=\"btn btn-dark\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                    <span class=\"carousel-control-next-icon mb-n2\"></span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Carousel End -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Home/Footer.jsp", out, false);
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

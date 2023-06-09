/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2023-05-02 06:37:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Oytie - Job Portal</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Signika:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light px-4 border-bottom\" id=\"navbar\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand fs-4 ps-4\" href=\"#\"><img src=\"img/oytie-326x100.png\" alt=\"\" id=\"logo\"\n");
      out.write("                        height=\"50px\"></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                    data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                    aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0 fs-4 text-center\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active text-white\" aria-current=\"page\" href=\"home.html\"\n");
      out.write("                                id=\"nav1\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"services.html\" id=\"nav1\">Services</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"client.html\" id=\"nav1\">Client</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"about_us.html\" id=\"nav1\">About Us</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item pt-3\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            \n");
      out.write("                                <button class=\"btn btn-light\">SignIn/SignUp</button>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("</body>\n");
      out.write("</header>\n");
      out.write("  <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <a class=\"btn btn-outline\" href=\"registration.jsp\" role=\"button\">Client SignIn</a>\n");
      out.write("        <a class=\"btn btn-outline\" href=\"login.jsp\" role=\"button\">Client SignUp</a>\n");
      out.write("		<hr>\n");
      out.write("        <a class=\"btn btn-outline\" href=\"registration1.jsp\" role=\"button\">Company SignIn</a>\n");
      out.write("        <a class=\"btn btn-outline\" href=\"login1.jsp\" role=\"button\">Company SignUp</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<section class=\"hero-area\">\n");
      out.write("    <class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 offset-lg-2 text-center p-3\">\n");
      out.write("                <div class=\"hero-caption\">\n");
      out.write("                    <h5 class=\"head1\">Find Your Dream Job</h5>\n");
      out.write("                    <p class=\"head2 fs-4\">More than 5 lakh+ jobs available</p>\n");
      out.write("                    <div class=\"qsbWrapper\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"qsb\">\n");
      out.write("                                <img src=\"//static.naukimg.com/s/7/103/i/search.9ec0e1ac.svg\" alt=\"\" class=\"searchIcon\">\n");
      out.write("                                <div class=\"keywordSugg\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"suggestor-wrapper active \" style=\"position: relative;\">\n");
      out.write("                                            <div class=\"suggestor-box flex-row flex-wrap bottom\">\n");
      out.write("                                                <input class=\"suggestor-input fs-5\" type=\"text\"\n");
      out.write("                                                    placeholder=\"Enter skills / designations / companies\" tabindex=\"0\"\n");
      out.write("                                                    value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pipe\"></div>\n");
      out.write("                                <div class=\"qsbExperience\">\n");
      out.write("                                    <div class=\"dropdownMainContainer\" style=\"width: 223px;\">\n");
      out.write("                                        <input type=\"text\" name=\"expereinceDD\" id=\"expereinceDD\" spellcheck=\"false\"\n");
      out.write("                                            autocomplete=\"off\" title=\"\" placeholder=\"Select experience\"\n");
      out.write("                                            class=\"ddInput nonSearched fs-5\" value=\"\">\n");
      out.write("                                        <span class=\"dropArrowDD\">Ë\n");
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"dropDownPrimaryContainer\">\n");
      out.write("                                            <div class=\"dropdownContainer \" style=\"width: auto;\">\n");
      out.write("                                                <div class=\"dropdownPrimary\"\n");
      out.write("                                                    style=\"min-width: 223px; width: auto; height: auto;\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pipe\"></div>\n");
      out.write("                                <div class=\"locationSugg\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"suggestor-wrapper active \" style=\"position: relative;\">\n");
      out.write("                                            <div class=\"suggestor-box flex-row flex-wrap bottom \">\n");
      out.write("                                                <input class=\"suggestor-input fs-5\" type=\"text\"\n");
      out.write("                                                    placeholder=\"Enter location\" tabindex=\"0\" value=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"qsbSubmit\">Search</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"about my-5\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <div>\n");
      out.write("                    <h1>Job<span class=\"text-primary\">Fields</span>\n");
      out.write("                    </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-6 col-lg-6 col-12\">\n");
      out.write("                        <img src=\"https://www.pinclipart.com/picdir/big/2-22120_clip-art-transparent-library-jobs-job-announcement-find.png\"\n");
      out.write("                            alt=\"\" width=\"300px\n");
      out.write("                                                \">\n");
      out.write("                        <h2>Discover jobs across popular roles</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-12 col-md-6 col-lg-6 col-12\"\n");
      out.write("                        style=\"box-shadow: 0 3px 8px black; border-radius: 10px;\">\n");
      out.write("                        <div class=\"row d-flex justify-content-around align-content-around\" style=\"height: 380px;\">\n");
      out.write("                            <div class=\"col-md-6 text-center\">\n");
      out.write("                                <div class=\"fields  bg-white text-center pt-3 \">\n");
      out.write("                                    Full Stack Developer\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"fields  bg-white text-center pt-3\">\n");
      out.write("                                    App Developer\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"fields  bg-white text-center pt-3\">\n");
      out.write("                                    Front End Developer\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"fields  bg-white text-center pt-3\">\n");
      out.write("                                    Devops Engineer\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"fields  bg-white text-center pt-3\">\n");
      out.write("                                    Engineering Manager\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"fields  bg-white text-center pt-3\">\n");
      out.write("                                    Technical Lead\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <div class=\"slide\">\n");
      out.write("            <marquee behavior=\"scroll\" direction=\"right\">\n");
      out.write("                <img src=\"img/MaxSecure.png\" width=\"190\" height=\"190\" alt=\"W3docs\" style=\"padding: 10px;\" />\n");
      out.write("                <img src=\"img/zencon.png\" width=\"190\" height=\"190\" alt=\"W3docs\" style=\"padding: 10px;\" />\n");
      out.write("                <img src=\"img/zensoft.png\" width=\"190\" height=\"190\" alt=\"W3docs\" style=\"padding: 10px;\" />\n");
      out.write("                <img src=\"img/RajaSoftwareLabs.png\" width=\"190\" height=\"190\" alt=\"W3docs\" style=\"padding: 10px;\" />\n");
      out.write("                <img src=\"img/Coditas.png\" width=\"190\" height=\"190\" alt=\"W3docs\" style=\"padding: 10px;\" />\n");
      out.write("            </marquee>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"footer-distributed\">\n");
      out.write("\n");
      out.write("            <div class=\"footer-left\">\n");
      out.write("\n");
      out.write("                <img src=\"img/oytie-326x100.png\" alt=\"oytie-326x100.png\" height=\"50px\">\n");
      out.write("\n");
      out.write("                <p class=\"footer-links\">\n");
      out.write("                    <a href=\"#\" class=\"link-1\">Home</a>\n");
      out.write("\n");
      out.write("                    <a href=\"services.html\">Services</a>\n");
      out.write("\n");
      out.write("                    <a href=\"#\">Client</a>\n");
      out.write("\n");
      out.write("                    <a href=\"#\">About Us</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p class=\"footer-company-name\">Oytie Â© 2022</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-center\">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <i class=\"fa fa-map-marker\"></i>\n");
      out.write("                    <p>\n");
      out.write("                        <span>FL No. 5, 2nd Floor</span>\n");
      out.write("                        S.N.15/3 Indrapushp Building, Next to Ranka Jewellers, Karve Road, Pune-411004 Maharashtra\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                    <p>+91 7030 20 0057</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <i class=\"fa fa-envelope\"></i>\n");
      out.write("                    <p>\n");
      out.write("                        <a href=\"mailto:oytie.com\">oytie.com</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-right\">\n");
      out.write("\n");
      out.write("                <p class=\"footer-company-about fs-6 text-white\">\n");
      out.write("                    <span>About the company</span>\n");
      out.write("                    Oytie is a private organization that was founded in the year 2015. Formerly named as SSOiz\n");
      out.write("                    Solutions, the company was primarily engrossed in manufacturing automation based applications with\n");
      out.write("                    related services.\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <div class=\"footer-icons\">\n");
      out.write("\n");
      out.write("                    <a href=\"#\" class=\"btn btn-social-icon btn-facebook\">\n");
      out.write("                        <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-social-icon btn-twitter\">\n");
      out.write("                        <i class=\"fab fa-twitter\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-social-icon btn-instagram\">\n");
      out.write("                        <i class=\"fab fa-instagram\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-social-icon btn-linkedin\">\n");
      out.write("                        <i class=\"fab fa-linkedin\"></i>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"job.js\"></script>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("        </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

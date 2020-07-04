package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import common.Common_Things;

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <!-- meta -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("    <!-- bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(Common_Things.url );
      out.write("/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- /bootstrap -->\r\n");
      out.write("\r\n");
      out.write("    <!-- core styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(Common_Things.url );
      out.write("/css/main.css\">\r\n");
      out.write("    <!-- /core styles -->\r\n");
      out.write("\r\n");
      out.write("    <!-- page styles -->\r\n");
      out.write("    <!-- /page styles -->\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- load modernizer -->\r\n");
      out.write("    <script src=\"");
      out.print(Common_Things.url );
      out.write("/vendor/modernizr.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction validateForm() {\r\n");
      out.write("\t\t\t\t    var x = document.forms[\"myForm\"][\"user_name\"].value;\r\n");
      out.write("\t\t\t\t    if (x==null || x==\"\") {\r\n");
      out.write("\t\t\t\t        alert(\"Please enter User Name\");\r\n");
      out.write("\t\t\t\t        return false;\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    var x = document.forms[\"myForm\"][\"password\"].value;\r\n");
      out.write("\t\t\t\t    if (x==null || x==\"\") {\r\n");
      out.write("\t\t\t\t        alert(\"Please enter Password\");\r\n");
      out.write("\t\t\t\t        return false;\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction validateForm1() {\r\n");
      out.write("\t\t\t\t    var x = document.forms[\"myForm1\"][\"admission_no\"].value;\r\n");
      out.write("\t\t\t\t    if (x==null || x==\"\") {\r\n");
      out.write("\t\t\t\t        alert(\"Please enter Admission Number\");\r\n");
      out.write("\t\t\t\t        return false;\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    var x = document.forms[\"myForm1\"][\"password\"].value;\r\n");
      out.write("\t\t\t\t    if (x==null || x==\"\") {\r\n");
      out.write("\t\t\t\t        alert(\"Please enter Password\");\r\n");
      out.write("\t\t\t\t        return false;\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t <div class=\"app-user\"> \r\n");
      out.write("\t\t\t\t        <div class=\"user-container\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

		

	
	
	
	
	 
	 
	
	 
		 

			
			
		 
		 	
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t            <section class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t                <header class=\"panel-heading\">");
      out.print(" Library Management System - MIS" );
      out.write("</header>\r\n");
      out.write("\t\t\t\t                <div class=\"bg-white user pd-lg\">\r\n");
      out.write("\t\t\t\t                    <h6>\r\n");
      out.write("\t\t\t\t                        <strong>Welcome.</strong>Sign in to get started!</h6>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t                  <form name=\"myForm\" action=\"");
      out.print(Common_Things.url );
      out.write("/admin-sign-in\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control mg-b-sm\" name=\"user_name\" placeholder=\"User Name\" autofocus >\r\n");
      out.write("\t\t\t\t                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\"  name=\"password\" >\r\n");
      out.write("\t\t\t\t                         \r\n");
      out.write("\t\t\t\t                        <div class=\"text-right mg-b-sm mg-t-sm\">\r\n");
      out.write("\t\t\t\t                            <a href=\"#\">");
      out.print("" );
      out.write("</a>\r\n");
      out.write("\t\t\t\t                        </div>\r\n");
      out.write("\t\t\t\t                        <button class=\"btn btn-info btn-block\" type=\"submit\">Sign in</button>\r\n");
      out.write("\t\t\t\t                    </form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t                   \r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t            </section>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

					String message=(String)session.getAttribute("ss_index_message");
					if(message!=null){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"alert alert-warning alert-dismissable\">\r\n");
      out.write("                                        ");
      out.print(message);
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
			session.removeAttribute("ss_index_message");
					}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

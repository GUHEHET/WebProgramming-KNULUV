/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-06-30 16:52:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1>로그인</h1>\r\n");
      out.write(" \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"email\">Email address:</label>\r\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label for=\"pwd\">Password:</label>\r\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"pwd\">\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <button type=\"button\" class=\"btn btn-default join\" onclick=\"signup(email.value, pwd.value)\">로그인</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://www.gstatic.com/firebasejs/7.15.5/firebase-app.js\"></script>\r\n");
      out.write("<script src=\"https://www.gstatic.com/firebasejs/7.15.5/firebase-analytics.js\"></script>\r\n");
      out.write("<script src=\"https://www.gstatic.com/firebasejs/7.15.5/firebase-auth.js\"></script>\r\n");
      out.write("<script src=\"https://www.gstatic.com/firebasejs/7.15.5/firebase-firestore.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  // Your web app's Firebase configuration\r\n");
      out.write("  var firebaseConfig = {\r\n");
      out.write("    apiKey: \"AIzaSyBaW4hPPV0Pdz6QoXxX1USFIijUgJhqQUg\",\r\n");
      out.write("    authDomain: \"webprogramming-df368.firebaseapp.com\",\r\n");
      out.write("    databaseURL: \"https://webprogramming-df368.firebaseio.com\",\r\n");
      out.write("    projectId: \"webprogramming-df368\",\r\n");
      out.write("    storageBucket: \"webprogramming-df368.appspot.com\",\r\n");
      out.write("    messagingSenderId: \"359102557982\",\r\n");
      out.write("    appId: \"1:359102557982:web:07aca8db80567b3d06e30f\",\r\n");
      out.write("    measurementId: \"G-4198BS2X0J\"\r\n");
      out.write("  };\r\n");
      out.write("  // Initialize Firebase\r\n");
      out.write("  firebase.initializeApp(firebaseConfig);\r\n");
      out.write("  firebase.analytics();\r\n");
      out.write("  \r\n");
      out.write("  function signup(email, pwd){\r\n");
      out.write("\t  firebase.auth().signInWithEmailAndPassword(email, pwd).then(function(user) {\r\n");
      out.write("\t\t  \tconsole.log(\"Hi~\");\r\n");
      out.write("\t      }, function(error){\r\n");
      out.write("\t    \t\t// Handle Errors here.\r\n");
      out.write("\t\t        var errorCode = error.code;\r\n");
      out.write("\t\t        var errorMessage = error.message;\r\n");
      out.write("\t\t        // [START_EXCLUDE]\r\n");
      out.write("\t\t        if (errorCode == 'auth/weak-password') {\r\n");
      out.write("\t\t          alert('The password is too weak.');\r\n");
      out.write("\t\t        } else {\r\n");
      out.write("\t\t          alert(errorMessage);\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        console.log(error);\r\n");
      out.write("\t\t        // [END_EXCLUDE]\r\n");
      out.write("\t      });\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
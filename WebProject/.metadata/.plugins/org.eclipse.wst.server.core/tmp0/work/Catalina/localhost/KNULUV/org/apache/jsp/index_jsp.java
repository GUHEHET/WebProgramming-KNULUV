/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-07-01 20:29:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/login.css?after\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>로그인</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "firebase.jsp", out, false);
      out.write("\r\n");
      out.write("\t<section class=\"login-block login\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 login-sec\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"text-center\">KNULUV</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form class=\"login-form\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\" class=\"text-uppercase\">e-mail</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputPassword1\" class=\"text-uppercase\">비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"pwd\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-check-label\"> <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-check-input\"> <small>로그인 정보 저장</small>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-login float-right\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"login(email.value, pwd.value)\">LOGIN</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"copy-text\">\r\n");
      out.write("\t\t\t\t\t\t계정이 없으신가요? <a href=\"./SignUp.jsp\">회원 가입</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 banner-sec\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"carouselExampleIndicators\" class=\"carousel slide\"\r\n");
      out.write("\t\t\t\t\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"d-block img-fluid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"./img/slide1.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"First slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"banner-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>시스템 소개</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>경북대 내 연애를 하고싶지만 기회가 되지 않는 청춘들을 위한 웹 채팅 앱입니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t학교 내의 여러 사람을 만나고, 원하는 사람과 대화하세요.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t새로운 사람과의 새로운 만남을 통해 대학 생활의 새로운 활력을 얻어보세요.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"d-block img-fluid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"./img/slide2.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"First slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"banner-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>기능 소개</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>자신의 위치를 표시하고, 교내에 위치한 다른 사람을 확인하세요.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t마음에 드는 사람을 발견하면 '채팅'버튼을 통해 그 사람과 대화할 수 있습니다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"d-block img-fluid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"./img/slide3.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"First slide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-06-30 20:58:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("\t<meta charset=\"EUC-KR\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=pg43l9dp5c\"></script>\r\n");
      out.write("\t<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("\t<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/profile.css\">\r\n");
      out.write("<title>View Other User</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"map\" style=\"width:100%; height:100vh\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\t\t\t\r\n");
      out.write("\t\t// create naver map object\r\n");
      out.write("\t\tvar map = new naver.maps.Map('map', {\r\n");
      out.write("\t\t\tcenter: new naver.maps.LatLng(35.889845, 128.6105),\r\n");
      out.write("\t        zoom: 17,\r\n");
      out.write("\t        minZoom : 17\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// marker lat,lng\r\n");
      out.write("\t\tvar latLngs = [\r\n");
      out.write("\t\t\tnew naver.maps.LatLng(35.88689, 128.608494),\r\n");
      out.write("\t        new naver.maps.LatLng(35.888154, 128.6109),\r\n");
      out.write("\t        new naver.maps.LatLng(35.88814, 128.611388),\r\n");
      out.write("\t        new naver.maps.LatLng(35.8886653, 128.6120414),\r\n");
      out.write("\t        new naver.maps.LatLng(35.8923811, 128.6094879),\r\n");
      out.write("\t        new naver.maps.LatLng(35.8915206, 128.6120736),\r\n");
      out.write("\t\t];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// home path\r\n");
      out.write("\t\tvar HOME_PATH = window.HOME_PATH || \".\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// marker array\r\n");
      out.write("\t\tvar markerList = [],\r\n");
      out.write("\t\t\tinfoWindowList = [];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// profile information\r\n");
      out.write("\t\tvar contentStr = [\r\n");
      out.write("\t\t\t'<div class=\"container\">',\r\n");
      out.write("\t\t    '<div style=\"width:400px; height:280px;\">', //  class=\"row\"\r\n");
      out.write("\t\t        '<div >', //class=\"col-xs-12 col-sm-6 col-md-6\"\r\n");
      out.write("\t\t            '<div >', //class=\"well well-sm\"\r\n");
      out.write("\t\t                '<div class=\"row\">',\r\n");
      out.write("\t\t                    '<div>', // class=\"col-sm-6 col-md-4\"\r\n");
      out.write("\t\t                        '<img src=\"http://placehold.it/380x500\" alt=\"\" width=\"200\" align=\"left\" hspace=\"5\" />', //class=\"img-rounded img-responsive\"\r\n");
      out.write("\t\t                        '<h4>Bhaumik Patel</h4>',\r\n");
      out.write("\t\t                        '<small><cite title=\"San Francisco, USA\">San Francisco, USA <i class=\"glyphicon glyphicon-map-marker\">',\r\n");
      out.write("\t\t                        '</i></cite></small>',\r\n");
      out.write("\t\t                        '<p>',\r\n");
      out.write("\t\t                            '<i class=\"glyphicon glyphicon-envelope\"></i>email@example.com',\r\n");
      out.write("\t\t                            '<br/>June 02, 1988</p>',\r\n");
      out.write("\t\t                        '<div class=\"btn-group\">',\r\n");
      out.write("\t\t                            '<button type=\"button\" class=\"btn btn-primary\">Social</button>',\r\n");
      out.write("\t\t                        '</div>',\r\n");
      out.write("\t\t                    '</div>',\r\n");
      out.write("\t\t                '</div>',\r\n");
      out.write("\t\t            '</div>',\r\n");
      out.write("\t\t        '</div>',\r\n");
      out.write("\t\t    '</div>',\r\n");
      out.write("\t\t\t'</div>'\r\n");
      out.write("\t\t].join('');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// add marker\r\n");
      out.write("\t\tfor(var i=0, ii=latLngs.length;i<ii;i++){\r\n");
      out.write("\t\t\t//var icon={\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t//\turl: \"./image/icon/black_pin.png\",\r\n");
      out.write("\t\t\t\t\t//size:new naver.maps.Size(24,37),\r\n");
      out.write("\t\t\t\t\t//anchor:new naver.maps.Point(12,37),\r\n");
      out.write("\t\t\t\t\t//origin:new naver.maps.Point(i*29,0),\r\n");
      out.write("\t\t\t//},\r\n");
      out.write("\t\t\tmarker = new naver.maps.Marker({\r\n");
      out.write("\t\t\t\tposition:latLngs[i],\r\n");
      out.write("\t\t\t\tmap:map,\r\n");
      out.write("\t\t\t\t//icon:icon,\r\n");
      out.write("\t\t\t\t//animation :naver.maps.Animation.BOUNCE,\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar infowindow = new naver.maps.InfoWindow({\r\n");
      out.write("\t\t\t\tcontent:contentStr\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmarkerList.push(marker);\r\n");
      out.write("\t\t\tinfoWindowList.push(infowindow);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmarker = null;\r\n");
      out.write("\t\t\tinfowindow = null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t// marker click function\r\n");
      out.write("\t\tfunction getClickHandler(num){\r\n");
      out.write("\t\t\treturn function(e){\r\n");
      out.write("\t\t\t\tvar marker = markerList[num],\r\n");
      out.write("\t\t\t\t\tinfoWindow = infoWindowList[num];\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(infoWindow.getMap()){\r\n");
      out.write("\t\t\t\t\tinfoWindow.close();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\tinfoWindow.open(map, marker);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// add click listener in marker\r\n");
      out.write("\t\tfor(var i=0,ii=markerList.length;i<ii;i++){\r\n");
      out.write("\t\t\tnaver.maps.Event.addListener(markerList[i], 'click', getClickHandler(i));\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
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
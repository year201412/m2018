/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-12-08 09:08:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.marketAnalysis.marketOverallAnalysis;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listStatAnalysis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1463996420000L));
    _jspx_dependants.put("jar:file:/data/wwwroot/channel-webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<title>整体分析</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap.min.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap-theme.min.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap-table/bootstrap-table.min.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/common/common.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/icheck/css/custom.css\" >\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/icheck/skins/all.css\" >\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"demo-list\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<input tabindex=\"1\" type=\"radio\" id=\"input-1\" name=\"demo-radio\" value=\"distinct\">\r\n");
      out.write("\t\t\t<label for=\"input-1\">地区</label>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<input tabindex=\"2\" type=\"radio\" id=\"input-2\" name=\"demo-radio\" value=\"model\" checked>\r\n");
      out.write("\t\t\t<label for=\"input-2\">型号</label>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<input tabindex=\"3\" type=\"radio\" id=\"input-3\" name=\"demo-radio\" value=\"customer\">\r\n");
      out.write("\t\t\t<label for=\"input-3\">客户</label>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"salesIndexMap\" style=\"height:500px;width:600px;float:left;\"></div>\r\n");
      out.write("<div id=\"salesIndexTable\" style=\"height:500px;width:450px;float:left;margin-left:50px\" class=\"container-fluid\">\r\n");
      out.write("\t<div style=\"margin-top:10px\">\r\n");
      out.write("        <table id=\"user-list\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th id=\"type\">型号</th>\r\n");
      out.write("                    <th>发货</th>\r\n");
      out.write("                    <th>激活</th>\r\n");
      out.write("                    <th>存量</th>\r\n");
      out.write("                    <th>激活率</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"hidden\" id=\"province\" name=\"province\" value=\"全国\">\r\n");
      out.write("<input type=\"hidden\" id=\"datestart\" name=\"datestart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datestart}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" id=\"dateend\" name=\"datestart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dateend}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<script src=\"/res/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/res/icheck/js/icheck.js\"></script>\r\n");
      out.write("<script src=\"/res/echarts/echarts.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap/core/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-table/bootstrap-table.min.js\"></script>\r\n");
      out.write("<script src=\"/res/layer/layer.js\"></script>\r\n");
      out.write("<script src=\"/res/common/common.js\"></script>\r\n");
      out.write("<script src=\"/marketAnalysis/marketOverallAnalysis/listStatAnalysis.js?v=20160818\"></script>\r\n");
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

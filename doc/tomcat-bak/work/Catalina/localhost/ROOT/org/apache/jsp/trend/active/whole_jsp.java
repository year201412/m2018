/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-10-05 05:26:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.trend.active;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class whole_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1463996420000L));
    _jspx_dependants.put("jar:file:/data/wwwroot/channel-webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/nubia.tld", Long.valueOf(1471952314000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest;

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
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>激活走势分析</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/datepicker/css/bootstrap-datetimepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap-theme.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/bootstrap-table/bootstrap-table.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/bootstrap-multiselect/bootstrap-multiselect.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/common/common.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/css/loader.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/icheck/css/custom.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/icheck/skins/all.css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        @keyframes spin {\r\n");
      out.write("            from {\r\n");
      out.write("                transform: rotate(0deg);\r\n");
      out.write("            }\r\n");
      out.write("            to {\r\n");
      out.write("                transform: rotate(360deg);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        td {\r\n");
      out.write("            width: 20%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown-menu {\r\n");
      out.write("            /*height: 180px;*/\r\n");
      out.write("            overflow-y: scroll;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-group {\r\n");
      out.write("            margin-left: 4px;\r\n");
      out.write("            float: left\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .multiselect, .dropdown-menu {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .iradio_square-blue {\r\n");
      out.write("            left: 15px !important\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .word-left-info {\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 90px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("        }\r\n");
      out.write("        .word-mid-info {\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("        }\r\n");
      out.write("        *{\r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\tpadding:0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\t/*background: #f0f0f0;*/\r\n");
      out.write("\t\t\tfont-family: \"微软雅黑\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.content{\r\n");
      out.write("\t\t\twidth: 1200px;\r\n");
      out.write("\t\t\tmargin-top: 10px;\r\n");
      out.write("\t\t\tmargin-left: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.activation{\r\n");
      out.write("\t\t\toverflow: hidden;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.activation .float-left{\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t    width: 295px;\r\n");
      out.write("\t\t    height: 85px;\r\n");
      out.write("\t\t    margin-right: 5px;\r\n");
      out.write("\t\t    border: 1px solid #ddd;\r\n");
      out.write("\t\t    box-sizing: border-box;\r\n");
      out.write("\t\t    background-color: #fff;\r\n");
      out.write("\t\t    padding: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.float-left p{\r\n");
      out.write("\t\t\tline-height: 30px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.title{\r\n");
      out.write("\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\tcolor: #4b4b4b;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.num{\r\n");
      out.write("\t\t\tfont-size: 25px;\r\n");
      out.write("\t\t\tcolor: #000;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.echart{\r\n");
      out.write("\t\t\twidth: 1193px;\r\n");
      out.write("\t\t\theight: 500px;\r\n");
      out.write("\t\t\tmargin-top:5px; \r\n");
      out.write("\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\tborder:1px solid #ddd;\r\n");
      out.write("\t\t}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <h2 class=\"page-header\">激活走势分析</h2>\r\n");
      out.write("    <div style=\"clear:both\"></div>\r\n");
      out.write("    <div class=\"word-left-info\">\r\n");
      out.write("        <h5 id=\"linked-pickers-1\" style=\"float:left;margin-top: 15px; display: block\">激活时间：</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"word-mid-info\">\r\n");
      out.write("        <div class='input-group date' id='datestart'>\r\n");
      out.write("            <input type='text' class=\"form-control\"/>\r\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"word-left-info\">\r\n");
      out.write("        <h5 style=\"margin-left: 40px; margin-top: 15px;\">到</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"word-mid-info\">\r\n");
      out.write("        <div class='input-group date' id='dateend'>\r\n");
      out.write("            <input type='text' class=\"form-control\"/>\r\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      if (_jspx_meth_rbac_005fprivilege_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 5px;\">\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"loader\" style=\"z-index:999;display:none;\">\r\n");
      out.write("    <div class=\"loading\" style=\"display:inline-block;vertical-align:middle;\">\r\n");
      out.write("        <div class=\"spinner\">\r\n");
      out.write("            <div class=\"mask\">\r\n");
      out.write("                <div class=\"maskedCircle\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <span class=\"loadtxt\">现在获取数据，请稍后...</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"activation\">\r\n");
      out.write("\t\t<div class=\"float-left\">\r\n");
      out.write("\t\t\t<p class=\"title\">今日实时激活</p>\r\n");
      out.write("\t\t\t<p class=\"today_active_total num\">798</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"float-left\">\r\n");
      out.write("\t\t\t<p class=\"title\">昨日激活</p>\r\n");
      out.write("\t\t\t<p class=\"yesterday_active_total num\"></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"float-left\">\r\n");
      out.write("\t\t\t<p class=\"title\">今日实时发货</p>\r\n");
      out.write("\t\t\t<p class=\"today_stockout_total num\">111</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"float-left\">\r\n");
      out.write("\t\t\t<p class=\"title\">昨日发货</p>\r\n");
      out.write("\t\t\t<p class=\"yesterday_stockout_total num\"></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<div id=\"activeTrend\" style=\"height:500px;width:1200px;float:left;margin-top:5px;z-index:1\" \r\n");
      out.write("\tclass=\"tab-pane fade in active echart\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"/res/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/res/icheck/js/icheck.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-multiselect/bootstrap-multiselect.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap/core/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-table/bootstrap-table.min.js\"></script>\r\n");
      out.write("<script src=\"/res/datepicker/js/moment-with-locales.js\"></script>\r\n");
      out.write("<script src=\"/res/datepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"/res/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/res/echarts/echarts.js\"></script>\r\n");
      out.write("<script src=\"whole.js?v=2016100317\"></script>\r\n");
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

  private boolean _jspx_meth_rbac_005fprivilege_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  rbac:privilege
    com.nubia.rbac.tag.PrivilegeTag _jspx_th_rbac_005fprivilege_005f0 = (com.nubia.rbac.tag.PrivilegeTag) _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.get(com.nubia.rbac.tag.PrivilegeTag.class);
    _jspx_th_rbac_005fprivilege_005f0.setPageContext(_jspx_page_context);
    _jspx_th_rbac_005fprivilege_005f0.setParent(null);
    // /trend/active/whole.jsp(129,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_rbac_005fprivilege_005f0.setTest("queryOpt");
    int _jspx_eval_rbac_005fprivilege_005f0 = _jspx_th_rbac_005fprivilege_005f0.doStartTag();
    if (_jspx_eval_rbac_005fprivilege_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <button id=\"query-btn\" class=\"btn btn-primary vertical-gap\"\r\n");
        out.write("                style=\"float: left;  margin-top: 4px;  margin-left: 15px;\">查询\r\n");
        out.write("        </button>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_rbac_005fprivilege_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_rbac_005fprivilege_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.reuse(_jspx_th_rbac_005fprivilege_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.reuse(_jspx_th_rbac_005fprivilege_005f0);
    return false;
  }
}
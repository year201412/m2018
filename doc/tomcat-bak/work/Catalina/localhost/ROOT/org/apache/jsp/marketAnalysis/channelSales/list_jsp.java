/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-12-13 08:05:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.marketAnalysis.channelSales;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1465806278000L));
    _jspx_dependants.put("jar:file:/data/wwwroot/channel-webapp-pre/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/nubia.tld", Long.valueOf(1481527436000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    <title>渠道销售分析</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/datepicker/css/bootstrap-datetimepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap-theme.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap-table/bootstrap-table.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap-multiselect/bootstrap-multiselect.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/common/common.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/css/loader.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/icheck/css/custom.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/icheck/skins/all.css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes spin {\r\n");
      out.write("            from {\r\n");
      out.write("                transform: rotate(0deg);\r\n");
      out.write("            }\r\n");
      out.write("            to {\r\n");
      out.write("                transform: rotate(360deg);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #selRegion {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("            line-height: 34px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #selSecRegion {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("            line-height: 34px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #selCity {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("            line-height: 34px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #selModel {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("            line-height: 34px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td {\r\n");
      out.write("            width: 20%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown-menu {\r\n");
      out.write("            /*height: 199px;*/\r\n");
      out.write("            overflow-y: scroll;\r\n");
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
      out.write("        .demo-list {\r\n");
      out.write("            margin-top: -5px;\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .demo-list ul li {\r\n");
      out.write("            padding: 0 0 0 57px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .word-left-info {\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 90px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .word-mid-info {\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #user-list .col {\r\n");
      out.write("            width: 10%\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2 class=\"page-header\">渠道销售分析</h2>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 5px;\">\r\n");
      out.write("    <div class=\"word-left-info\">\r\n");
      out.write("        <h5>类型：</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"demo-list\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <input tabindex=\"1\" type=\"radio\" name=\"timeType\" value=\"ship\" checked>\r\n");
      out.write("                <label>发货时间</label>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <input tabindex=\"2\" type=\"radio\" name=\"timeType\" value=\"active\">\r\n");
      out.write("                <label>激活时间</label>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 5px;\">\r\n");
      out.write("    <div style=\"clear:both\"></div>\r\n");
      out.write("    <div class=\"word-left-info\">\r\n");
      out.write("        <h5 id=\"linked-pickers-1\" style=\"float:left;\">时间：</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"word-mid-info\">\r\n");
      out.write("        <div class='input-group date' id='datestart'>\r\n");
      out.write("            <input type='text' class=\"form-control\"/>\r\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"word-left-info\" style=\"width: 40px;\">\r\n");
      out.write("        <h5 style=\"margin-left: 10px;\">到</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"word-mid-info\">\r\n");
      out.write("        <div class='input-group date' id='dateend'>\r\n");
      out.write("            <input type='text' class=\"form-control\"/>\r\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_rbac_005fprivilege_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_rbac_005fprivilege_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"width:750px;float:left;margin-top: 20px;z-index:1;\">\r\n");
      out.write("    <div style=\"margin-top:10px\">\r\n");
      out.write("        <table id=\"channel-sales\">\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"/res/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/res/icheck/js/icheck.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-multiselect/bootstrap-multiselect.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap/core/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-table/bootstrap-table.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/res/datepicker/js/moment-with-locales.js\"></script>\r\n");
      out.write("<script src=\"/res/datepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"/res/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/marketAnalysis/channelSales/list.js\"></script>\r\n");
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
    // /marketAnalysis/channelSales/list.jsp(146,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_rbac_005fprivilege_005f0.setTest("queryOpt");
    int _jspx_eval_rbac_005fprivilege_005f0 = _jspx_th_rbac_005fprivilege_005f0.doStartTag();
    if (_jspx_eval_rbac_005fprivilege_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <button id=\"query-btn\" class=\"btn btn-primary vertical-gap\"\r\n");
        out.write("                style=\"float: left;  margin-top: 5px;  margin-left: 20px;\">查询\r\n");
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

  private boolean _jspx_meth_rbac_005fprivilege_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  rbac:privilege
    com.nubia.rbac.tag.PrivilegeTag _jspx_th_rbac_005fprivilege_005f1 = (com.nubia.rbac.tag.PrivilegeTag) _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.get(com.nubia.rbac.tag.PrivilegeTag.class);
    _jspx_th_rbac_005fprivilege_005f1.setPageContext(_jspx_page_context);
    _jspx_th_rbac_005fprivilege_005f1.setParent(null);
    // /marketAnalysis/channelSales/list.jsp(152,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_rbac_005fprivilege_005f1.setTest("exportOpt");
    int _jspx_eval_rbac_005fprivilege_005f1 = _jspx_th_rbac_005fprivilege_005f1.doStartTag();
    if (_jspx_eval_rbac_005fprivilege_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <div class=\"btn-group\" style=\"margin-top: 5px;\">\r\n");
        out.write("            <button id=\"export-btn\" type=\"button\" class=\"btn btn-primary\" style=\"margin-left: 5px\">导出</button>\r\n");
        out.write("            <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
        out.write("                    aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
        out.write("                <span class=\"caret\"></span>\r\n");
        out.write("                <span class=\"sr-only\">Toggle Dropdown</span>\r\n");
        out.write("            </button>\r\n");
        out.write("            <ul class=\"dropdown-menu\" role=\"menu\" style=\"width: 85px;\">\r\n");
        out.write("                <li>\r\n");
        out.write("                    ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_rbac_005fprivilege_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                </li>\r\n");
        out.write("            </ul>\r\n");
        out.write("        </div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_rbac_005fprivilege_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_rbac_005fprivilege_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.reuse(_jspx_th_rbac_005fprivilege_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.reuse(_jspx_th_rbac_005fprivilege_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_rbac_005fprivilege_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_rbac_005fprivilege_005f1);
    // /marketAnalysis/channelSales/list.jsp(162,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /marketAnalysis/channelSales/list.jsp(162,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/marketAnalysis/channelSales/list.jsp(162,20) '${exportConfig}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${exportConfig}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <label style=\"margin-left: 10px;\">\r\n");
          out.write("                            <input name=\"excel-title\" type=\"checkbox\" data-field=\"id\"\r\n");
          out.write("                                   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" type-define=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.typeDefine}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" checked=\"checked\">\r\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.text}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                        </label>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-12-13 10:03:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.dataMaintenance.userBehavior;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userBehaviorRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1440032722000L));
    _jspx_dependants.put("jar:file:/data/wwwroot/channel-webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/nubia.tld", Long.valueOf(1472107260000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    <title>用户行为记录</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap.min.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/datepicker/css/bootstrap-datetimepicker.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap-theme.min.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap-table/bootstrap-table.min.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/bootstrap-multiselect/bootstrap-multiselect.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/common/common.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/css/loader.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/icheck/css/custom.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/res/icheck/skins/all.css\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t@keyframes spin {\r\n");
      out.write("\t\t\tfrom {\r\n");
      out.write("\t\t\t\ttransform: rotate(0deg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tto {\r\n");
      out.write("\t\t\t\ttransform: rotate(360deg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\ttd {\r\n");
      out.write("\t\t\twidth: 20%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.selection {\r\n");
      out.write("\t\t\twidth: 200px;\r\n");
      out.write("\t\t\tborder-radius: 3px;\r\n");
      out.write("\t\t\theight: 34px;\r\n");
      out.write("\t\t\tline-height: 34px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.dropdown-menu {\r\n");
      out.write("\t\t\theight: 300px;\r\n");
      out.write("\t\t\toverflow-y: scroll;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.multiselect, .dropdown-menu {\r\n");
      out.write("\t\t\twidth: 200px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.multiselect-all label {\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.sale-count span {\r\n");
      out.write("\t\t\tcolor: rgb(219, 86, 86);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.page-header {\r\n");
      out.write("\t\t\tmargin: 20px 0 10px\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.details{color:#337AB7;text-decoration:underline;cursor:pointer;}\r\n");
      out.write("\t\t.word-left-info{float: left; width: 100px; height: 34px;}\r\n");
      out.write("\t\t.word-mid-info{float: left; width: 200px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2 class=\"page-header\" style=\"margin-left:12px;\">用户行为记录查询</h2>\r\n");
      out.write("\r\n");
      out.write("<div style=\"clear:both\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t<div class=\"word-left-info\">\r\n");
      out.write("\t\t<h5>时间：</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"word-mid-info\">\r\n");
      out.write("\t\t<div class='input-group date' id='datestart'>\r\n");
      out.write("\t\t\t<input type='text' required=\"required\" class=\"form-control\" style=\"height: 34px;\"/>\r\n");
      out.write("\t\t\t<span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"word-left-info\">\r\n");
      out.write("\t\t<h5 style=\"margin-left: 10px;\">到：</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"word-mid-info\">\r\n");
      out.write("\t\t<div class='input-group date' id='dateend'>\r\n");
      out.write("\t\t\t<input type='text' required=\"required\" class=\"form-control\" style=\"height: 34px;\"/>\r\n");
      out.write("\t\t\t<span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"word-left-info\">\r\n");
      out.write("        <h5 style=\"margin-left:10px;\">记录来源：</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"float: left;\" class=\"word-mid-info\">\r\n");
      out.write("        <SELECT name=\"behaviorsource\" id=\"behaviorsource\" class=\"selection\">\r\n");
      out.write("            <option value=\"0\">-------请选择行为记录来源-------</option>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </SELECT>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t<div class=\"word-left-info\">\r\n");
      out.write("\t\t<h5>用户行为:</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"float: left;\" class=\"word-mid-info\">\r\n");
      out.write("\t\t<SELECT name=\"behavior\" id=\"behavior\" class=\"selection\" multiple=\"multiple\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</SELECT>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"word-left-info\">\r\n");
      out.write("\t\t<h5 style=\"margin-left: 10px;\">账号：</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"float: left;\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"form-control word-mid-info\" name=\"username\" id=\"username\"\r\n");
      out.write("\t\t\t   style=\"border-radius: 3px;width: 200px;\" placeholder=\"账号\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"word-left-info\">\r\n");
      out.write("\t\t<h5 style=\"margin-left: 10px;\">姓名：</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"float: left;\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"form-control word-mid-info\" name=\"realname\" id=\"realname\"\r\n");
      out.write("\t\t\t   style=\"border-radius: 3px;width: 200px;\" placeholder=\"姓名\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"float: left;\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_rbac_005fprivilege_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_rbac_005fprivilege_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" id=\"activeCountDetail\" style=\"width: 1155px;float: left;margin-top: 10px;z-index: 1;\">\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t<table id=\"basic-data\">\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"/res/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/res/layer/layer.js\"></script>\r\n");
      out.write("<script src=\"/res/icheck/js/icheck.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-multiselect/bootstrap-multiselect.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap/core/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/res/bootstrap-table/bootstrap-table.min.js\"></script>\r\n");
      out.write("<script src=\"/res/datepicker/js/moment-with-locales.js\"></script>\r\n");
      out.write("<script src=\"/res/datepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"/res/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/dataMaintenance/userBehavior/userBehaviorRecord.js?v=20161104\"></script>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(92,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/dataMaintenance/userBehavior/userBehaviorRecord.jsp(92,12) '${behaviorsource}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${behaviorsource}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(92,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("source");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${source.behaviorsource}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${source.behaviorsource}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(105,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/dataMaintenance/userBehavior/userBehaviorRecord.jsp(105,3) '${behavior}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${behavior}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(105,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("behav");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${behav.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${behav.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_rbac_005fprivilege_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  rbac:privilege
    com.nubia.rbac.tag.PrivilegeTag _jspx_th_rbac_005fprivilege_005f0 = (com.nubia.rbac.tag.PrivilegeTag) _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.get(com.nubia.rbac.tag.PrivilegeTag.class);
    _jspx_th_rbac_005fprivilege_005f0.setPageContext(_jspx_page_context);
    _jspx_th_rbac_005fprivilege_005f0.setParent(null);
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(128,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_rbac_005fprivilege_005f0.setTest("queryOpt");
    int _jspx_eval_rbac_005fprivilege_005f0 = _jspx_th_rbac_005fprivilege_005f0.doStartTag();
    if (_jspx_eval_rbac_005fprivilege_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<button id=\"query-btn\" class=\"btn btn-primary vertical-gap\"\r\n");
        out.write("\t\t\t\t\tstyle=\"float: left; margin-top: 0; margin-left: 15px; margin-right: 15px; height: 34px;\">\r\n");
        out.write("\t\t\t\t查询\r\n");
        out.write("\t\t\t</button>\r\n");
        out.write("\t\t");
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
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(135,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_rbac_005fprivilege_005f1.setTest("exportOpt");
    int _jspx_eval_rbac_005fprivilege_005f1 = _jspx_th_rbac_005fprivilege_005f1.doStartTag();
    if (_jspx_eval_rbac_005fprivilege_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div class=\"btn-group\">\r\n");
        out.write("\t\t\t\t<button id=\"export-btn\" type=\"button\" class=\"btn btn-primary\">导出</button>\r\n");
        out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
        out.write("\t\t\t\t\t\taria-haspopup=\"true\" aria-expanded=\"false\" style=\"margin-right: 15px;\">\r\n");
        out.write("\t\t\t\t\t<span class=\"caret\"></span>\r\n");
        out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle Dropdown</span>\r\n");
        out.write("\t\t\t\t</button>\r\n");
        out.write("\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" style=\"width: 85px;\">\r\n");
        out.write("\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f2(_jspx_th_rbac_005fprivilege_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t</ul>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_rbac_005fprivilege_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_rbac_005fprivilege_005f1);
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(145,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("item");
    // /dataMaintenance/userBehavior/userBehaviorRecord.jsp(145,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/dataMaintenance/userBehavior/userBehaviorRecord.jsp(145,6) '${titles}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${titles}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<label style=\"margin-left: 10px;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<input name=\"excel-title\" type=\"checkbox\" data-field=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t   checked=\"checked\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</label>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-12-13 08:37:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.rbac;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addPermit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1440032722000L));
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>权限分配</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/res/bootstrap/core/bootstrap-theme.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/res/common/common.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/res/bootstrap-table/bootstrap-table.min.css\" />\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.htmleaf-header{margin-bottom: 15px;font-family: \"Segoe UI\", \"Lucida Grande\", Helvetica, Arial, \"Microsoft YaHei\", FreeSans, Arimo, \"Droid Sans\", \"wenquanyi micro hei\", \"Hiragino Sans GB\", \"Hiragino Sans GB W3\", \"FontAwesome\", sans-serif;}\r\n");
      out.write("\t\t.htmleaf-icon{color: #fff;}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h2 class=\"page-header\">权限分配</h2>\r\n");
      out.write("\t\t<form class=\"form-horizontal\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"role-id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" id=\"role-menu-ids\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuIds}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" id=\"role-res-ids\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resTypeIds}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" id=\"role-res-oper-ids\" >\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-2 control-label\">角色名称</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" disabled=\"disabled\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"role-name\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2 error-msg\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"role-desc\" class=\"col-sm-2 control-label\">角色描述</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" disabled=\"disabled\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.description }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"role-desc\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2 error-msg\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--菜单资源分配  -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"treeview-checkable\" class=\"col-sm-2 control-label\">菜单资源分配</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<div id=\"treeview-checkable\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2 error-msg\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--操作资源分配  -->\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-2 control-label\">操作资源类型分配</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<table id=\"table-res\" data-toggle=\"table\"\r\n");
      out.write("\t\t\t\t\t\tdata-select-item-name=\"resTypeIds\"\r\n");
      out.write("\t\t\t\t\t\tdata-id-field=\"id\" data-url=\"/rbac/res/list.do?roleId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tdata-response-handler=\"resResponseHandler\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th data-field=\"state\" data-checkbox=\"true\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th data-field=\"id\" data-visible=\"false\">ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th data-field=\"name\">操作名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th data-field=\"operation\">唯一标识</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2 error-msg\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-offset-2 col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<button id=\"save-permit-btn\" type=\"button\" class=\"btn btn-primary\">提交</button>\r\n");
      out.write("\t\t\t\t\t<button id=\"back-btn\" type=\"button\" class=\"btn btn-default\">返回</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"/res/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"/res/bootstrap/core/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"/res/bootstrap-table/bootstrap-table.min.js\"></script>\r\n");
      out.write("\t<script src=\"/res/bootstrap-treeview/bootstrap-treeview.js\"></script>\r\n");
      out.write("\t<script src=\"/res/layer/layer.js\"></script>\r\n");
      out.write("\t<script src=\"/res/common/common.js\"></script>\r\n");
      out.write("\t<script src=\"/rbac/addPermit.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("//\t\tvar resId = \"\";\r\n");
      out.write("//\t\tvar selectIds=[];//手选的\r\n");
      out.write("\r\n");
      out.write("\t\t/****\r\n");
      out.write("\t\t * 操作权限列表 调用句柄\r\n");
      out.write("\t\t * @param res\r\n");
      out.write("\t\t * @returns {*}\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\tfunction resResponseHandler(res) {\r\n");
      out.write("\t\t\tvar resSelections = $(\"#role-res-ids\").val();\r\n");
      out.write("\t\t\tvar resTypeIds = [];\r\n");
      out.write("\t\t\tif (resSelections) {\r\n");
      out.write("\t\t\t\tresTypeIds = JSON.parse(resSelections);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(res.data) {\r\n");
      out.write("\t\t\t\t$.each(res.data, function(i, row) {\r\n");
      out.write("\t\t\t\t\trow.state = $.inArray(row.id, resTypeIds) !== -1;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn res;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showRes(cellValue, record) {\r\n");
      out.write("\t\t\tvar html = [];\r\n");
      out.write("\t\t\tif(record.resRecordIds) {\r\n");
      out.write("\t\t\t\thtml.push(\"<a data-target='#myModal' onclick='setResId(\"+record.id+\");'  data-toggle='modal' >选择资源</a>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<span class='res-choose-\"+record.id+\"'><input type='hidden' name='resRecordIds'  value='\"+record.id+\"|\" + record.resRecordIds+\"'></span>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse {\r\n");
      out.write("\t\t\t\thtml.push(\"<a data-target='#myModal' onclick='setResId(\"+record.id+\");'  data-toggle='modal' >选择资源</a>\"+\r\n");
      out.write("\t\t\t\t\t\t\"<span class='res-choose-\"+record.id+\"'><input type='hidden' name='resRecordIds'> </span>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn html.join(\" \");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//点击参看资源的时候\r\n");
      out.write("\t\tfunction setResId(id) {\r\n");
      out.write("\t\t\tselectIds = [];\r\n");
      out.write("\t\t\tvar value = $(\".res-choose-\"+id + \" input:first-child\").val();\r\n");
      out.write("\t\t\tif(value) {\r\n");
      out.write("\t\t\t\tvar val = value.split(\"|\")[1].split(\",\");\r\n");
      out.write("\t\t\t\tfor (x in val){\r\n");
      out.write("\t\t\t\t\tselectIds.push(parseInt(val[x]));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#table-app\").bootstrapTable(\"refresh\");\r\n");
      out.write("\t\t\tresId = id;\r\n");
      out.write("\t\t}\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
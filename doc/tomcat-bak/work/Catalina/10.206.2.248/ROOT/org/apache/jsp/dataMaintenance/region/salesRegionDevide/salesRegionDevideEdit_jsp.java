/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2017-01-11 09:38:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.dataMaintenance.region.salesRegionDevide;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salesRegionDevideEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1471862222000L));
    _jspx_dependants.put("jar:file:/data/wwwroot/channel-webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/nubia.tld", Long.valueOf(1472004632000L));
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>销售区域划分</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/res/jquery-easyui-1.4.4/themes/default/easyui.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/res/jquery-easyui-1.4.4/themes/icon.css\">\n");
      out.write("\t<script type=\"text/javascript\" src=\"/res/jquery-easyui-1.4.4/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"/res/jquery-easyui-1.4.4/jquery.easyui.min.js\"></script>\n");
      out.write("\t<style>\n");
      out.write("\t\t.combo-arrow{width: 28px!important; height: 30px!important;}\n");
      out.write("\t\t.textbox{width: 288px!important; height: 30px!important;}\n");
      out.write("        .panel-body-noheader{height:300px!important;}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h2 style=\"font-size:24px\">您可以在此为销售区域\"<span style=\"color:blue;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${salesRegionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\"划分地理区域</h2>\n");
      out.write("\n");
      out.write("<!-- <select id=\"cc\" class=\"easyui-combotree\" data-options=\"url:'./js/distpicker-master/src/distpicker.data.js',method:'get'\" multiple style=\"width:200px;\"></select> -->\n");
      out.write("<!-- http://niusao.server.ztemt.com.cn/region/edit/1 -->\n");
      out.write("<ul id=\"cc\" class=\"easyui-combotree\" data-options=\"url:'/salesRegionDevide/editRegionTree/list.do?sales_region_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${salesRegionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',method:'get'\" multiple style=\"width:200px;\"></ul>\n");
      out.write("<button id=\"btn\" style=\"border: 1px solid #95B8E7; background-color: #ECF3FF; color: #235EAD; padding: 3px 10px; margin-left: 5px; \">保存</button>\n");
      out.write("<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${salesRegionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"sales_region_id\">\n");
      out.write("\t<script>\n");
      out.write("       \n");
      out.write("\t\tfunction myLoadFilter(data, parent){\n");
      out.write("\t\t\tvar state = $.data(this, 'tree');\n");
      out.write("\t\t\t\n");
      out.write("\t\t    function setData(){\n");
      out.write("\t\t    \tvar serno = 1;\n");
      out.write("\t\t        var todo = [];\n");
      out.write("\t\t        for(var i=0; i<data.length; i++){\n");
      out.write("\t\t            todo.push(data[i]);\n");
      out.write("\t\t        }\n");
      out.write("\t\t        while(todo.length){\n");
      out.write("\t\t            var node = todo.shift();\n");
      out.write("\t\t            if (node.id == undefined){\n");
      out.write("\t\t            \tnode.id = '_node_' + (serno++);\n");
      out.write("\t\t            }\n");
      out.write("\t\t            if (node.children){\n");
      out.write("\t\t                node.state = 'closed';\n");
      out.write("\t\t                node.children1 = node.children;\n");
      out.write("\t\t                node.children = undefined;\n");
      out.write("\t\t                todo = todo.concat(node.children1);\n");
      out.write("\t\t            }\n");
      out.write("\t\t        }\n");
      out.write("\t\t        state.tdata = data;\n");
      out.write("\t\t    }\n");
      out.write("\t\t    function find(id){\n");
      out.write("\t\t    \tvar data = state.tdata;\n");
      out.write("\t\t    \tvar cc = [data];\n");
      out.write("\t\t    \twhile(cc.length){\n");
      out.write("\t\t    \t\tvar c = cc.shift();\n");
      out.write("\t\t    \t\tfor(var i=0; i<c.length; i++){\n");
      out.write("\t\t    \t\t\tvar node = c[i];\n");
      out.write("\t\t    \t\t\tif (node.id == id){\n");
      out.write("\t\t    \t\t\t\treturn node;\n");
      out.write("\t\t    \t\t\t} else if (node.children1){\n");
      out.write("\t\t    \t\t\t\tcc.push(node.children1);\n");
      out.write("\t\t    \t\t\t}\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    \treturn null;\n");
      out.write("\t\t    }\n");
      out.write("\t\t    \n");
      out.write("\t\t    setData();\n");
      out.write("\t\t    \n");
      out.write("\t\t    var t = $(this);\n");
      out.write("\t\t    var opts = t.tree('options');\n");
      out.write("\t\t    opts.onBeforeExpand = function(node){\n");
      out.write("\t    \t\tvar n = find(node.id);\n");
      out.write("\t    \t\tif (n.children && n.children.length){return}\n");
      out.write("\t\t    \tif (n.children1){\n");
      out.write("\t\t    \t\tvar filter = opts.loadFilter;\n");
      out.write("\t\t    \t\topts.loadFilter = function(data){return data;};\n");
      out.write("\t\t    \t\tt.tree('append',{\n");
      out.write("\t\t    \t\t\tparent:node.target,\n");
      out.write("\t\t    \t\t\tdata:n.children1\n");
      out.write("\t\t    \t\t});\n");
      out.write("\t\t    \t\topts.loadFilter = filter;\n");
      out.write("\t\t    \t\tn.children = n.children1;\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    };\n");
      out.write("\n");
      out.write("\t\t\treturn data;\n");
      out.write("\t\t}\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$('.textbox-addon-right').on('click', function(){\n");
      out.write("\t\t\t\t$('#cc').combotree('tree').tree('collapseAll')\n");
      out.write("\t\t\t})\n");
      out.write("\t\t\tvar areaid='';\n");
      out.write("\t\t\tvar sales_region_id = $('#sales_region_id').val();\n");
      out.write("\t\t\t$('#btn').on('click', function(){\n");
      out.write("\t\t\t\t$('.textbox input:hidden').each(function(k,v){\n");
      out.write("\t\t\t\t\tareaid +=$(this).val()+',';\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\tareaid = areaid.substring(0,areaid.length-1);\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl: '/salesRegionDevide/saveSalesRegion/list.do',\n");
      out.write("\t\t\t\t\ttype: 'post',\n");
      out.write("\t\t\t\t\tdata: { region_ids: areaid,\n");
      out.write("\t\t\t\t\t\t    sales_region_id: sales_region_id\n");
      out.write("\t\t\t\t\t\t  },\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\t.done(function() {\n");
      out.write("\t\t\t\t\talert('保存成功');\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\t.fail(function() {\n");
      out.write("\t\t\t\t\talert('提交失败，网络繁忙，请稍后重试');\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-01-18 01:29:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.nubia.imageresource.common.*;
import cn.nubia.imageresource.rbac.model.SysUser;
import cn.nubia.framework.cache.*;
import cn.nubia.framework.core.HttpCookie;
import cn.nubia.framework.crypto.Des;
import cn.nubia.framework.crypto.PaddingMode;

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
    _jspx_imports_packages.add("cn.nubia.framework.cache");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("cn.nubia.imageresource.common");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("cn.nubia.imageresource.rbac.model.SysUser");
    _jspx_imports_classes.add("cn.nubia.framework.core.HttpCookie");
    _jspx_imports_classes.add("cn.nubia.framework.crypto.Des");
    _jspx_imports_classes.add("cn.nubia.framework.crypto.PaddingMode");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	SysUser sysuser = (SysUser) session.getAttribute(Define.SESSION_IN_USER);
	if (sysuser == null) {
		HttpCookie cookie = new HttpCookie(request, response);
		String workId = cookie.getValue(Define.COOKIE_IN_USERID);
		if (workId != null) {
			Des des = new Des(64, PaddingMode.PKCS5Padding);
			if (CacheUtil.getCache().get(des.cbc_encrypt(Define.DES_KEY, Define.DES_VALUE,workId)) != null) {
				sysuser = (SysUser) CacheUtil.getCache().get(des.cbc_encrypt(Define.DES_KEY,Define.DES_VALUE, workId)).getValue();
			}
			if (sysuser != null) {
				response.sendRedirect("nav/resource.do");
			}
		}
	} else {
		response.sendRedirect("nav/resource.do");
	}

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\" />\r\n");
      out.write("<title>nubia图库资源管理系统</title>\r\n");
      out.write("<link href=\"res/css/login.css?v=3\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"res/js/jquery-1.11.1.min.js?v=3\"></script>\r\n");
      out.write("<script src=\"res/js/jquery-ui.min.js?v=3\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar cookieName = 'task_username';\r\n");
      out.write("\t//密码填写错误振动；\r\n");
      out.write("\tfunction rock() {\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction login() {\r\n");
      out.write("\t\tvar frm = $('form:eq(0)'), uv = frm[0].username.value, pv = frm[0].password.value, tip = $('h2:eq(0)');\r\n");
      out.write("\t\tif ($.trim(uv) == '') {\r\n");
      out.write("\t\t\t$('#loginDiv').effect(\"shake\", {\r\n");
      out.write("\t\t\t\ttimes : 3\r\n");
      out.write("\t\t\t}, 100, function() {\r\n");
      out.write("\t\t\t\t$('#username').focus();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#password').attr(\"value\", \"\");\r\n");
      out.write("\t\t\t$('#codeDiv .note').show();\r\n");
      out.write("\r\n");
      out.write("\t\t} else if ($.trim(pv) == '') {\r\n");
      out.write("\t\t\t$('#loginDiv').effect(\"shake\", {\r\n");
      out.write("\t\t\t\ttimes : 3\r\n");
      out.write("\t\t\t}, 100, function() {\r\n");
      out.write("\t\t\t\t$('#password').focus();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#password').attr(\"value\", \"\");\r\n");
      out.write("\t\t\t$('#codeDiv .note').show();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$.post(\"login/check.do\", frm.serialize(), function(r) {\r\n");
      out.write("\t\t\t\tif (r == \"success\") {\r\n");
      out.write("\t\t\t\t\t$.cookie.set(cookieName, uv, 2678400);\r\n");
      out.write("\t\t\t\t\ttop.location.href = \"nav/resource.do\";\r\n");
      out.write("\t\t\t\t} else if (r == \"username_error\") {\r\n");
      out.write("\t\t\t\t\t$('#alert').show();\r\n");
      out.write("\t\t\t\t} else if (r == \"password_error\") {\r\n");
      out.write("\t\t\t\t\t$('#forget').show();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"系统出错,信息如下:\" + r);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar frm = $('form:eq(0)');\r\n");
      out.write("\t\tvar username = $.cookie.get(cookieName);\r\n");
      out.write("\t\tif (username) {\r\n");
      out.write("\t\t\tfrm[0].username.value = username;\r\n");
      out.write("\t\t\t$('#userDiv .note').hide();\r\n");
      out.write("\t\t\t$('#username').focus();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#password').focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfrm.keypress(function(e) {\r\n");
      out.write("\t\t\tif (e.keyCode == 13) {\r\n");
      out.write("\t\t\t\tlogin();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif (top != self)\r\n");
      out.write("\t\t\ttop.location.href = \"index.jsp\";\r\n");
      out.write("\t\t//初始化；\r\n");
      out.write("\t\t$('#alert').hide();\r\n");
      out.write("\t\t$('#forget').hide();\r\n");
      out.write("\r\n");
      out.write("\t\t//\r\n");
      out.write("\t\t$('#username').focusin(function() {\r\n");
      out.write("\t\t\t$('#TMark').removeClass('hit');\r\n");
      out.write("\t\t\t$('#forget').hide();\r\n");
      out.write("\t\t}).focusout(function() {\r\n");
      out.write("\t\t\tif (this.value == '') {\r\n");
      out.write("\t\t\t\t$('#userDiv .note').show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t;\r\n");
      out.write("\t\t\t$('#TMark').addClass('hit');\r\n");
      out.write("\t\t}).mouseup(function() {\r\n");
      out.write("\t\t\tif (this.value != '') {\r\n");
      out.write("\t\t\t\t$('#userDiv .note').hide();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#password').focusin(function() {\r\n");
      out.write("\t\t\t$('#PMark').removeClass('hit');\r\n");
      out.write("\t\t\t$('#forget').hide();\r\n");
      out.write("\t\t}).focusout(function() {\r\n");
      out.write("\t\t\tif (this.value == '') {\r\n");
      out.write("\t\t\t\t$('#codeDiv .note').show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#PMark').addClass('hit');\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#stay_css,#stay_label').mousedown(function() {\r\n");
      out.write("\t\t\tif ($('#stay_css').attr(\"class\") == 'checkBox') {\r\n");
      out.write("\t\t\t\t$('#stay_css').addClass('press');\r\n");
      out.write("\t\t\t\t$('.stay_label_txt').addClass('blod');\r\n");
      out.write("\t\t\t\t$('#stay').attr(\"value\", \"1\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$('#stay_css').addClass('press2');\r\n");
      out.write("\t\t\t\t$('.stay_label_txt').removeClass('blod');\r\n");
      out.write("\t\t\t\t$('#stay').attr(\"value\", \"0\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).mouseup(function() {\r\n");
      out.write("\t\t\t$('#stay_css').removeClass('press').removeClass('press2');\r\n");
      out.write("\t\t\t$('#stay_css').toggleClass('checked').toggleClass('checkBox');\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#submit').mousedown(function() {\r\n");
      out.write("\t\t\t$('#submit').css(\"background-position\", \"0px -583px\");\r\n");
      out.write("\t\t}).mouseup(function() {\r\n");
      out.write("\t\t\t$('#submit').css(\"background-position\", \"0px -555px\");\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t$('#username').keydown(function() {\r\n");
      out.write("\t\t\t$('#userDiv .note').hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#password').keydown(function() {\r\n");
      out.write("\t\t\t$('#codeDiv .note').hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#closeA').click(function() {\r\n");
      out.write("\t\t\t$('#alert').fadeOut();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//提交；\r\n");
      out.write("\t\t$('#submit').click(function() {\r\n");
      out.write("\t\t\tlogin();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\t//cookie\r\n");
      out.write("\t$.cookie = {\r\n");
      out.write("\t\tget : function(name) {\r\n");
      out.write("\t\t\tvar a = document.cookie.match(new RegExp(\"(^| )\" + name + \"=([^;]*)(;|$)\"));\r\n");
      out.write("\t\t\treturn a ? unescape(a[2]) : null;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tset : function(name, value, seconds, path, domain, secure) {\r\n");
      out.write("\t\t\tvar a = new Date();\r\n");
      out.write("\t\t\ta.setTime(a.getTime() + seconds);\r\n");
      out.write("\t\t\tdocument.cookie = escape(name) + '=' + escape(value) + (a ? '; expires=' + a.toGMTString() : '') + (path ? '; path=' + path : '/') + (domain ? '; domain=' + domain : '') + (secure ? '; secure' : '');\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tclear : function(name) {\r\n");
      out.write("\t\t\tvar a = new Date();\r\n");
      out.write("\t\t\ta.setTime(a.getTime() - 1);\r\n");
      out.write("\t\t\tdocument.cookie = name + '=null;expires=' + a.toGMTString();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"alert\">\r\n");
      out.write("\t\t<h3 id=\"messge\">对不起，您输入的帐号不存在！</h3>\r\n");
      out.write("\t\t<div id=\"description\">\r\n");
      out.write("\t\t\t<p>请确保您的帐号是正确的，如给您的工作带来不便敬请谅解！</p>\r\n");
      out.write("\t\t\t<p style=\"text-align: right\">\r\n");
      out.write("\t\t\t\t<input id=\"closeA\" type=\"button\" value=\"好的，知道了\">\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t<div id=\"loginDiv\">\r\n");
      out.write("\t\t\t<div id=\"logo\"></div>\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<div id=\"userDiv\">\r\n");
      out.write("\t\t\t\t\t<div id=\"TMark\" class=\"inputMark hit\"></div>\r\n");
      out.write("\t\t\t\t\t<input name=\"username\" id=\"username\" class=\"field\" type=\"text\" maxlength='16' tabindex=\"1\" autocomplete=\"off\">\r\n");
      out.write("\t\t\t\t\t<div class=\"note\">请输入账号</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"codeDiv\">\r\n");
      out.write("\t\t\t\t\t<div id=\"PMark\" class=\"inputMark hit\"></div>\r\n");
      out.write("\t\t\t\t\t<input name=\"password\" id=\"password\" class=\"field\" type=\"password\" maxlength='16' tabindex=\"2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"note\">请输入密码</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"submit\" class=\"submit\" title=\"登录\"></div>\r\n");
      out.write("\t\t\t\t\t<!--密码不正确提示-->\r\n");
      out.write("\t\t\t\t\t<div id=\"forget\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"forget_top\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"forget_middle\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"forget_description\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt>你输入的密码不正确</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>请使用正确的密码再次登录;</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"forget_bottom\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"remeber\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"stay\" name=\"stay\" value=\"0\" checked=\"\" hidefocus=\"\" style=\"display: none;\"><span id=\"stay_css\" class=\"checkBox\"></span><span id=\"stay_label\" class=\"stay_label_txt\">记住密码，保持我的登录状态.</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"copyright\">2015 © 努比亚技术有限公司</div>\r\n");
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
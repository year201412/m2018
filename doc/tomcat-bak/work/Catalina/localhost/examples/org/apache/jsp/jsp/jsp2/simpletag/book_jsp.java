/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2016-06-16 13:32:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.jsp2.simpletag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("my:caps", jsp2.examples.el.Functions.class, "caps", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp2/jsp2-example-taglib.tld", Long.valueOf(1424024033000L));
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>JSP 2.0 Examples - Book SimpleTag Handler</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>JSP 2.0 Examples - Book SimpleTag Handler</h1>\n");
      out.write("    <hr>\n");
      out.write("    <p>Illustrates a semi-realistic use of SimpleTag and the Expression\n");
      out.write("    Language.  First, a &lt;my:findBook&gt; tag is invoked to populate\n");
      out.write("    the page context with a BookBean.  Then, the books fields are printed\n");
      out.write("    in all caps.</p>\n");
      out.write("    <br>\n");
      out.write("    <b><u>Result:</u></b><br>\n");
      out.write("    ");
      if (_jspx_meth_my_005ffindBook_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <thead>\n");
      out.write("        <td><b>Field</b></td>\n");
      out.write("        <td><b>Value</b></td>\n");
      out.write("        <td><b>Capitalized</b></td>\n");
      out.write("    </thead>\n");
      out.write("    <tr>\n");
      out.write("        <td>Title</td>\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${my:caps(book.title)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Author</td>\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${my:caps(book.author)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>ISBN</td>\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.isbn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${my:caps(book.isbn)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_my_005ffindBook_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:findBook
    jsp2.examples.simpletag.FindBookSimpleTag _jspx_th_my_005ffindBook_005f0 = (new jsp2.examples.simpletag.FindBookSimpleTag());
    _jsp_instancemanager.newInstance(_jspx_th_my_005ffindBook_005f0);
    _jspx_th_my_005ffindBook_005f0.setJspContext(_jspx_page_context);
    // /jsp/jsp2/simpletag/book.jsp(31,4) name = var type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005ffindBook_005f0.setVar("book");
    _jspx_th_my_005ffindBook_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_my_005ffindBook_005f0);
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-25 14:58:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ogretmen_005fkayit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Ogretmen Kayit Sayfasi</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h1 style=\"text-align:center\">Ogretim Elemani Kayit Islemleri</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table border=1px; width=\"80%\" align= center>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align:center\"><a href=\"index.jsp\">Anasayfa               </a></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align:center\"><a href=\"ogretmen_kayit.jsp\">Ogretim Elemani Kayit Islemleri</a></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<table  align= center>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>Ogretim Elemani Unvan</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"unvan\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>Ogretim Elemani Adi</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"adi\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>Ogretim Elemani Soyadi</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"soyadi\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>Ders Sec</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"ders\" id=\"ders\">\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"matematik\">Matematik</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"turkce\">Turkce</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"ingilizce\">Ingilizce</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"tarih\">Tarih</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"felsefe\">Felsefe</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"biyoloji\">Biyoloji</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"fizik\">Fizik</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"kimya\">Kimya</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"internet_programciligi\">Internet Programciligi</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"muzik\">Muzik</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"beden_egitimi\">Beden Egitimi</option>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\"din_kulturu\">Din Kulturu</option>\r\n");
      out.write("\t\t\t \t\t\t \t</select>\r\n");
      out.write("\t\t\t \t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=center><input type=\"button\" name=\"buton\" value=\"Kayit Ol\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

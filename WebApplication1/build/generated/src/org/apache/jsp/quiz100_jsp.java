package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class quiz100_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            var d= 100*60;\n");
      out.write("            var x = setInterval(function() {\n");
      out.write("               var  h=Math.floor(d/3600);\n");
      out.write("                var m=Math.floor((d%3600)/60);\n");
      out.write("                var s=d%60;\n");
      out.write("                d=d-1;\n");
      out.write("            document.getElementById(\"t\").innerHTML = h+\"H:\"+m +\"M:\"+s+\"S\";\n");
      out.write("            if (d < 0) {\n");
      out.write("              clearInterval(x);\n");
      out.write("              document.getElementById(\"submit\").click();\n");
      out.write("          }\n");
      out.write("            \n");
      out.write("            }, 1000);\n");
      out.write("         </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;\" window.onbeforeunload=\"JavaScript:document.getElementById(\\\"submit\\\").click()\" >\n");
      out.write("       \n");
      out.write("         \n");
      out.write("                    \n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">NECLEX.CLUB</a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li class=\"active\"><a href=\"#\">");
 out.print("Hello "+request.getSession().getAttribute("name")); 
      out.write("</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"navbar-form navbar-right\" action=\"user.jsp\" style=\"margin-right: 10px;\">\n");
      out.write("          <label class=\"btn-success form-control\" id=\"t\" style=\"font-size: 20px;;margin-right: 30px;\">0</label>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-danger\">Exit</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      <div class=\"well text-center container-fluid\">\n");
      out.write("          <h2>Quiz 100<span class=\"btn-danger pull-right\" style=\"padding: 5px;\">");
 
                  int id=Integer.parseInt(request.getSession().getAttribute("id").toString());
                  Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select quiz100 from performace where id="+Integer.toString(id)); 
             rs.next();
             int index=rs.getInt("quiz100");
             out.write("High Score: "+Integer.toString(index)); 
      out.write("</span></h2>\n");
      out.write("      </div>\n");
      out.write("      <form action=\"answerquiz50.jsp\" method=\"get\" name=\"refreshForm\">\n");
      out.write("          <input type=\"hidden\" name=\"visited\" value=\"\">\n");
      out.write("          ");

              int arr[]=new int[50];
              try
              {
              Class.forName("com.mysql.jdbc.Driver");
           
            
             out.write("<form action=\"answerquiz100.jsp\" method=\"get\">");
             index=1;
              rs=stmt.executeQuery("select * from questions  order by RAND() LIMIT 100");
             
             while(rs.next()&&index<=50)
             {
                 out.write("<div class=\"well\">");
                 out.write("<table class=\"table table-border\" ");
                 out.write("<th>");
                 out.write(Integer.toString(index)+".  "+rs.getString("ques"));
                 out.write("</th>");
                 out.write("<tr>");
                 out.write("<td>");
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"A\">"+rs.getString("opa")+"</input>");
                 out.write("</td>");
                  out.write("</tr>");
                    out.write("<tr>");
                 out.write("<td>");
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"B\">"+rs.getString("opb")+"</input>");
                 out.write("</td>");
                 out.write("</tr>");
                  out.write("<tr>");
                  out.write("<td>"); 
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"C\">"+rs.getString("opc")+"</input>");
                 out.write("</td>");  
                 out.write("</tr>");
                 out.write("<tr>");
                  out.write("<td>");  
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"D\">"+rs.getString("opd")+"</input>");  out.write("<tr>");
                 out.write("</td>");  out.write("</tr>");
                 out.write("</table>");
                 out.write("</div>");
                 request.getSession().setAttribute(Integer.toString(index), rs.getString("ans"));
                 request.getSession().setAttribute(Integer.toString(index)+Integer.toString(index), rs.getString("disc"));
                 arr[index-1]=rs.getInt("id");
                 index++;
                 
             }
             request.getSession().setAttribute("arr", arr);
            request.getSession().setAttribute("no", index-1);
            request.getSession().setAttribute("quiz", "quiz100");
              }catch(Exception e)
              {
                  out.write("<div class=\"well\">");
              out.write(e.getMessage());
              out.write("</div>");
              
              
              }
              
           
      out.write("\n");
      out.write("           <input type=\"submit\" class=\"form-control pull-right btn-danger\" style=\"width: 70px;margin-right: 50px;\" value=\"Submit\" id=\"submit\">\n");
      out.write("           \n");
      out.write("    </form>\n");
      out.write("               \n");
      out.write("           <div class=\"well text-center\" style=\"margin-top: 100px;\">\n");
      out.write("               <h3>AKSOFT Group of Engineers</h3>\n");
      out.write("           </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

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

public final class answerquiz50_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;\" >\n");
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
      out.write("      \n");
      out.write("      <button type=\"submit\" class=\"btn btn-danger\">Exit</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("          <div class=\"well text-center\">\n");
      out.write("              <h2> Answers</h2>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <form action=\"user.jsp\" method=\"get\">\n");
      out.write("          ");

              try
              {
                  
              int id=Integer.parseInt(request.getSession().getAttribute("id").toString());
              Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs;
             int arr[]=(int[])request.getSession().getAttribute("arr");
             int right=0;
             int wrong=0;
             out.write("<div class=\"well\">");
              out.write("<h2>Test request.getSession.getAttribute(\"no\")</h2>");
              out.write("</div>");
             for(int index=1;index<=(Integer)request.getSession().getAttribute("no");index++)
             {
                 out.write("<div class=\"well\">");
              out.write("<h2>Test</h2>");
              out.write("</div>");
                 
                 rs=stmt.executeQuery("select * from questions where id ="+Integer.toString(arr[index-1]));
                 rs.next();
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
                 if(request.getSession().getAttribute("quiz").equals("quiz50")||request.getSession().getAttribute("quiz").equals("quiz100")||request.getSession().getAttribute("quiz").equals("quiz200"))
                 {
                if(rs.getString("ans").equals(request.getParameter(Integer.toString(index).toString())))
                 {
                 out.write("<tr>");
                  out.write("<td>"); 
                 out.write("<label class=\"form-control btn-success\">Right Answer</label>");
                 out.write("</td>");  
                 out.write("</tr>");
                 right++;
                 
                 }
                 else
                 {
                     out.write("<tr>");
                  out.write("<td>"); 
                 out.write("<label class=\"form-control btn-danger\">Wrong Answer</label>");
                 out.write("</td>");  
                 out.write("</tr>");
                 wrong++;
                 }
                   out.write("<tr>");
                  out.write("<td>"); 
                 out.write("Your ans.  "+request.getParameter(Integer.toString(index)));
                 out.write("</td>");  
                 out.write("</tr>");}
                out.write("<tr>");
                  out.write("<td>"); 
                 out.write("Correct ans.  "+rs.getString("ans"));
                 out.write("</td>");  
                 out.write("</tr>");
               
                 out.write("<tr>");
                 out.write("<td>");
                 out.write("Discription.  "+rs.getString("disc"));
                 out.write("</td>");
                 out.write("</tr>");
                 
                 
                 out.write("</table>");
                 out.write("</div>");
               
             }
             out.write("<div class=\"well text-center  btn-danger\" style=\"color:black\"> ");
             out.write("<h2>"+Integer.toString(right)+" Right   "+Integer.toString(wrong)+"   Wrong"+"      Your Score is   "+Integer.toString(right)+"</h2>");
             out.write("</div>");
             if(request.getSession().getAttribute("quiz").equals("quiz50"))
             {
              PreparedStatement pst=con.prepareStatement("Update  performace set quiz50=? where id=?");
             pst.setInt(1,right);
             pst.setInt(2, Integer.parseInt(request.getSession().getAttribute("id").toString()));
             pst.executeUpdate();
             }
             else if(request.getSession().getAttribute("quiz").equals("quiz100"))
             {
                  PreparedStatement pst=con.prepareStatement("Update  performace set quiz100=? where id=?");
             pst.setInt(1,right);
             pst.setInt(2, Integer.parseInt(request.getSession().getAttribute("id").toString()));
             pst.executeUpdate();
                 
             }
            else if(request.getSession().getAttribute("quiz").equals("quiz200"))
             {
                  PreparedStatement pst=con.prepareStatement("Update  performace set quiz200=? where id=?");
             pst.setInt(1,right);
             pst.setInt(2, Integer.parseInt(request.getSession().getAttribute("id").toString()));
             pst.executeUpdate();
                 
             }
             
              }catch(Exception e)
              {
                  out.write("<div class=\"well\">");
              out.write(e.getMessage());
              out.write("</div>");
              
              
              }
              
           
      out.write("\n");
      out.write("           <input type=\"submit\" class=\"form-control pull-right btn-danger\" style=\"width: 50px;margin-right: 50px;\" value=\"Next\">\n");
      out.write("           \n");
      out.write("    </form>\n");
      out.write("               <div class=\"well text-center\" style=\"margin-top: 100px;\">\n");
      out.write("               <h3>AKSOFT Group of Engineers</h3>\n");
      out.write("           </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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

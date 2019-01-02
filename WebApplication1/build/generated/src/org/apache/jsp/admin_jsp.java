package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;\">\n");
      out.write("         <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
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
      out.write("      <form class=\"navbar-form navbar-right\" action=\"logout\" style=\"margin-right: 10px;\">\n");
      out.write("      \n");
      out.write("      <button type=\"submit\" class=\"btn btn-danger\">Logout</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      <div class=\"container-fluid text-center\" style=\"margin-top: 50px;color: white;background-color: black;opacity: 0.9\">\n");
      out.write("          <h2>Neclex.Club</h2>\n");
      out.write("          <h4>We teach to care!</h4>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row\" style=\"margin-top: 10px;padding: 30px;\">\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("               <button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px; \" data-toggle=\"modal\" data-target=\"#addquestion\">QUESTION</button>\n");
      out.write("              </div>\n");
      out.write("            <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px\" data-toggle=\"modal\" data-target=\"#adduser\">ADD USER</button></div>\n");
      out.write("              <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;\" data-toggle=\"modal\" data-target=\"#password\"> PASSWORD</button></div>\n");
      out.write("          </div>\n");
      out.write("           <div class=\"row\" style=\"margin-top: 10px;padding: 30px;\">\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("                  <a href=\"show.jsp\" style=\"text-decoration: none;\">      <button href=\"show.jsp\" class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px;hover:none \" data-toggle=\"modal\" data-target=\"#showquestion\">ALL QUESTION</button></a>\n");
      out.write("              </div>\n");
      out.write("            <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px\" data-toggle=\"modal\" data-target=\"#showuser\">SHOW USER</button></div>\n");
      out.write("              <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;\" data-toggle=\"modal\" data-target=\"#delete\"> DELETE</button></div>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"container-fluid text-center\" style=\"height:  500px; color: white;margin-bottom: 0px\">\n");
      out.write("          <h2>Learn through practice</h2>\n");
      out.write("          <p>Caring is as important as curing </p>\n");
      out.write("          \n");
      out.write("          <img  src=\"11.jpg\" class=\" img-circle text-center\"  style=\"width: 200px;height: 200px\">\n");
      out.write("          <div id=\"contact\" class=\"container\" style=\"margin-top: 0px;padding: 0px;\">\n");
      out.write("  <h3 class=\"text-center\">Contact</h3>\n");
      out.write("  <p class=\"text-center\"><em>We love our Students!</em></p>\n");
      out.write("  <div class=\"row test\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <p>Student? Drop a note.</p>\n");
      out.write("      <p><span class=\"glyphicon glyphicon-map-marker\"></span>Address Sector 78 , Rattan professional education college, sohana.</p>\n");
      out.write("      <p><span class=\"glyphicon glyphicon-phone\"></span>Phone: +91 7646000028</p>\n");
      out.write("      <p><span class=\"glyphicon glyphicon-envelope\"></span>Email: mail@mail.com</p> \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("       <form action=\"enquiry\">\n");
      out.write("              \n");
      out.write("        <div class=\"col-sm-6 form-group\">\n");
      out.write("          <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" type=\"text\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 form-group\">\n");
      out.write("          <input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" type=\"email\" required>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      <textarea class=\"form-control\" id=\"comments\" name=\"comments\" placeholder=\"Comment\" rows=\"5\"></textarea>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12 form-group\">\n");
      out.write("            <button class=\"btn pull-right btn-danger\" type=\"submit\" style=\"margin-top: 10px;\">Send</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("       </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"well text-center\" style=\"margin-top: 100px;\"><h4>AKSOFT Group of Engineers</h4></div>\n");
      out.write("      <div id=\"addquestion\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">ADD QUESTION</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"addquestion\" method=\"post\">\n");
      out.write("              <input type=\"text\" name=\"question\" class=\"form-control\" placeholder=\"Quesion\" style=\"margin: 10px;\">\n");
      out.write("              <input type=\"text\" name=\"opa\" class=\"form-control\" placeholder=\"Option A\" style=\"margin: 10px;\">\n");
      out.write("              <input type=\"text\" name=\"opb\" class=\"form-control\" placeholder=\"Option B\" style=\"margin: 10px;\">\n");
      out.write("              <input type=\"text\" name=\"opc\" class=\"form-control\" placeholder=\"Option C\" style=\"margin: 10px;\">\n");
      out.write("              <input type=\"text\" name=\"opd\" class=\"form-control\" placeholder=\"Option D\" style=\"margin: 10px;\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("  <label for=\"sel1\">Correct Answer:</label>\n");
      out.write("  <select class=\"form-control\" id=\"sel1\" name=\"ans\">\n");
      out.write("    <option>A</option>\n");
      out.write("    <option>B</option>\n");
      out.write("    <option>C</option>\n");
      out.write("    <option>D</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("  <label for=\"sel1\">level:</label>\n");
      out.write("  <select class=\"form-control\" id=\"sel1\" name=\"level\">\n");
      out.write("    <option>1</option>\n");
      out.write("    <option>2</option>\n");
      out.write("    <option>3</option>\n");
      out.write("    \n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("              <input type=\"text\" name=\"desc\" class=\"form-control\" placeholder=\"description\" style=\"margin: 10px;\">\n");
      out.write("          <button type=\"Submit\" class=\"form-control btn-danger\" style=\"margin: 10px;\">ADD</button>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      <div id=\"adduser\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">ADD USER</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"adduser\" method=\"post\">\n");
      out.write("              <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"name\" style=\"margin: 10px;\">\n");
      out.write("               <input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"email\" style=\"margin: 10px;\">\n");
      out.write("          <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"password\" style=\"margin: 10px;\">\n");
      out.write("          <button type=\"Submit\" class=\"form-control btn-danger\" style=\"margin: 10px;\">ADD</button>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      <div id=\"password\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">CHANGE PASSWORD</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"changepassword\" method=\"post\">\n");
      out.write("           <input type=\"text\" name=\"prev\" class=\"form-control\" placeholder=\"Previous password\" style=\"margin: 10px;\">\n");
      out.write("          <input type=\"text\" name=\"new\" class=\"form-control\" placeholder=\"New password\" style=\"margin: 10px;\">\n");
      out.write("          <button type=\"Submit\" class=\"form-control btn-danger\" style=\"margin: 10px;\">Change</button>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       <div id=\"showuser\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">All Users</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <table class=\"table table-border table stripped\">\n");
      out.write("              <thead>\n");
      out.write("               <th>ID</th>\n");
      out.write("              <th>Name</th>\n");
      out.write("              <th>Email</th>\n");
      out.write("               <th>Password</th>\n");
      out.write("               \n");
      out.write("                  \n");
      out.write("              </thead>\n");
      out.write("              ");
 
                  PrintWriter pw=response.getWriter();
               Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select * from users");  
              while(rs.next())
              {
                  out.write("<tr>");
                  out.write("<td>"+rs.getInt("id")+"</td>");
                   out.write("<td>"+rs.getString("name")+"</td>");
                    out.write("<td>"+rs.getString("email")+"</td>");
                     out.write("<td>"+rs.getString("password")+"</td>");
                      
                           out.write("/<tr>");
                          
              }
              
              
              
      out.write("\n");
      out.write("          </table>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  <div id=\"delete\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">Delete user or question by id</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"delete\" method=\"post\">\n");
      out.write("              <input type=\"text\" name=\"id\" class=\"form-control\" placeholder=\"ID\" style=\"margin: 10px;\">\n");
      out.write("           <label for=\"sel1\">Select one</label>\n");
      out.write("  <select class=\"form-control\" id=\"sel1\" name=\"type\">\n");
      out.write("    <option>User</option>\n");
      out.write("    <option>Question</option>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </select>\n");
      out.write("          <button type=\"Submit\" class=\"form-control btn-danger\" style=\"margin: 10px;\">DELETE</button>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverManager;
import utility.Qobject;
import java.sql.Connection;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;\">\n");
      out.write("        ");

            try
            {
            Qobject temp;
            ArrayList<Integer> arr=new ArrayList<Integer>();
            ArrayList<Qobject> easy=new ArrayList<Qobject>();
            ArrayList<Qobject> medium=new ArrayList<Qobject>();
            ArrayList<Qobject> hard=new ArrayList<Qobject>();
             Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select * from questions where level=1 order by rand() limit 250 ");
             //System.out.println("hello");
             int c=0;
             while(rs.next())
             {
                 temp=new Qobject();
                 temp.setId(rs.getInt("id"));
                 temp.setQ(rs.getString("ques"));
                 temp.setOpa(rs.getString("opa"));
                 temp.setOpb(rs.getString("opb"));
                 temp.setOpc(rs.getString("opc"));
                 temp.setOpd(rs.getString("opd"));
                 temp.setAns(rs.getString("ans"));
                 temp.setDisc(rs.getString("disc"));
                 temp.setLevel(rs.getInt("level"));
                 easy.add(temp);
                 c++;
             }
            
             request.getSession().setAttribute("easy", easy);
              rs=stmt.executeQuery("select * from questions where level=2  order by rand() limit 250");
               while(rs.next())
             {
                  temp=new Qobject();
                 temp.setId(rs.getInt("id"));
                 temp.setQ(rs.getString("ques"));
                 temp.setOpa(rs.getString("opa"));
                 temp.setOpb(rs.getString("opb"));
                 temp.setOpc(rs.getString("opc"));
                 temp.setOpd(rs.getString("opd"));
                 temp.setAns(rs.getString("ans"));
                 temp.setDisc(rs.getString("disc"));
                 temp.setLevel(rs.getInt("level"));
                 medium.add(temp);
             }
             request.getSession().setAttribute("medium", medium);
             rs=stmt.executeQuery("select * from questions where level=3");
              while(rs.next())
             {
                  temp=new Qobject();
                 temp.setId(rs.getInt("id"));
                 temp.setQ(rs.getString("ques"));
                 temp.setOpa(rs.getString("opa"));
                 temp.setOpb(rs.getString("opb"));
                 temp.setOpc(rs.getString("opc"));
                 temp.setOpd(rs.getString("opd"));
                 temp.setAns(rs.getString("ans"));
                 temp.setDisc(rs.getString("disc"));
                 temp.setLevel(rs.getInt("level"));
                 hard.add(temp);
             }
             
             request.getSession().setAttribute("hard",hard);
             request.getSession().setAttribute("arr",arr);
             request.getSession().setAttribute("qno", 1);
             
             request.getSession().setAttribute("wrong", 0);
             request.getSession().setAttribute("right", 0);
             request.getSession().setAttribute("level","easy");
            }catch(Exception e)
            {
                 response.getWriter().write("<div class=\"well\">");
              response.getWriter().write(e.getMessage());
              response.getWriter().write("</div>");        }
             
            
      out.write("\n");
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
      out.write("                  <a href=\"practice.jsp\" style=\"text-decoration: none;\" >  <button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px; \" >PRACTICE</button>\n");
      out.write("              </div>\n");
      out.write("          <a href=\"quiz50.jsp\" style=\"text-decoration: none;\" >    <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px\"  >QUIZ 50</button></div>\n");
      out.write("            <a href=\"quiz100.jsp\" style=\"text-decoration: none;\"  >    <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;\"  > QUIZ 100</button></div>\n");
      out.write("          </div>\n");
      out.write("           <div class=\"row\" style=\"margin-top: 10px;padding: 30px;\">\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("                  <a href=\"quiz200.jsp\" style=\"text-decoration: none;\">      <button href=\"show.jsp\" class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px;hover:none \" >QUIZ 200</button></a>\n");
      out.write("              </div>\n");
      out.write("         <a href=\"level75.jsp\" style=\"text-decoration: none;\"  >     <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px\" >LEVEL 75</button></div>\n");
      out.write("             <a href=\"level265.jsp\"  style=\"text-decoration: none;\" >   <div class=\"col-sm-4\"><button class=\"form-control btn-danger\" style=\"width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;\" > LEVEL 265</button></a></div>\n");
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

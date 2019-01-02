package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;
import utility.Qobject;

public final class level75_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" •••••••content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            var d= 60;\n");
      out.write("            var x = setInterval(function() {\n");
      out.write("                var m=Math.floor(d/60);\n");
      out.write("                var s=d%60;\n");
      out.write("                d=d-1;\n");
      out.write("            document.getElementById(\"t\").innerHTML = s+\"S\";\n");
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
      out.write("      <div class=\"container-fluid\">\n");
      out.write("          <div class=\"well text-center\">\n");
      out.write("             <h2>Level quiz 75<span class=\"btn-danger pull-right\" style=\"padding: 5px;\">");
 
                  int id=Integer.parseInt(request.getSession().getAttribute("id").toString());
                
      out.write("</span></h2>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <form action=\"level75.jsp\" method=\"get\" name=\"refreshForm\">\n");
      out.write("          <input type=\"hidden\" name=\"visited\" value=\"\">\n");
      out.write("          ");
 
              int index=1;
              try
              {
                  
               ArrayList<Qobject> al;
              ArrayList<Integer> arr;
              Qobject t=new Qobject();
                int i=1;
                int r=Integer.parseInt(request.getSession().getAttribute("right").toString());
                int w=Integer.parseInt(request.getSession().getAttribute("wrong").toString());

              if((Integer)request.getSession().getAttribute("qno")==6)
              {
                  if(request.getParameter("1")==null)
                  {
                  
                  w++;
                  
                  }
                  else if(request.getParameter("1").equals(request.getSession().getAttribute("ansl").toString()))
                  {
                      r++;
                  }
                  else
                  {
                      w++;
                  }
                    arr=(ArrayList<Integer>)request.getSession().getAttribute("arr");
                  int array[]=new int[arr.size()];
                  for(int ii=0;ii<arr.size();ii++)
                  {
                      array[ii]=arr.get(ii);
                      
                  }
                  request.getSession().setAttribute("arr", array);
                  request.getSession().setAttribute("no",arr.size());
                  Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();
             PreparedStatement ps=con.prepareStatement("update performace set level75=? where id=?");
             ps.setInt(1, r);;
             ps.setInt(2, Integer.parseInt(request.getSession().getAttribute("id").toString()));
             ps.executeUpdate();
             ResultSet rs=stmt.executeQuery("select level75 from performace where id="+Integer.toString(id)); 
             rs.next();
              index=rs.getInt("level75");
            //request.getSession().setAttribute("arr",(int[])request.getSession().getAttribute("arr"));
              //request.getSession().setAttribute("no",request.getSession().getAttribute("qno"));
                  out.write("<form action=\"answerquiz50.jsp\" >");
                  out.write("<div class=\"well text-center\" style=\"height:500px\">");
                  out.write("<h2>"+Integer.toString(r)+"  Right  " +Integer.toString(w)+"  Wrong      Your score is  "+Integer.toString(r)+"</h2>");
                  out.write("<h2>High Score: "+Integer.toString(index)+"</h2>"); 
                  out.write("<a href=\"answerquiz50.jsp\"><input type=\"button\" class=\"btn btn-danger pull-right\" value=\"Discription\"></a>");
                  out.write("</div");
                  out.write("</form");
                  request.getSession().setAttribute("right", r);
                  request.getSession().setAttribute("wrong", w);
              }
              else if((Integer)(request.getSession().getAttribute("wrong"))>=6)
              {
                  out.write("<div class=\"well text-center\"  style=\"height:500px;color:red\">");
                  out.write("<h2 class=\btn-danger\" >You are wrong consecutively seven times</h2>");
                  out.write("</div");
              
              
              }
              
              else{
                   index=1;
                  if((Integer)request.getSession().getAttribute("qno")==1)
                  {
                  al=(ArrayList<Qobject>)request.getSession().getAttribute("easy");
                   t=al.get(0);
                          al.remove(0);
                  }
                  else if(request.getParameter("1")==null)
                  {
                       al=(ArrayList<Qobject>)request.getSession().getAttribute("easy");
                   t=al.get(0);
                          al.remove(0);
                          request.getSession().setAttribute("level", "easy");
                          Integer ix=(Integer) request.getSession().getAttribute("wrong");
                     request.getSession().setAttribute("wrong", ix+1);
                        
                  }
                  else if(request.getParameter("1").equals(request.getSession().getAttribute("ansl").toString()))
                  {
                      if(request.getSession().getAttribute("level").equals("easy"))
                      {
                          al=(ArrayList<Qobject>)request.getSession().getAttribute("medium");
                          request.getSession().setAttribute("level", "medium");
                          t=al.get(0);
                          al.remove(0);
                          request.getSession().setAttribute("medium", al);
                          
                      }
                      else
                      {
                      al=(ArrayList<Qobject>)request.getSession().getAttribute("hard");
                      request.getSession().setAttribute("level", "hard");
                      t=al.get(0);
                          al.remove(0);
                          request.getSession().setAttribute("hard", al);
                      }
                      
                     Integer ix=(Integer) request.getSession().getAttribute("right");
                     request.getSession().setAttribute("right", ix+1);
                  }
                  else
                  {
                    if(request.getSession().getAttribute("level").equals("hard"))
                      {
                          al=(ArrayList<Qobject>)request.getSession().getAttribute("medium");
                          request.getSession().setAttribute("level", "medium");
                          t=al.get(0);
                          al.remove(0);
                          request.getSession().setAttribute("medium", al);
                      }
                      else
                      {
                      al=(ArrayList<Qobject>)request.getSession().getAttribute("easy");
                      request.getSession().setAttribute("level", "easy");
                      t=al.get(0);
                          al.remove(0);
                          request.getSession().setAttribute("easy", al);
                      }
                      
                  Integer ix=(Integer) request.getSession().getAttribute("wrong");
                     request.getSession().setAttribute("wrong", ix+1);
                  
                  
                  
                  }
                 
                 index=1;
                 
                 
                // rs.next();
                 out.write("<div class=\"well\">");
                 out.write("<h4 class=\"btn-succes\">Level   :"+t.getLevel()+"</h4>");
                 out.write("<table class=\"table table-border\" ");
                 out.write("<th>");
                 out.write(request.getSession().getAttribute("qno")+".  "+t.getQ());
                 out.write("</th>");
                 out.write("<tr>");
                 out.write("<td>");
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"A\">"+t.getOpa()+"</input>");
                 out.write("</td>");
                  out.write("</tr>");
                    out.write("<tr>");
                 out.write("<td>");
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"B\">"+t.getOpb()+"</input>");
                 out.write("</td>");
                 out.write("</tr>");
                  out.write("<tr>");
                  out.write("<td>"); 
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"C\">"+t.getOpc()+"</input>");
                 out.write("</td>");  
                 out.write("</tr>");
                 out.write("<tr>");
                  out.write("<td>");  
                 out.write("<input type=\"radio\" name=\""+Integer.toString(index)+"\"value=\"D\">"+t.getOpd()+"</input>");  out.write("<tr>");
                 out.write("</td>");  out.write("</tr>");
                 out.write("</table>");
                 out.write("</div>");
                 request.getSession().setAttribute("ansl", t.getAns());
                 request.getSession().setAttribute((request.getSession().getAttribute("qno").toString()), t.getAns());
                 //request.getSession().setAttribute(Integer.toString(index)+Integer.toString(index), rs.getString("disc"));
                 arr=(ArrayList)request.getSession().getAttribute("arr");
                 arr.add(t.getId());
                 i++;
                 //request.getSession().setAttribute("arr", arr);
                 Integer ix=(Integer) request.getSession().getAttribute("qno");
                     request.getSession().setAttribute("qno", ix+1);
                 
             }
             
           // request.getSession().setAttribute("no", index-1);
             request.getSession().setAttribute("quiz", "level75");
              
              }catch(Exception e) 
              {
                  response.getWriter().write("<div class=\"well\">");
              response.getWriter().write(e.getMessage());
              response.getWriter().write("</div>");
              System.out.println(e.getMessage());
              
              
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

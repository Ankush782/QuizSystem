<%-- 
    Document   : practice.jsp
    Created on : 29 Dec, 2018, 6:18:30 PM
    Author     : ankush
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: black;" >
        <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">NECLEX.CLUB</a>
    </div>
    
      <ul class="nav navbar-nav">
          <li class="active"><a href="#"><% out.print("Hello "+request.getSession().getAttribute("name")); %></a></li>
      </ul>
      <form class="navbar-form navbar-right" action="user.jsp" style="margin-right: 10px;">
      
      <button type="submit" class="btn btn-danger">Exit</button>
    </form>
  </div>
</nav>
      <div class="container-fluid">
          <div class="well text-center">
              <h2> Answers</h2>
          </div>
      </div>
      <form action="practice.jsp" method="get">
          <%
              try
              {
              int id=Integer.parseInt(request.getSession().getAttribute("id").toString());
              Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select practice from performace where id="+Integer.toString(id)); 
             rs.next();
             int index=rs.getInt("practice");
            int q=index;
             rs=stmt.executeQuery("select * from questions where id>"+Integer.toString(index)+" order by id");
             rs.next();
             out.write("<form action=\"practice.jsp\" method=\"get\">");
             index=1;
             while(rs.next()&&index<=10)
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
                   out.write("<tr>");
                  out.write("<td>"); 
                 out.write("Your ans.  "+request.getParameter(Integer.toString(index)));
                 out.write("</td>");  
                 out.write("</tr>");
                out.write("<tr>");
                  out.write("<td>"); 
                 out.write("Correct ans.  "+request.getSession().getAttribute(Integer.toString(index)));
                 out.write("</td>");  
                 out.write("</tr>");
               
                 out.write("<tr>");
                 out.write("<td>");
                 out.write("Discription.  "+request.getSession().getAttribute(Integer.toString(index)+Integer.toString(index)).toString());
                 out.write("</tr>");
                 out.write("</td>");
                 out.write("</table>");
                 out.write("</div>");
                 index+=1;
             }
              PreparedStatement pst=con.prepareStatement("Update  performace set practice=? where id=?");
             pst.setInt(1,Integer.parseInt(request.getSession().getAttribute("no").toString()));
             pst.setInt(2, Integer.parseInt(request.getSession().getAttribute("id").toString()));
             pst.executeUpdate();
              }catch(Exception e)
              {
                  out.write("<div class=\"well\">");
              out.write(e.getMessage());
              out.write("</div>");
              
              
              }
              
           %>
           <input type="submit" class="form-control pull-right btn-danger" style="width: 50px;margin-right: 50px;" value="Next">
           
    </form>
               <div class="well text-center" style="margin-top: 100px;">
               <h3>AKSOFT Group of Engineers</h3>
           </div>
    </body>

    </body>
</html>

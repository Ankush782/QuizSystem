<%-- 
    Document   : show
    Created on : 26 Dec, 2018, 6:15:20 PM
    Author     : ankush
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <table class="table table-hover"  >
                <% 
                    PrintWriter po=response.getWriter();
                    try
                    {
                 Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select * from questions"); 
               while(rs.next())
               {
                   po.write("<tr>");
                   po.write("<div class=\"well\">");
                   po.write("<table class=\"table table-bordered\">");
                   po.write("<th>");
                   po.write(rs.getInt("id")+".   ");
                   po.write(rs.getString("ques"));
                   po.write("</th>");
                   po.write("<tr>");
                   po.write("<td>");
                   po.write("A.  "+rs.getString("opa"));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("<tr>");
                    po.write("<td>");
                   po.write("B.  "+rs.getString("opb"));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("<tr>");
                    po.write("<td>");
                   po.write("C.  "+rs.getString("opc"));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("<tr>");
                    po.write("<td>");
                   po.write("D. "+rs.getString("opd"));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("<tr>");
                    po.write("<td>");
                   po.write("Answer.  "+rs.getString("ans"));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("<tr>");
                    po.write("<td>");
                   po.write("Level.  "+Integer.toString(rs.getInt("level")));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("<tr>");
                    po.write("<td>");
                   po.write("Discription. "+rs.getString("disc"));
                    po.write("</td>");
                   po.write("</tr>");
                   po.write("</table>");
                   
                   
                   po.write("</div>");
                   po.write("</tr>");
               }
                    }catch(Exception e)
                    {
                        response.getWriter().write(e.getMessage());
                    }
                
                
                %>
            </table>
            
        </div>
    </body>
</html>

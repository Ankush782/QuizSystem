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
      <form action="user.jsp" method="get">
          <%
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
            
             for(int index=1;index<=(Integer)request.getSession().getAttribute("no");index++)
             {
                 
                 
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
             if(request.getSession().getAttribute("quiz").equals("quiz50")||request.getSession().getAttribute("quiz").equals("quiz100")||request.getSession().getAttribute("quiz").equals("quiz200"))
             {
                 out.write("<div class=\"well text-center  btn-danger\" style=\"color:black\"> ");
             out.write("<h2>"+Integer.toString(right)+" Right   "+Integer.toString(wrong)+"   Wrong"+"      Your Score is   "+Integer.toString(right)+"</h2>");
             out.write("</div>");
             }
             else{
             out.write("<div class=\"well text-center  btn-danger\" style=\"color:black\"> ");
             out.write("<h2>"+Integer.toString((Integer)request.getSession().getAttribute("right"))+" Right   "+Integer.toString((Integer)request.getSession().getAttribute("wrong"))+"   Wrong"+"      Your Score is   "+Integer.toString((Integer)request.getSession().getAttribute("right"))+"</h2>");
             out.write("</div>");}
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
              
           %>
           <input type="submit" class="form-control pull-right btn-danger" style="width: 50px;margin-right: 50px;" value="Next">
           
    </form>
               <div class="well text-center" style="margin-top: 100px;">
               <h3>AKSOFT Group of Engineers</h3>
           </div>
    </body>

    </body>
</html>

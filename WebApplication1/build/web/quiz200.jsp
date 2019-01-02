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
       
        <script>
            var d= 200*60;
            var x = setInterval(function() {
               var  h=Math.floor(d/3600);
                var m=Math.floor((d%3600)/60);
                var s=d%60;
                d=d-1;
            document.getElementById("t").innerHTML = h+"H:"+m +"M:"+s+"S";
            if (d < 0) {
              clearInterval(x);
              document.getElementById("submit").click();
          }
            
            }, 1000);
         </script>
        
    </head>
    <body style="background-color: black;" window.onbeforeunload="JavaScript:document.getElementById(\"submit\").click()" >
       
         
                    
        <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">NECLEX.CLUB</a>
    </div>
    
      <ul class="nav navbar-nav">
          <li class="active"><a href="#"><% out.print("Hello "+request.getSession().getAttribute("name")); %></a></li>
      </ul>
      <form class="navbar-form navbar-right" action="user.jsp" style="margin-right: 10px;">
          <label class="btn-success form-control" id="t" style="font-size: 20px;;margin-right: 30px;">0</label>
      <button type="submit" class="btn btn-danger">Exit</button>
    </form>
  </div>
</nav>
      <div class="well text-center container-fluid">
          <h2>Quiz 200<span class="btn-danger pull-right" style="padding: 5px;"><% 
                  int id=Integer.parseInt(request.getSession().getAttribute("id").toString());
                  Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select quiz200 from performace where id="+Integer.toString(id)); 
             rs.next();
             int index=rs.getInt("quiz200");
             out.write("High Score: "+Integer.toString(index)); %></span></h2>
      </div>
      <form action="answerquiz50.jsp" method="get" name="refreshForm">
          <input type="hidden" name="visited" value="">
          <%
              int arr[]=new int[50];
              try
              {
              Class.forName("com.mysql.jdbc.Driver");
           
             out.write("<form action=\"answerquiz100.jsp\" method=\"get\">");
             index=1;
             rs=stmt.executeQuery("select * from questions  order by RAND() LIMIT 200");
             
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
            request.getSession().setAttribute("quiz", "quiz200");
              }catch(Exception e)
              {
                  out.write("<div class=\"well\">");
              out.write(e.getMessage());
              out.write("</div>");
              
              
              }
              
           %>
           <input type="submit" class="form-control pull-right btn-danger" style="width: 70px;margin-right: 50px;" value="Submit" id="submit">
           
    </form>
               
           <div class="well text-center" style="margin-top: 100px;">
               <h3>AKSOFT Group of Engineers</h3>
           </div>
    </body>
</html>

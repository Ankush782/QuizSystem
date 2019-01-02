<%-- 
    Document   : user.jsp
    Created on : 25 Dec, 2018, 5:35:53 PM
    Author     : ankush
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="utility.Qobject"%>
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
        <title>JSP Page</title>
    </head>
    <body style="background-color: black;">
        <%
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
             
            %>
         <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">NECLEX.CLUB</a>
    </div>
    
      <ul class="nav navbar-nav">
          <li class="active"><a href="#"><% out.print("Hello "+request.getSession().getAttribute("name")); %></a></li>
      </ul>
      <form class="navbar-form navbar-right" action="logout" style="margin-right: 10px;">
      
      <button type="submit" class="btn btn-danger">Logout</button>
    </form>
  </div>
</nav>
      <div class="container-fluid text-center" style="margin-top: 50px;color: white;background-color: black;opacity: 0.9">
          <h2>Neclex.Club</h2>
          <h4>We teach to care!</h4>
          
          
      </div>
      <div class="container-fluid">
          <div class="row" style="margin-top: 10px;padding: 30px;">
              <div class="col-sm-4">
                  <a href="practice.jsp" style="text-decoration: none;" >  <button class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px; " >PRACTICE</button>
              </div>
          <a href="quiz50.jsp" style="text-decoration: none;" >    <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px"  >QUIZ 50</button></div>
            <a href="quiz100.jsp" style="text-decoration: none;"  >    <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;"  > QUIZ 100</button></div>
          </div>
           <div class="row" style="margin-top: 10px;padding: 30px;">
              <div class="col-sm-4">
                  <a href="quiz200.jsp" style="text-decoration: none;">      <button href="show.jsp" class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px;hover:none " >QUIZ 200</button></a>
              </div>
         <a href="level75.jsp" style="text-decoration: none;"  >     <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px" >LEVEL 75</button></div>
             <a href="level265.jsp"  style="text-decoration: none;" >   <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;" > LEVEL 265</button></a></div>
          
          </div>
      </div>
      <div class="container-fluid text-center" style="height:  500px; color: white;margin-bottom: 0px">
          <h2>Learn through practice</h2>
          <p>Caring is as important as curing </p>
          
          <img  src="11.jpg" class=" img-circle text-center"  style="width: 200px;height: 200px">
          <div id="contact" class="container" style="margin-top: 0px;padding: 0px;">
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>We love our Students!</em></p>
  <div class="row test">
    <div class="col-md-6">
      <p>Student? Drop a note.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Address Sector 78 , Rattan professional education college, sohana.</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +91 7646000028</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: mail@mail.com</p> 
    </div>
    <div class="col-md-6">
      <div class="row">
          <form action="enquiry" method="get">
              
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <div class="row">
        <div class="col-md-12 form-group">
            <button class="btn pull-right btn-danger" type="submit" style="margin-top: 10px;">Send</button>

        </div>
      </div> 
       </form>
    </div>
  </div>
</div>
        </div>
      </div>
      <div class="well text-center" style="margin-top: 100px;"><h4>AKSOFT Group of Engineers</h4></div>
    </body>
</html>

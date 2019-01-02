<%-- 
    Document   : admin
    Created on : 25 Dec, 2018, 5:35:33 PM
    Author     : ankush
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
    <body style="background-color: black;">
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
               <button class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px; " data-toggle="modal" data-target="#addquestion">QUESTION</button>
              </div>
            <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px" data-toggle="modal" data-target="#adduser">ADD USER</button></div>
              <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;" data-toggle="modal" data-target="#password"> PASSWORD</button></div>
          </div>
           <div class="row" style="margin-top: 10px;padding: 30px;">
              <div class="col-sm-4">
                  <a href="show.jsp" style="text-decoration: none;">      <button href="show.jsp" class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px;hover:none " data-toggle="modal" data-target="#showquestion">ALL QUESTION</button></a>
              </div>
            <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding: 20%;color: white;font-size: 30px" data-toggle="modal" data-target="#showuser">SHOW USER</button></div>
              <div class="col-sm-4"><button class="form-control btn-danger" style="width: 100%;height: 100%;padding:20%;color: white;font-size: 30px;" data-toggle="modal" data-target="#delete"> DELETE</button></div>
          
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
       <form action="enquiry">
              
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
      <div id="addquestion" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">ADD QUESTION</h4>
      </div>
      <div class="modal-body">
          <form action="addquestion" method="post">
              <input type="text" name="question" class="form-control" placeholder="Quesion" style="margin: 10px;">
              <input type="text" name="opa" class="form-control" placeholder="Option A" style="margin: 10px;">
              <input type="text" name="opb" class="form-control" placeholder="Option B" style="margin: 10px;">
              <input type="text" name="opc" class="form-control" placeholder="Option C" style="margin: 10px;">
              <input type="text" name="opd" class="form-control" placeholder="Option D" style="margin: 10px;">
              <div class="form-group">
  <label for="sel1">Correct Answer:</label>
  <select class="form-control" id="sel1" name="ans">
    <option>A</option>
    <option>B</option>
    <option>C</option>
    <option>D</option>
  </select>
</div>
              <div class="form-group">
  <label for="sel1">level:</label>
  <select class="form-control" id="sel1" name="level">
    <option>1</option>
    <option>2</option>
    <option>3</option>
    
  </select>
</div>
              <input type="text" name="desc" class="form-control" placeholder="description" style="margin: 10px;">
          <button type="Submit" class="form-control btn-danger" style="margin: 10px;">ADD</button>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
      <div id="adduser" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">ADD USER</h4>
      </div>
      <div class="modal-body">
          <form action="adduser" method="post">
              <input type="text" name="name" class="form-control" placeholder="name" style="margin: 10px;">
               <input type="text" name="email" class="form-control" placeholder="email" style="margin: 10px;">
          <input type="password" name="password" class="form-control" placeholder="password" style="margin: 10px;">
          <button type="Submit" class="form-control btn-danger" style="margin: 10px;">ADD</button>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
      <div id="password" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">CHANGE PASSWORD</h4>
      </div>
      <div class="modal-body">
          <form action="changepassword" method="post">
           <input type="text" name="prev" class="form-control" placeholder="Previous password" style="margin: 10px;">
          <input type="text" name="new" class="form-control" placeholder="New password" style="margin: 10px;">
          <button type="Submit" class="form-control btn-danger" style="margin: 10px;">Change</button>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
       <div id="showuser" class="modal fade" role="dialog">
  <div class="modal-dialog modal-lg">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">All Users</h4>
      </div>
      <div class="modal-body">
          <table class="table table-border table stripped">
              <thead>
               <th>ID</th>
              <th>Name</th>
              <th>Email</th>
               <th>Password</th>
               
                  
              </thead>
              <% 
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
              
              
              %>
          </table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
  <div id="delete" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Delete user or question by id</h4>
      </div>
      <div class="modal-body">
          <form action="delete" method="post">
              <input type="text" name="id" class="form-control" placeholder="ID" style="margin: 10px;">
           <label for="sel1">Select one</label>
  <select class="form-control" id="sel1" name="type">
    <option>User</option>
    <option>Question</option>
    
    
  </select>
          <button type="Submit" class="form-control btn-danger" style="margin: 10px;">DELETE</button>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
    </body>
</html>

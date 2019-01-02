/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ankush
 */
public class addquestion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            String q,a,b,c,d,desc,ans;
            int l;
            q=request.getParameter("question");
            a=request.getParameter("opa");
            b=request.getParameter("opb");
            c=request.getParameter("opc");
            d=request.getParameter("opd");
            desc=request.getParameter("desc");
            ans=request.getParameter("ans");
            l=Integer.parseInt(request.getParameter("level"));
            Class.forName("com.mysql.jdbc.Driver");
             Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing","root","admin");
             PreparedStatement sql=con.prepareStatement("insert into questions(ques,opa,opb,opc,opd,level,disc,ans) values(?,?,?,?,?,?,?,?)");
             sql.setString(1, q);
              sql.setString(2, a);
               sql.setString(3, b);
                sql.setString(4, c);
                 sql.setString(5, d);
                 sql.setInt(6, l);
                 sql.setString(7, desc);
                 sql.setString(8, ans);
                 sql.executeUpdate();
                 request.getRequestDispatcher("admin.jsp").forward(request, response);
        }catch(Exception e)
        {
          response.getWriter().write(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

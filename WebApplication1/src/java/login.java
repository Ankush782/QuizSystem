/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author ankush
 */
public class login extends HttpServlet {

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

        String name, uid, password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing", "root", "admin");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            System.out.println(request.getParameter("id"));
            while (rs.next()) {
                if (request.getParameter("id").equals(rs.getString("email")) && request.getParameter("password").equals(rs.getString("password"))) {
                    if (rs.getString("name").equals("admin")) {
                        request.getSession().setAttribute("id", Integer.toString(rs.getInt("id")));
                        request.getSession().setAttribute("password", request.getParameter("password"));
                        request.getSession().setAttribute("name", "Admin");
                        request.getRequestDispatcher("admin.jsp").forward(request, response);

                    } else {
                        request.getSession().setAttribute("id", Integer.toString(rs.getInt("id")));
                        request.getSession().setAttribute("password", request.getParameter("password"));
                        request.getSession().setAttribute("name", rs.getString("name"));
                        request.getRequestDispatcher("user.jsp").forward(request, response);
                    }
                }
            }
            request.getRequestDispatcher("index.html").include(request, response);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateCriminalDetails extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
            String cid = request.getParameter("cid");
            String fullname = request.getParameter("fullname");
            int age = Integer.parseInt(request.getParameter("age"));
            String crime = request.getParameter("ctype");
            String address =request.getParameter("address");
            String date = request.getParameter("date");
          
    
            
            
             try{
               Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/criminalmanagementsystem","root","mca6");
                PreparedStatement ps = c.prepareStatement("update criminaldetails set Full_Name=?, Age=?, Crime_Type=?, Address=?, Date=? where Criminal_ID=?");
                
                ps.setString(1, fullname);
                ps.setInt(2, age);
                ps.setString(3, crime);
                ps.setString(4, address);
                ps.setString(5, date);
                ps.setString(6, cid);
                
                ps.executeUpdate();
                response.sendRedirect("UpdateSuccess.jsp");
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }

    
    
}

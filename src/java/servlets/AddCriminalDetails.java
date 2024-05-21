package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddCriminalDetails extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                 
       

           
            String criminalid = request.getParameter("cid");
            String fullname = request.getParameter("fullname");
            String age = request.getParameter("age");           
            String crime = request.getParameter("ctype");
            String address = request.getParameter("address");
            String date = request.getParameter("date");
    
 
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/criminalmanagementsystem","root","mca6");
           PreparedStatement ps = c.prepareStatement("insert into criminaldetails(criminal_id, full_name, age, crime_type, address, date) values(?,?,?,?,?,?)");
                
              
                ps.setString(1, criminalid);
                ps.setString(2, fullname);
                ps.setString(3, age);
                ps.setString(4, crime);
                ps.setString(5, address);
                ps.setString(6, date);
               
               
                ps.executeUpdate();
                response.sendRedirect("WorkDonePage.jsp");
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }
    
}

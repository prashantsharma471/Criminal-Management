package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReadCriminalDetails extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String cid = request.getParameter("cid");
          
          
    
            
            
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/criminalmanagementsystem","root","mca6");
                PreparedStatement ps = c.prepareStatement("select*from criminaldetails where criminal_id =?");
                ps.setString(1, cid);
                
        
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6) );
                }
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }

    
    
}



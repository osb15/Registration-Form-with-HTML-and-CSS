package com.Advance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
     	resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	     
	    String firstname = req.getParameter("first-name");
	    String lastname = req.getParameter("last-name");
	    String username = req.getParameter("username");
	    String password = req.getParameter("password");  
	    String gender = req.getParameter("gender");
	    String email = req.getParameter("email");
	    String mobileno = req.getParameter("mobile-no");
	    String dob = req.getParameter("dob");
	    String graduationyear = req.getParameter("graduation-year");
	    String semesters = req.getParameter("semesters");
	    String tenthpercentage = req.getParameter("tenth-percentage");
	    String twelfthpercentage = req.getParameter("twelfth-percentage");
	    String experience = req.getParameter("experience");
	     
	    try {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "57210322S7");

	         String query = "INSERT INTO users (firstname, lastname, username, password, gender, email, mobileno, dob, graduationyear, semesters, tenthpercentage, twelfthpercentage, experience) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	         PreparedStatement ps = c.prepareStatement(query);
	         
	         ps.setString(1, firstname);
	         ps.setString(2, lastname);
	         ps.setString(3, username);
	         ps.setString(4, password);  
	         ps.setString(5, gender);
	         ps.setString(6, email);
	         ps.setString(7, mobileno);
	         ps.setString(8, dob);
	         ps.setString(9, graduationyear);
	         ps.setString(10, semesters);
	         ps.setString(11, tenthpercentage);
	         ps.setString(12, twelfthpercentage);
	         ps.setString(13, experience);
	         
	         int i = ps.executeUpdate();
	         
	         if (i > 0) {
	             out.println("<h1>Successfully Registered</h1>");
	         } else {
	             out.println("<h1>Registration Failed</h1>");
	         }
	         
	         ps.close();
	         c.close();
	             
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();  
		response.setContentType("text/html");
		String name=request.getParameter("name");  //getting inputs from html page
		String password=request.getParameter("password");
		String emailid=request.getParameter("emailid");
		String dob=request.getParameter("dob");
		long mblno=Long.parseLong(request.getParameter("mblno"));
		String url="jdbc:mysql://localhost:3306/register";
		String user="root";
		String pass="pass1234";
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  //loading the driver class
			con=DriverManager.getConnection(url,user,pass);   //checking for connection
			String query = "Insert into registration(name,password,emailid,dob,mblno) values (?,?,?,?,?);";
			PreparedStatement ps=con.prepareStatement(query);  //creating statement and getting input
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, emailid);
			ps.setString(4, dob);
			ps.setLong(5, mblno);
			int x=ps.executeUpdate(); //inserting the value
			if(x==1)
			{
				out.print("Values inserted");
			}
		} 
		catch (ClassNotFoundException | SQLException e)  //catching the exception
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}

}

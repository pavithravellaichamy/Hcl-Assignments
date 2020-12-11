package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet4
 */
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext sc=getServletContext();
		Connection con=(Connection) sc.getAttribute("mycon");  //setting connection
		String id=request.getParameter("student_ID");  //getting parameters
		String name=request.getParameter("student_Name");
		String address=request.getParameter("student_Address");
		long mblno=Long.parseLong(request.getParameter("student_Mobileno"));
		String query = "Insert into student (student_ID,student_Name,student_Address,student_Mobileno) values (?,?,?,?);";  //sql query for insertion
		try 
		{
			PreparedStatement ps=con.prepareStatement(query);  //executing the query
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setLong(4, mblno);
			int i=ps.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rs=request.getRequestDispatcher("./servlet");  //redirecting to another page
				rs.forward(request, response);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

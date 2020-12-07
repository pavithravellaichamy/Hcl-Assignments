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
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
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
		Connection con=(Connection) sc.getAttribute("mycon");  //establishing the connection
		String name=request.getParameter("student_Name");
		String address=request.getParameter("student_Address");
		long mblno=Long.parseLong(request.getParameter("student_Mobileno"));
		String id=request.getParameter("student_ID");
		try 
		{
			PreparedStatement ps=con.prepareStatement("update student set student_Name=?,student_Address=?,student_Mobileno=? where student_ID=?");  //updating the table
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setLong(3, mblno);
			ps.setString(4, id);
			int i=ps.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rs=request.getRequestDispatcher("./servlet");  //redirecting to another page
				rs.forward(request, response);
			}
		}
		catch(SQLException e) 
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

package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext sc=getServletContext();
		Connection con=(Connection) sc.getAttribute("mycon");  //establishing connection
		try 
		{
			PreparedStatement ps=con.prepareStatement("select * from student"); 
			ResultSet rs=ps.executeQuery();
			out.print("<a href='insert.html'>Insert</a><br>");  //link to another page
			out.print("<a href='delete.html'>Delete</a><br>");
			out.print("<a href='update.html'>Update</a><br>");
			while(rs.next())
			{
				out.print(rs.getString(1)+"  |  "+rs.getString(2)+" | "+rs.getString(3)+"  | "+rs.getLong(4)+"<br>"); //displaying the content in table
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

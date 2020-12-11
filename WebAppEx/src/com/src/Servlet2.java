package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String url="jdbc:mysql://localhost:3306/register";
		String user="root";
		String pass="pass1234";
		Connection con=null;
		PrintWriter out=response.getWriter();
		{  
            try
            {
			Class.forName("com.mysql.jdbc.Driver");  //loading the driver class
            con = DriverManager.getConnection(url,user,pass);   //checking for connection
            Statement stmt = con.createStatement();  //creating statement
            ResultSet rs = stmt.executeQuery("select * from registration");  //executing query
            out.println("<table border=0 width=45% height=30%>");  
            out.println("<tr><th>Name</th><th>Password</th><th>Emailid</th><th>DOB</th><th>Mobile Number</th><tr>");  
            while (rs.next()) //iterating through rows in table
            {  
                String name = rs.getString("name");  
                String password = rs.getString("password");  
                String emailid = rs.getString("emailid"); 
                String dob = rs.getString("dob"); 
                long mblno = rs.getLong("mblno");   
                out.println("<tr><td>" + name + "</td><td>" + password + "</td><td>" + emailid + "</td>+<td>" + dob + "</td>"
                		+ "<td>" + mblno + "</td></tr>");   //printing the values
            }  
            out.println("</table>");  
            out.println("</html></body>");   
           } 
		   catch (ClassNotFoundException | SQLException e) //catching the exception
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }  
            finally
            {
            	try {
					con.close();
				} catch (SQLException e) 
            	{
					e.printStackTrace();
				} 
            }
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

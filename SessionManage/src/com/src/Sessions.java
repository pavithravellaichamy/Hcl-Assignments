package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sessions
 */
public class Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sessions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();   
	    String name=request.getParameter("name");  
	    Cookie ck=new Cookie("uname",name);//creating cookie object  
	    response.addCookie(ck); 
	    String password=request.getParameter("password"); 
	    String emailid=request.getParameter("emailid"); 
	    out.print("<form action='Session1'>");
	    out.print("<input type='hidden' name='password' value='"+password+"'>");  //hidden form field
	    out.print("<a href='Session1?emailid="+emailid+"'>go</a>");  //urlrewriting
	    out.print("<input type='submit' value='go to Login'>");  
	    out.print("</form>");  
	          
	    out.close();  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display 
{
	public static void employeeDisplay(DataSource ds,int value) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());  //establishing the connection
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee"); //selection query

		while(rs.next())  //displaying the values in table
		{
			System.out.print(rs.getInt("emp_ID")+" ");
			System.out.print(rs.getString("emp_Name")+" ");
			System.out.print(rs.getInt("emp_Salary"));
			System.out.println(" ");
		}
	}

}

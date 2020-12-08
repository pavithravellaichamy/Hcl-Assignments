package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete 
{
	public static void employeeDelete(DataSource ds,int emp_ID) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());  //establishing the connection
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		int i=st.executeUpdate("delete from Employee where emp_ID="+emp_ID+"");  //query for deletion
        System.out.println("Deleted Successfully");
	}
}

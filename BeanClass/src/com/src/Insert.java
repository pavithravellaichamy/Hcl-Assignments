package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert
{
	public static void employeeAdd(DataSource ds,Employee e) throws SQLException, ClassNotFoundException
	{		
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());  //establishing the connection
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into Employee values("+e.getEmp_ID()+",'"+e.getEmp_Name()+"',"+e.getEmp_Salary()+")");  //inserting content to the table
        System.out.println("Inserted Successfully");
	}
}
